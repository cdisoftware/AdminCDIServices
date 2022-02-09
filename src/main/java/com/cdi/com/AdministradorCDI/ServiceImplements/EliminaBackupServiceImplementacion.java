package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.EliminaBackupEntity;
import com.cdi.com.AdministradorCDI.Services.EliminaBackupService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class EliminaBackupServiceImplementacion implements EliminaBackupService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String EliminaBackup(EliminaBackupEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery eliminabackup = repositorio.createNamedStoredProcedureQuery("PaEliminaBackup");
            eliminabackup.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            eliminabackup.registerStoredProcedureParameter("IdBackup", Integer.class, ParameterMode.IN);
            eliminabackup.registerStoredProcedureParameter("NombreBackup", String.class, ParameterMode.IN);
            eliminabackup.setParameter("bandera", bandera);
            eliminabackup.setParameter("IdBackup", entidad.getId_B());
            eliminabackup.setParameter("NombreBackup", entidad.getNombre());
            eliminabackup.execute();
            return JSONObject.quote((String) eliminabackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }
    }
}
