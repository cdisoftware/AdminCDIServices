package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.InsertaRegistroBackupEntity;
import com.cdi.com.AdministradorCDI.Services.InsertaRegistroBackupService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class InsertaRegistroBackupServiceImplementacion implements InsertaRegistroBackupService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertaRegistroBCK(InsertaRegistroBackupEntity entidad) {
        try {
            StoredProcedureQuery insertregbackup = repositorio.createNamedStoredProcedureQuery("PaInsertaRegistroBackup");
            insertregbackup.registerStoredProcedureParameter("Id_BCK", Integer.class, ParameterMode.IN);
            insertregbackup.registerStoredProcedureParameter("Fecha", String.class, ParameterMode.IN);
            insertregbackup.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            insertregbackup.registerStoredProcedureParameter("Observaciones", String.class, ParameterMode.IN);
            insertregbackup.registerStoredProcedureParameter("Id_U", Integer.class, ParameterMode.IN);
            insertregbackup.setParameter("Id_BCK", entidad.getId_BCK());
            insertregbackup.setParameter("Fecha", entidad.getFecha());
            insertregbackup.setParameter("Estado", entidad.getEstado());
            insertregbackup.setParameter("Observaciones", entidad.getObservaciones());
            insertregbackup.setParameter("Id_U", entidad.getId_U());
            insertregbackup.execute();
            return JSONObject.quote((String) insertregbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
