package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.EliminaServicioEntity;
import com.cdi.com.AdministradorCDI.Services.EliminaServicioService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class EliminaServicioServiceImplementacion implements EliminaServicioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String EliminaServicio(EliminaServicioEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery rolbackup = repositorio.createNamedStoredProcedureQuery("PaEliminaServicio");
            rolbackup.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("IdServicio", Integer.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("NombreSp", String.class, ParameterMode.IN);
            rolbackup.setParameter("bandera", bandera);
            rolbackup.setParameter("IdServicio", entidad.getIdServicios());
            rolbackup.setParameter("NombreSp", entidad.getStoredProcedures());
            rolbackup.execute();
            return JSONObject.quote((String) rolbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
