package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.EliminaServidorEntity;
import com.cdi.com.AdministradorCDI.Services.EliminaServidorService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class EliminaServidorServiceImplementacion implements EliminaServidorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String EliminaServidor(EliminaServidorEntity entidad, Integer bandera) {

        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("PaEliminaServidor");
            insertbackup.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdServidor", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("NombreServidor", String.class, ParameterMode.IN);

            insertbackup.setParameter("bandera", bandera);
            insertbackup.setParameter("IdServidor", entidad.getId_S());
            insertbackup.setParameter("NombreServidor", entidad.getNombre());

            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
