package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.InsertaTipoServidorEntity;
import com.cdi.com.AdministradorCDI.Services.InsertaTipoServidorService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class InsertaTipoServidorServiceImplementacion implements InsertaTipoServidorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertaTipoServidor(InsertaTipoServidorEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery inserttiposerv = repositorio.createNamedStoredProcedureQuery("paInsertaTipoServidor");
            inserttiposerv.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            inserttiposerv.registerStoredProcedureParameter("IdTipoServ", Integer.class, ParameterMode.IN);
            inserttiposerv.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            inserttiposerv.setParameter("Bandera", Bandera);
            inserttiposerv.setParameter("IdTipoServ", entidad.getId_Tipo_S());
            inserttiposerv.setParameter("Descripcion", entidad.getDescripcion());
            inserttiposerv.execute();
            return JSONObject.quote((String) inserttiposerv.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizaTipoServidor(InsertaTipoServidorEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery actultiposerv = repositorio.createNamedStoredProcedureQuery("paInsertaTipoServidor");
            actultiposerv.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actultiposerv.registerStoredProcedureParameter("IdTipoServ", Integer.class, ParameterMode.IN);
            actultiposerv.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            actultiposerv.setParameter("Bandera", Bandera);
            actultiposerv.setParameter("IdTipoServ", entidad.getId_Tipo_S());
            actultiposerv.setParameter("Descripcion", entidad.getDescripcion());
            actultiposerv.execute();
            return JSONObject.quote((String) actultiposerv.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
