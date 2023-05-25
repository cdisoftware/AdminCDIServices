package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ModAdminpublicacionesEntity;
import com.cdi.com.AdministradorCDI.Services.ModAdminpublicacioneService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ModAdminpublicacioneServiceImplementacion implements ModAdminpublicacioneService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ModAdminPublic(ModAdminpublicacionesEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("PacModAdminpublicaciones");
            insertbackup.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdPublicacion", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Tipo", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Ip", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Ambiente", Integer.class, ParameterMode.IN);

            insertbackup.setParameter("Bandera", Bandera);
            insertbackup.setParameter("IdPublicacion", entidad.getIdPublicacion());
            insertbackup.setParameter("Tipo", entidad.getTipo());
            insertbackup.setParameter("Ip", entidad.getIp());
            insertbackup.setParameter("Nombre", entidad.getNombre());
            insertbackup.setParameter("Descripcion", entidad.getDescripcion());
            insertbackup.setParameter("Estado", entidad.getEstado());
            insertbackup.setParameter("Ambiente", entidad.getAmbiente());

            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
