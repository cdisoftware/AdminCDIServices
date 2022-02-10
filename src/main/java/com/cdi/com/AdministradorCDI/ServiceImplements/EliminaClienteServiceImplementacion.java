package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.EliminaClienteEntity;
import com.cdi.com.AdministradorCDI.Services.EliminaClienteService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class EliminaClienteServiceImplementacion implements EliminaClienteService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String EliminaClient(EliminaClienteEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery elimclient = repositorio.createNamedStoredProcedureQuery("PaEliminaCliente");
            elimclient.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            elimclient.registerStoredProcedureParameter("IdCliente", Integer.class, ParameterMode.IN);
            elimclient.registerStoredProcedureParameter("NombreCliente", String.class, ParameterMode.IN);
            elimclient.setParameter("bandera", bandera);
            elimclient.setParameter("IdCliente", entidad.getId_Cliente());
            elimclient.setParameter("NombreCliente", entidad.getDescripcion());
            elimclient.execute();
            return JSONObject.quote((String) elimclient.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
