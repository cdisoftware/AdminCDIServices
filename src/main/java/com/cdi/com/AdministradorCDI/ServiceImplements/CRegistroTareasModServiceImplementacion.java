package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.CRegistroTareasModEntity;
import com.cdi.com.AdministradorCDI.Services.CRegistroTareasModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CRegistroTareasModServiceImplementacion implements CRegistroTareasModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertarRegTareasMod(CRegistroTareasModEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertarea = repositorio.createNamedStoredProcedureQuery("paCRegistroTareasMod");
            insertarea.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertarea.registerStoredProcedureParameter("IdActividad", Integer.class, ParameterMode.IN);
            insertarea.registerStoredProcedureParameter("Id_U", Integer.class, ParameterMode.IN);
            insertarea.registerStoredProcedureParameter("Id_Pry", Integer.class, ParameterMode.IN);
            insertarea.registerStoredProcedureParameter("IdTipoTarea", Integer.class, ParameterMode.IN);
            insertarea.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            insertarea.registerStoredProcedureParameter("Tiempo", Integer.class, ParameterMode.IN);
            insertarea.setParameter("Bandera", Bandera);
            insertarea.setParameter("IdActividad", entidad.getIdActividad());
            insertarea.setParameter("Id_U", entidad.getId_U());
            insertarea.setParameter("Id_Pry", entidad.getId_Pry());
            insertarea.setParameter("IdTipoTarea", entidad.getIdTipoTarea());
            insertarea.setParameter("Descripcion", entidad.getDescripcion());
            insertarea.setParameter("Tiempo", entidad.getTiempo());
            insertarea.execute();
            return JSONObject.quote((String) insertarea.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizarRegTareasMod(CRegistroTareasModEntity entidad, Integer Bandera) {
      try {
            StoredProcedureQuery actarea = repositorio.createNamedStoredProcedureQuery("paCRegistroTareasMod");
            actarea.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actarea.registerStoredProcedureParameter("IdActividad", Integer.class, ParameterMode.IN);
            actarea.registerStoredProcedureParameter("Id_U", Integer.class, ParameterMode.IN);
            actarea.registerStoredProcedureParameter("Id_Pry", Integer.class, ParameterMode.IN);
            actarea.registerStoredProcedureParameter("IdTipoTarea", Integer.class, ParameterMode.IN);
            actarea.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            actarea.registerStoredProcedureParameter("Tiempo", Integer.class, ParameterMode.IN);
            actarea.setParameter("Bandera", Bandera);
            actarea.setParameter("IdActividad", entidad.getIdActividad());
            actarea.setParameter("Id_U", entidad.getId_U());
            actarea.setParameter("Id_Pry", entidad.getId_Pry());
            actarea.setParameter("IdTipoTarea", entidad.getIdTipoTarea());
            actarea.setParameter("Descripcion", entidad.getDescripcion());
            actarea.setParameter("Tiempo", entidad.getTiempo());
            actarea.execute();
            return JSONObject.quote((String) actarea.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}



