package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Comun.clsEncriptacion;
import com.cdi.com.AdministradorCDI.Entity.CUsuarioInfoConsolaEntity;
import com.cdi.com.AdministradorCDI.Services.CUsuarioInfoConsolaService;
import java.util.List;
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
public class CUsuarioInfoConsolaServiceImplementacion implements CUsuarioInfoConsolaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaUsuarioInfoConsola(CUsuarioInfoConsolaEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery usuarioinfo = repositorio.createNamedStoredProcedureQuery("paCUsuarioInfoConsola");
            usuarioinfo.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            usuarioinfo.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            usuarioinfo.registerStoredProcedureParameter("Acceso", String.class, ParameterMode.IN);
            usuarioinfo.setParameter("bandera", bandera);
            usuarioinfo.setParameter("Usuario", entidad.getUsuario());
            usuarioinfo.setParameter("Acceso", clsEncriptacion.Encriptar(entidad.getPassword()));

            List<CUsuarioInfoConsolaEntity> con = usuarioinfo.getResultList();

            String ResFinal;
            String ID = null;
            String Password = null;
            String Cedula = null;
            String Id_U = null;
            String Usuario = null;
            String Nombre = null;
            String Apellido = null;
            String IdRol = null;
            String UrlFoto = null;

            String[] terminos = new String[con.size()];
            for (int i = 0; i < con.size(); i++) {
                ID = con.get(i).getID().toString();
                Password = clsEncriptacion.Desencriptar(con.get(i).getPassword());
                Cedula = con.get(i).getCedula();
                Id_U = con.get(i).getId_U().toString();
                Usuario = con.get(i).getUsuario();
                Nombre = con.get(i).getNombre();
                Apellido = con.get(i).getApellido();
                IdRol = con.get(i).getIdRol().toString();
                UrlFoto = con.get(i).getUrlFoto();

            }
            ResFinal
                    = "[{\"ID\":\"" + ID + "\","
                    + "\"Cedula\":\"" + Cedula + "\","
                    + "\"Id_U\":\"" + Id_U + "\","
                    + "\"Usuario\":\"" + Usuario + "\","
                    + "\"Nombre\":\"" + Nombre + "\","
                    + "\"Apellido\":\"" + Apellido + "\","
                    + "\"IdRol\":\"" + IdRol + "\","
                    + "\"UrlFoto\":\"" + UrlFoto + "\","
                    + "\"Password\":\"" + Password + "\"}]";

            return ResFinal;
        } catch (BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

}
