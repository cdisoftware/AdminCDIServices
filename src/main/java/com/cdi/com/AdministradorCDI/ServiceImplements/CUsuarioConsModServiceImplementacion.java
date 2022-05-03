package com.cdi.com.AdministradorCDI.ServiceImplements;

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
    public String ConsultaUsuarioConsMod(Integer Bandera, Integer Idusuario, Integer TipoId, String NroId, String Usuario,
            String Nombre, String Apellido, Integer Estado, Integer Id_U, String Clave, Integer UserName) {
        try {
            StoredProcedureQuery consusercons = repositorio.createNamedStoredProcedureQuery("paCUsuarioConsMod");
            consusercons.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("Idusuario", Integer.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("TipoId", Integer.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("NroId", String.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("Apellido", String.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("Id_U", Integer.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("Clave", String.class, ParameterMode.IN);
            consusercons.registerStoredProcedureParameter("UserName", Integer.class, ParameterMode.IN);
            consusercons.setParameter("Bandera", Bandera);
            consusercons.setParameter("Idusuario", Idusuario);
            consusercons.setParameter("TipoId", TipoId);
            consusercons.setParameter("NroId", NroId);
            consusercons.setParameter("Usuario", Usuario);
            consusercons.setParameter("Nombre", Nombre);
            consusercons.setParameter("Apellido", Apellido);
            consusercons.setParameter("Estado", Estado);
            consusercons.setParameter("Id_U", Id_U);
            consusercons.setParameter("Clave", Clave);
            consusercons.setParameter("UserName", UserName);
            consusercons.execute();
            return JSONObject.quote((String) consusercons.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
