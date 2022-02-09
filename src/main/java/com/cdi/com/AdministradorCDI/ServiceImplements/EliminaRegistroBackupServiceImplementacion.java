package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.EliminaRegistroBackupEntity;
import com.cdi.com.AdministradorCDI.Services.EliminaRegistroBackupService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class EliminaRegistroBackupServiceImplementacion implements EliminaRegistroBackupService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String EliminaRegistBck(EliminaRegistroBackupEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("PaEliminaRegistroBackup");
            insertbackup.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdBackup", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Fecha", String.class, ParameterMode.IN);

            insertbackup.setParameter("bandera", bandera);
            insertbackup.setParameter("IdBackup", entidad.getId_BCK());
            insertbackup.setParameter("Fecha", entidad.getFecha());

            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
