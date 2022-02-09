package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.EliminaUsuarioEntity;
import com.cdi.com.AdministradorCDI.Services.EliminaUsuarioService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class EliminaUsuarioServiceImplementacion implements EliminaUsuarioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String EliminaUsuario(EliminaUsuarioEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery elimusu = repositorio.createNamedStoredProcedureQuery("PaEliminaUsuario");
            elimusu.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            elimusu.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            elimusu.registerStoredProcedureParameter("NombreUsu", String.class, ParameterMode.IN);

            elimusu.setParameter("bandera", bandera);
            elimusu.setParameter("IdUsuario", entidad.getId_U());
            elimusu.setParameter("NombreUsu", entidad.getNombre());

            elimusu.execute();
            return JSONObject.quote((String) elimusu.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
