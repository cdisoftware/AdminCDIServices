package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Comun.clsEncriptacion;
import com.cdi.com.AdministradorCDI.Entity.CUsuarioConsModEntity;
import com.cdi.com.AdministradorCDI.Services.CUsuarioConsModService;
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
    public String ConsultaUsuarioConsMod(CUsuarioConsModEntity entidad, Integer Bandera, Integer Idusuario) {
        try {
            StoredProcedureQuery consusercons = repositorio.createNamedStoredProcedureQuery("paCUsuarioConsMod");
            consusercons.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("Idusuario", Integer.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("NroId", String.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("Apellido", String.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("Id_U", Integer.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("Clave", String.class, ParameterMode.IN);
            consusercons.setParameter("Bandera", Bandera);
            consusercons.setParameter("Idusuario", Idusuario);
            consusercons.setParameter("NroId", entidad.getCedula());
            consusercons.setParameter("Usuario", entidad.getUsuario());
            consusercons.setParameter("Nombre", entidad.getNombre());
            consusercons.setParameter("Apellido", entidad.getApellido());
            consusercons.setParameter("Estado", entidad.getEstado());
            consusercons.setParameter("Id_U", entidad.getId_U());
            consusercons.setParameter("Clave", clsEncriptacion.Encriptar(entidad.getPassword()));
            consusercons.execute();
            return JSONObject.quote((String) consusercons.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
