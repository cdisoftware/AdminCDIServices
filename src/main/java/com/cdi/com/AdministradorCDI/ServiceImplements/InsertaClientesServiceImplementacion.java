package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.InsertaClientesEntity;
import com.cdi.com.AdministradorCDI.Services.InsertaClientesService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

@Service
public class InsertaClientesServiceImplementacion implements InsertaClientesService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertaCliente(InsertaClientesEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertclient = repositorio.createNamedStoredProcedureQuery("paInsertaClientes");
            insertclient.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertclient.registerStoredProcedureParameter("IdCliente", Integer.class, ParameterMode.IN);
            insertclient.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);

            insertclient.setParameter("Bandera", Bandera);
            insertclient.setParameter("IdCliente", entidad.getId_Cliente());
            insertclient.setParameter("Descripcion", entidad.getDescripcion());
            insertclient.execute();
            return null;
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizaCliente(InsertaClientesEntity entidad, Integer Bandera) {
 try {
            StoredProcedureQuery actualizaclient = repositorio.createNamedStoredProcedureQuery("paInsertaClientes");
            actualizaclient.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actualizaclient.registerStoredProcedureParameter("IdCliente", Integer.class, ParameterMode.IN);
            actualizaclient.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);

            actualizaclient.setParameter("Bandera", Bandera);
            actualizaclient.setParameter("IdCliente", entidad.getId_Cliente());
            actualizaclient.setParameter("Descripcion", entidad.getDescripcion());
            actualizaclient.execute();
            return null;
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
