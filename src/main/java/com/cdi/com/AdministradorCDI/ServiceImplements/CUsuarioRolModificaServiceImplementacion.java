package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.CUsuarioRolModificaEntity;
import com.cdi.com.AdministradorCDI.Services.CUsuarioRolModificaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CUsuarioRolModificaServiceImplementacion implements CUsuarioRolModificaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertaUserRolModifica(CUsuarioRolModificaEntity entidad, Integer Bandera, Integer IdUsuarioRol, Integer IdUsuario) {
        try {
            StoredProcedureQuery insertuser = repositorio.createNamedStoredProcedureQuery("paCUsuarioRolModifica");
            insertuser.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertuser.registerStoredProcedureParameter("IdUsuarioRol", Integer.class, ParameterMode.IN);
            insertuser.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            insertuser.registerStoredProcedureParameter("IdRol", Integer.class, ParameterMode.IN);
            insertuser.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            insertuser.setParameter("Bandera", Bandera);
            insertuser.setParameter("IdUsuarioRol", IdUsuarioRol);
            insertuser.setParameter("IdUsuario", IdUsuario);
            insertuser.setParameter("IdRol", entidad.getIdRol());
            insertuser.setParameter("Estado", entidad.getEstado());

            insertuser.execute();
            return JSONObject.quote((String) insertuser.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

    @Override
    public String EliminaUserRolModifica(CUsuarioRolModificaEntity entidad, Integer Bandera, Integer IdUsuarioRol, Integer IdUsuario) {
        try {
            StoredProcedureQuery actuser = repositorio.createNamedStoredProcedureQuery("paCUsuarioRolModifica");
            actuser.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actuser.registerStoredProcedureParameter("IdUsuarioRol", Integer.class, ParameterMode.IN);
            actuser.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            actuser.registerStoredProcedureParameter("IdRol", Integer.class, ParameterMode.IN);
            actuser.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            actuser.setParameter("Bandera", Bandera);
            actuser.setParameter("IdUsuarioRol", IdUsuarioRol);
            actuser.setParameter("IdUsuario", IdUsuario);
            actuser.setParameter("IdRol", entidad.getIdRol());
            actuser.setParameter("Estado", entidad.getEstado());

            actuser.execute();
            return JSONObject.quote((String) actuser.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
