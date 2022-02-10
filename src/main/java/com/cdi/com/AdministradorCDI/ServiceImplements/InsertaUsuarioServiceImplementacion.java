package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.InsertaUsuarioEntity;
import com.cdi.com.AdministradorCDI.Services.InsertaUsuarioService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class InsertaUsuarioServiceImplementacion implements InsertaUsuarioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertaUsuario(InsertaUsuarioEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertusuario = repositorio.createNamedStoredProcedureQuery("paInsertaUsuario");
            insertusuario.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertusuario.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            insertusuario.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            insertusuario.registerStoredProcedureParameter("Apellido", String.class, ParameterMode.IN);
            insertusuario.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            insertusuario.registerStoredProcedureParameter("Password", String.class, ParameterMode.IN);
            insertusuario.registerStoredProcedureParameter("Cedula", String.class, ParameterMode.IN);
            insertusuario.registerStoredProcedureParameter("UserAdmin", Integer.class, ParameterMode.IN);
            insertusuario.setParameter("Bandera", Bandera);
            insertusuario.setParameter("IdUsuario", entidad.getId_U());
            insertusuario.setParameter("Nombre", entidad.getNombre());
            insertusuario.setParameter("Apellido", entidad.getApellido());
            insertusuario.setParameter("Usuario", entidad.getUsuario());
            insertusuario.setParameter("Password", entidad.getPassword());
            insertusuario.setParameter("Cedula", entidad.getCedula());
            insertusuario.setParameter("UserAdmin", entidad.getUserAdmin());

            insertusuario.execute();
            return JSONObject.quote((String) insertusuario.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

    @Override
    public String ActualizaUsuario(InsertaUsuarioEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery actualizausuario = repositorio.createNamedStoredProcedureQuery("paInsertaUsuario");
            actualizausuario.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actualizausuario.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            actualizausuario.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            actualizausuario.registerStoredProcedureParameter("Apellido", String.class, ParameterMode.IN);
            actualizausuario.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            actualizausuario.registerStoredProcedureParameter("Password", String.class, ParameterMode.IN);
            actualizausuario.registerStoredProcedureParameter("Cedula", String.class, ParameterMode.IN);
            actualizausuario.registerStoredProcedureParameter("UserAdmin", Integer.class, ParameterMode.IN);
            actualizausuario.setParameter("Bandera", Bandera);
            actualizausuario.setParameter("IdUsuario", entidad.getId_U());
            actualizausuario.setParameter("Nombre", entidad.getNombre());
            actualizausuario.setParameter("Apellido", entidad.getApellido());
            actualizausuario.setParameter("Usuario", entidad.getUsuario());
            actualizausuario.setParameter("Password", entidad.getPassword());
            actualizausuario.setParameter("Cedula", entidad.getCedula());
            actualizausuario.setParameter("UserAdmin", entidad.getUserAdmin());
            actualizausuario.execute();
            return JSONObject.quote((String) actualizausuario.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
