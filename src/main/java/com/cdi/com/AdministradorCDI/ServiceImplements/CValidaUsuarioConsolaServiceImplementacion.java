package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Services.CValidaUsuarioConsolaService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CValidaUsuarioConsolaServiceImplementacion implements CValidaUsuarioConsolaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ConsultaValUsuarioConsola(String Usuario) {
        try {
            StoredProcedureQuery valUsuario = repositorio.createNamedStoredProcedureQuery("paCValidaUsuarioConsola");
            valUsuario.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            valUsuario.setParameter("Usuario", Usuario);
            valUsuario.execute();
            return JSONObject.quote((String) valUsuario.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
