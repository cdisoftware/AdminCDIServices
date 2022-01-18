package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaServidoresEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaServidoresService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServidoresServiceImplementacion implements ConsultaServidoresService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaServidoresEntity> ConsultaServ(Integer bandera) {
        try {
            StoredProcedureQuery conservid = repositorio.createNamedStoredProcedureQuery("paConsultaServidores");
            conservid.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            conservid.setParameter("bandera", bandera);
            return conservid.getResultList();
        } catch (Exception e) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
