package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.UpdateServicioRealizadoEntity;
import com.cdi.com.AdministradorCDI.Services.UpdateServicioRealizadoService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class UpdateServicioRealizadoServiceImplementacion implements UpdateServicioRealizadoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String UpdateServRealzdo(UpdateServicioRealizadoEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery uptserv = repositorio.createNamedStoredProcedureQuery("PaUpdateServicioRealizado");
            uptserv.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            uptserv.registerStoredProcedureParameter("IdServicio", Integer.class, ParameterMode.IN);
            uptserv.registerStoredProcedureParameter("IdProyecto", Integer.class, ParameterMode.IN);
            uptserv.registerStoredProcedureParameter("FechaSolucion", String.class, ParameterMode.IN);
            uptserv.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);
            uptserv.registerStoredProcedureParameter("DatosServicio", String.class, ParameterMode.IN);
            uptserv.registerStoredProcedureParameter("Observaciones", String.class, ParameterMode.IN);
            uptserv.registerStoredProcedureParameter("ConsumeServicio", String.class, ParameterMode.IN);
            uptserv.registerStoredProcedureParameter("UrlServicio", String.class, ParameterMode.IN);

            uptserv.setParameter("bandera", bandera);
            uptserv.setParameter("IdServicio", entidad.getIdServicios());
            uptserv.setParameter("IdProyecto", entidad.getIdProyecto());
            uptserv.setParameter("FechaSolucion", entidad.getFechaSolucion());
            uptserv.setParameter("Observacion", entidad.getObservacion());
            uptserv.setParameter("DatosServicio", entidad.getDatosServicio());
            uptserv.setParameter("Observaciones", entidad.getObservaciones());
            uptserv.setParameter("ConsumeServicio", entidad.getConsumeServicio());
            uptserv.setParameter("UrlServicio", entidad.getUrlServicio());
            uptserv.execute();
            return null;
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
