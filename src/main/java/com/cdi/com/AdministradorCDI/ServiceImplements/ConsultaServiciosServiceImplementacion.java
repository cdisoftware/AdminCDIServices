package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaServiciosEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaServiciosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServiciosServiceImplementacion implements ConsultaServiciosService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaServiciosEntity> ConsultaServicios(Integer IdProyecto, String TipoServicio, String Prioridad, String NombreSp) {
        try {
            StoredProcedureQuery conservicios = repositorio.createNamedStoredProcedureQuery("PaConsultaServicios");
            conservicios.registerStoredProcedureParameter("IdProyecto", Integer.class, ParameterMode.IN);
            conservicios.registerStoredProcedureParameter("TipoServicio", String.class, ParameterMode.IN);
            conservicios.registerStoredProcedureParameter("Prioridad", String.class, ParameterMode.IN);
            conservicios.registerStoredProcedureParameter("NombreSp", String.class, ParameterMode.IN);
            conservicios.setParameter("IdProyecto", IdProyecto);
            conservicios.setParameter("TipoServicio", TipoServicio);
            conservicios.setParameter("Prioridad", Prioridad);
            conservicios.setParameter("NombreSp", NombreSp);
            return conservicios.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
