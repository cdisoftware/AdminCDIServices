package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.InsertaProyectoEntity;
import com.cdi.com.AdministradorCDI.Services.InsertaProyectoService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class InsertaProyectoServiceImplementacion implements InsertaProyectoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertarProyecto(InsertaProyectoEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertproy = repositorio.createNamedStoredProcedureQuery("paInsertaProyecto");
            insertproy.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertproy.registerStoredProcedureParameter("IdProyecto", Integer.class, ParameterMode.IN);
            insertproy.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            insertproy.registerStoredProcedureParameter("IdCliente", Integer.class, ParameterMode.IN);
            insertproy.setParameter("Bandera", Bandera);
            insertproy.setParameter("IdProyecto", entidad.getId_PRY());
            insertproy.setParameter("Nombre", entidad.getNombre());
            insertproy.setParameter("IdCliente", entidad.getId_Cliente());
            insertproy.execute();
            return null;
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

    @Override
    public String ActualizarProyecto(InsertaProyectoEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery actualizaproy = repositorio.createNamedStoredProcedureQuery("paInsertaProyecto");
            actualizaproy.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actualizaproy.registerStoredProcedureParameter("IdProyecto", Integer.class, ParameterMode.IN);
            actualizaproy.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            actualizaproy.registerStoredProcedureParameter("IdCliente", Integer.class, ParameterMode.IN);
            actualizaproy.setParameter("Bandera", Bandera);
            actualizaproy.setParameter("IdProyecto", entidad.getId_PRY());
            actualizaproy.setParameter("Nombre", entidad.getNombre());
            actualizaproy.setParameter("IdCliente", entidad.getId_Cliente());
            actualizaproy.execute();
            return null;
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
