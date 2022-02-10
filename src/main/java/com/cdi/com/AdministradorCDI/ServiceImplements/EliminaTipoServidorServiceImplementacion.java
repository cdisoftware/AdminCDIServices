package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.EliminaTipoServidorEntity;
import com.cdi.com.AdministradorCDI.Services.EliminaTipoServidorService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class EliminaTipoServidorServiceImplementacion implements EliminaTipoServidorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String EliminaTipoServ(EliminaTipoServidorEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("PaEliminaTipoServidor");
            insertbackup.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdTpServidor", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("descripcion", String.class, ParameterMode.IN);
            insertbackup.setParameter("bandera", bandera);
            insertbackup.setParameter("IdTpServidor", entidad.getId_Tipo_S());
            insertbackup.setParameter("descripcion", entidad.getDescripcion());
            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
