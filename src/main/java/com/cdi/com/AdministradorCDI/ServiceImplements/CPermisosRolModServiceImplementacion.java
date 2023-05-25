package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.CPermisosRolModEntity;
import com.cdi.com.AdministradorCDI.Services.CPermisosRolModService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPermisosRolModServiceImplementacion implements CPermisosRolModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ActualizaCPermisosRolMod(CPermisosRolModEntity entidad, Integer Bandera, Integer IdUsuario) {
        try {
            StoredProcedureQuery ActPermisoRol = repositorio.createNamedStoredProcedureQuery("paCPermisosRolMod");
            ActPermisoRol.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            ActPermisoRol.registerStoredProcedureParameter("IdModulo", Integer.class, ParameterMode.IN);
            ActPermisoRol.registerStoredProcedureParameter("IdRol", Integer.class, ParameterMode.IN);
            ActPermisoRol.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            ActPermisoRol.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            ActPermisoRol.setParameter("Bandera", Bandera);
            ActPermisoRol.setParameter("IdModulo", entidad.getIdModulo());
            ActPermisoRol.setParameter("IdRol", entidad.getIdRol());
            ActPermisoRol.setParameter("IdUsuario", IdUsuario);
            ActPermisoRol.setParameter("Estado", entidad.getEstado());
            ActPermisoRol.execute();
            return JSONObject.quote((String) ActPermisoRol.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
