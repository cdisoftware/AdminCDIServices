package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.CRolModEntity;
import com.cdi.com.AdministradorCDI.Services.CRolModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CRolModServiceImplementacion implements CRolModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertaRolMod(CRolModEntity entidad, Integer Bandera, Integer IdUsuario) {
        try {
            StoredProcedureQuery insertRol = repositorio.createNamedStoredProcedureQuery("paCRolMod");
            insertRol.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertRol.registerStoredProcedureParameter("NombreRol", String.class, ParameterMode.IN);
            insertRol.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            insertRol.registerStoredProcedureParameter("IdRol", Integer.class, ParameterMode.IN);
            insertRol.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            insertRol.setParameter("Bandera", Bandera);
            insertRol.setParameter("NombreRol", entidad.getNombreRol());
            insertRol.setParameter("Estado", entidad.getEstado());
            insertRol.setParameter("IdRol", entidad.getIdRol());
            insertRol.setParameter("IdUsuario", IdUsuario);
            insertRol.execute();
            return JSONObject.quote((String) insertRol.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

    @Override
    public String ActualizaRolMod(CRolModEntity entidad, Integer Bandera, Integer IdUsuario) {
        try {
            StoredProcedureQuery ActualizaRol = repositorio.createNamedStoredProcedureQuery("paCRolMod");
            ActualizaRol.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            ActualizaRol.registerStoredProcedureParameter("NombreRol", String.class, ParameterMode.IN);
            ActualizaRol.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            ActualizaRol.registerStoredProcedureParameter("IdRol", Integer.class, ParameterMode.IN);
            ActualizaRol.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            ActualizaRol.setParameter("Bandera", Bandera);
            ActualizaRol.setParameter("NombreRol", entidad.getNombreRol());
            ActualizaRol.setParameter("Estado", entidad.getEstado());
            ActualizaRol.setParameter("IdRol", entidad.getIdRol());
            ActualizaRol.setParameter("IdUsuario", IdUsuario);
            ActualizaRol.execute();
            return JSONObject.quote((String) ActualizaRol.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
