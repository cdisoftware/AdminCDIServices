package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Comun.clsEncriptacion;
import com.cdi.com.AdministradorCDI.Entity.UpdateInfoUsuarioEntity;
import com.cdi.com.AdministradorCDI.Services.UpdateInfoUsuarioService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class UpdateInfoUsuarioServiceImplementacion implements UpdateInfoUsuarioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ActualizaInfoUser(UpdateInfoUsuarioEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery updateinfo = repositorio.createNamedStoredProcedureQuery("PaUpdateInfoUsuario");
            updateinfo.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            updateinfo.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            updateinfo.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            updateinfo.registerStoredProcedureParameter("Apellido", String.class, ParameterMode.IN);
            updateinfo.registerStoredProcedureParameter("Password", String.class, ParameterMode.IN);
            updateinfo.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);
            updateinfo.registerStoredProcedureParameter("Telefono", String.class, ParameterMode.IN);
            updateinfo.registerStoredProcedureParameter("Email", String.class, ParameterMode.IN);

            updateinfo.setParameter("Bandera", Bandera);
            updateinfo.setParameter("IdUsuario", entidad.getId_U());
            updateinfo.setParameter("Nombre", entidad.getNombre());
            updateinfo.setParameter("Apellido", entidad.getApellido());
            updateinfo.setParameter("Password", clsEncriptacion.Encriptar(entidad.getPassword()));
            updateinfo.setParameter("Direccion", entidad.getDireccion());
            updateinfo.setParameter("Telefono", entidad.getTelefono());
            updateinfo.setParameter("Email", entidad.getEmail());

            updateinfo.execute();
            return JSONObject.quote((String) updateinfo.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
