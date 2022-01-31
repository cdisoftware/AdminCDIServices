package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.InsertaTipoBackupEntity;
import com.cdi.com.AdministradorCDI.Services.InsertaTipoBackupService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class InsertaTipoBackupServiceImplementacion implements InsertaTipoBackupService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertaTipoBackup(InsertaTipoBackupEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertipobackup = repositorio.createNamedStoredProcedureQuery("paInsertaTipoBackup");
            insertipobackup.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertipobackup.registerStoredProcedureParameter("IdTipoBCK", Integer.class, ParameterMode.IN);
            insertipobackup.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            insertipobackup.setParameter("Bandera", Bandera);
            insertipobackup.setParameter("IdTipoBCK", entidad.getId_Tipo_BCK());
            insertipobackup.setParameter("Descripcion", entidad.getDescripcion());
            insertipobackup.execute();
            return JSONObject.quote((String) insertipobackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }

    @Override
    public String ActualizaTipoBackup(InsertaTipoBackupEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery actualtipobackup = repositorio.createNamedStoredProcedureQuery("paInsertaTipoBackup");
            actualtipobackup.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actualtipobackup.registerStoredProcedureParameter("IdTipoBCK", Integer.class, ParameterMode.IN);
            actualtipobackup.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            actualtipobackup.setParameter("Bandera", Bandera);
            actualtipobackup.setParameter("IdTipoBCK", entidad.getId_Tipo_BCK());
            actualtipobackup.setParameter("Descripcion", entidad.getDescripcion());
            actualtipobackup.execute();
            return JSONObject.quote((String) actualtipobackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
