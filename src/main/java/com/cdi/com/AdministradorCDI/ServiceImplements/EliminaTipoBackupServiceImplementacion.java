package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.EliminaTipoBackupEntity;
import com.cdi.com.AdministradorCDI.Services.EliminaTipoBackupService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class EliminaTipoBackupServiceImplementacion implements EliminaTipoBackupService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String EliminaTipoBCK(EliminaTipoBackupEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("PaEliminaTipoBackup");
            insertbackup.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdTpBackup", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("descripcion", String.class, ParameterMode.IN);
            insertbackup.setParameter("bandera", bandera);
            insertbackup.setParameter("IdTpBackup", entidad.getId_Tipo_BCK());
            insertbackup.setParameter("descripcion", entidad.getDescripcion());
            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
