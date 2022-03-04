package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.InsertaServicioEntity;
import com.cdi.com.AdministradorCDI.Services.InsertaServicioService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class InsertaServicioServiceImplementacion implements InsertaServicioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertaServicio(InsertaServicioEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery insertserv = repositorio.createNamedStoredProcedureQuery("PaInsertaServicio");
            insertserv.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("IdServicios", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("IdProyecto", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("FechaAsignacion", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("IdIntegrador", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("StoredProcedures", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("EXEC_SP", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("TipoServicio", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("IdUsuarioAsigna", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("Observaciones", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("Prioridad", String.class, ParameterMode.IN);

            insertserv.setParameter("bandera", bandera);
            insertserv.setParameter("IdServicios", entidad.getIdServicios());
            insertserv.setParameter("IdProyecto", entidad.getIdProyecto());
            insertserv.setParameter("FechaAsignacion", entidad.getFechaAsignacion());
            insertserv.setParameter("IdIntegrador", entidad.getIdIntegrador());
            insertserv.setParameter("StoredProcedures", entidad.getStoredProcedures());
            insertserv.setParameter("EXEC_SP", entidad.getEXEC_SP());
            insertserv.setParameter("TipoServicio", entidad.getTipoServicio());
            insertserv.setParameter("Estado", entidad.getEstado());
            insertserv.setParameter("IdUsuarioAsigna", entidad.getIdUsuarioAsigna());
            insertserv.setParameter("Observacion", entidad.getObservacion());
            insertserv.setParameter("Observaciones", entidad.getObservaciones());
            insertserv.setParameter("Prioridad", entidad.getPrioridad());

            insertserv.execute();
            return JSONObject.quote((String) insertserv.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

    @Override
    public String ActualizaServicio(InsertaServicioEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery actserv = repositorio.createNamedStoredProcedureQuery("PaInsertaServicio");
            actserv.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            actserv.registerStoredProcedureParameter("IdServicios", Integer.class, ParameterMode.IN);
            actserv.registerStoredProcedureParameter("IdProyecto", Integer.class, ParameterMode.IN);
            actserv.registerStoredProcedureParameter("FechaAsignacion", String.class, ParameterMode.IN);
            actserv.registerStoredProcedureParameter("IdIntegrador", Integer.class, ParameterMode.IN);
            actserv.registerStoredProcedureParameter("StoredProcedures", String.class, ParameterMode.IN);
            actserv.registerStoredProcedureParameter("EXEC_SP", String.class, ParameterMode.IN);
            actserv.registerStoredProcedureParameter("TipoServicio", String.class, ParameterMode.IN);
            actserv.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            actserv.registerStoredProcedureParameter("IdUsuarioAsigna", Integer.class, ParameterMode.IN);
            actserv.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);
            actserv.registerStoredProcedureParameter("Observaciones", String.class, ParameterMode.IN);
            actserv.registerStoredProcedureParameter("Prioridad", String.class, ParameterMode.IN);

            actserv.setParameter("bandera", bandera);
            actserv.setParameter("IdServicios", entidad.getIdServicios());
            actserv.setParameter("IdProyecto", entidad.getIdProyecto());
            actserv.setParameter("FechaAsignacion", entidad.getFechaAsignacion());
            actserv.setParameter("IdIntegrador", entidad.getIdIntegrador());
            actserv.setParameter("StoredProcedures", entidad.getStoredProcedures());
            actserv.setParameter("EXEC_SP", entidad.getEXEC_SP());
            actserv.setParameter("TipoServicio", entidad.getTipoServicio());
            actserv.setParameter("Estado", entidad.getEstado());
            actserv.setParameter("IdUsuarioAsigna", entidad.getIdUsuarioAsigna());
            actserv.setParameter("Observacion", entidad.getObservacion());
            actserv.setParameter("Observacion", entidad.getObservacion());
            actserv.setParameter("Prioridad", entidad.getPrioridad());

            actserv.execute();
            return JSONObject.quote((String) actserv.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
