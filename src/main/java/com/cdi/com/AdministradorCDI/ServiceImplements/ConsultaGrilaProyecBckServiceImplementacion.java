package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaGrilaProyecBckEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaGrilaProyecBckService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaGrilaProyecBckServiceImplementacion implements ConsultaGrilaProyecBckService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaGrilaProyecBckEntity> ConsultaGrilaProyectBck(Integer IdProyecto) {
        try {
            StoredProcedureQuery consbackup = repositorio.createNamedStoredProcedureQuery("PaConsultaGrilaProyecBck");
            consbackup.registerStoredProcedureParameter("IdProyecto", Integer.class, ParameterMode.IN);
            consbackup.setParameter("IdProyecto", IdProyecto);
            return consbackup.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
