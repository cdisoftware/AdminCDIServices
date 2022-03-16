package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaDesarollosPendientesEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaDesarollosPendientesService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaDesarollosPendientesServiceImplementacion implements ConsultaDesarollosPendientesService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaDesarollosPendientesEntity> ConsultaDesrrlloPendient(Integer IdIntegrador, Integer IdProyecto) {
        try {
            StoredProcedureQuery consdrr = repositorio.createNamedStoredProcedureQuery("PaConsultaDesarollosPendientes");
            consdrr.registerStoredProcedureParameter("IdIntegrador", Integer.class, ParameterMode.IN);
            consdrr.registerStoredProcedureParameter("IdProyecto", Integer.class, ParameterMode.IN);

            consdrr.setParameter("IdIntegrador", IdIntegrador);
            consdrr.setParameter("IdProyecto", IdProyecto);

            return consdrr.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
