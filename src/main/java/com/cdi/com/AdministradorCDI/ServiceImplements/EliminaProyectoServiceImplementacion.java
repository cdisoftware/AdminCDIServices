package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.EliminaProyectoEntity;
import com.cdi.com.AdministradorCDI.Services.EliminaProyectoService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class EliminaProyectoServiceImplementacion implements EliminaProyectoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String EliminaProyect(EliminaProyectoEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery eliminproyc = repositorio.createNamedStoredProcedureQuery("PaEliminaProyecto");
            eliminproyc.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            eliminproyc.registerStoredProcedureParameter("IdProyecto", Integer.class, ParameterMode.IN);
            eliminproyc.registerStoredProcedureParameter("NombreProyecto", String.class, ParameterMode.IN);
            eliminproyc.setParameter("bandera", bandera);
            eliminproyc.setParameter("IdProyecto", entidad.getId_PRY());
            eliminproyc.setParameter("NombreProyecto", entidad.getNombre());
            eliminproyc.execute();
            return JSONObject.quote((String) eliminproyc.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
