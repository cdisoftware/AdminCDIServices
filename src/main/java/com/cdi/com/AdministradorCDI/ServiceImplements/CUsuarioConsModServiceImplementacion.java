package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Comun.clsEncriptacion;
import com.cdi.com.AdministradorCDI.Entity.CUsuarioConsModEntity;
import com.cdi.com.AdministradorCDI.Services.CUsuarioConsModService;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CUsuarioConsModServiceImplementacion implements CUsuarioConsModService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertaUsuarioConsMod(CUsuarioConsModEntity entidad, Integer Bandera, Integer Idusuario) {
        try {
            StoredProcedureQuery insertUser = repositorio.createNamedStoredProcedureQuery("paCUsuarioConsMod");
            insertUser.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertUser.registerStoredProcedureParameter("Idusuario", Integer.class, ParameterMode.IN);
            insertUser.registerStoredProcedureParameter("NroId", String.class, ParameterMode.IN);
            insertUser.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            insertUser.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            insertUser.registerStoredProcedureParameter("Apellido", String.class, ParameterMode.IN);
            insertUser.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            insertUser.registerStoredProcedureParameter("Id_U", Integer.class, ParameterMode.IN);
            insertUser.registerStoredProcedureParameter("Clave", String.class, ParameterMode.IN);
            insertUser.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);
            insertUser.registerStoredProcedureParameter("Telefono", String.class, ParameterMode.IN);
            insertUser.registerStoredProcedureParameter("Email", String.class, ParameterMode.IN);

            insertUser.setParameter("Bandera", Bandera);
            insertUser.setParameter("Idusuario", Idusuario);
            insertUser.setParameter("NroId", entidad.getCedula());
            insertUser.setParameter("Usuario", entidad.getUsuario());
            insertUser.setParameter("Nombre", entidad.getNombre());
            insertUser.setParameter("Apellido", entidad.getApellido());
            insertUser.setParameter("Estado", entidad.getEstado());
            insertUser.setParameter("Id_U", entidad.getId_U());
            try {
                insertUser.setParameter("Clave", clsEncriptacion.Encriptar(entidad.getPassword()));
            } catch (IllegalBlockSizeException | NoSuchPaddingException | BadPaddingException ex) {

                return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
            }
            insertUser.setParameter("Direccion", entidad.getDireccion());
            insertUser.setParameter("Telefono", entidad.getTelefono());
            insertUser.setParameter("Email", entidad.getEmail());

            insertUser.execute();
            return JSONObject.quote((String) insertUser.getOutputParameterValue("Respuesta"));

        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizaUsuarioConsMod(CUsuarioConsModEntity entidad, Integer Bandera, Integer Idusuario) {
        try {
            StoredProcedureQuery actUser = repositorio.createNamedStoredProcedureQuery("paCUsuarioConsMod");
            actUser.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actUser.registerStoredProcedureParameter("Idusuario", Integer.class, ParameterMode.IN);
            actUser.registerStoredProcedureParameter("NroId", String.class, ParameterMode.IN);
            actUser.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            actUser.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            actUser.registerStoredProcedureParameter("Apellido", String.class, ParameterMode.IN);
            actUser.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            actUser.registerStoredProcedureParameter("Id_U", Integer.class, ParameterMode.IN);
            actUser.registerStoredProcedureParameter("Clave", String.class, ParameterMode.IN);
            actUser.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);
            actUser.registerStoredProcedureParameter("Telefono", String.class, ParameterMode.IN);
            actUser.registerStoredProcedureParameter("Email", String.class, ParameterMode.IN);
            actUser.setParameter("Bandera", Bandera);
            actUser.setParameter("Idusuario", Idusuario);
            actUser.setParameter("NroId", entidad.getCedula());
            actUser.setParameter("Usuario", entidad.getUsuario());
            actUser.setParameter("Nombre", entidad.getNombre());
            actUser.setParameter("Apellido", entidad.getApellido());
            actUser.setParameter("Estado", entidad.getEstado());
            actUser.setParameter("Id_U", entidad.getId_U());
            actUser.setParameter("Clave", entidad.getPassword());
            actUser.setParameter("Direccion", entidad.getDireccion());
            actUser.setParameter("Telefono", entidad.getTelefono());
            actUser.setParameter("Email", entidad.getEmail());
            actUser.execute();
            return JSONObject.quote((String) actUser.getOutputParameterValue("Respuesta"));

        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
