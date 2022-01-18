package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.InsertaBackupEntity;
import com.cdi.com.AdministradorCDI.Services.InsertaBackupService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class InsertaBackupServiceImplementacion implements InsertaBackupService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertarBackup(InsertaBackupEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("paInsertaBackup");
            insertbackup.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdBackup", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdProyecto", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Ambiente", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Periodicidad", String.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdServidor", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdTipoBackup", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("Fecha", String.class, ParameterMode.IN);

            insertbackup.setParameter("Bandera", Bandera);
            insertbackup.setParameter("IdBackup", entidad.getId_B());
            insertbackup.setParameter("Nombre", entidad.getNombre());
            insertbackup.setParameter("IdProyecto", entidad.getId_PRY());
            insertbackup.setParameter("Ambiente", entidad.getAmbiente());
            insertbackup.setParameter("Periodicidad", entidad.getPeriodicidad());
            insertbackup.setParameter("IdServidor", entidad.getId_Servidor());
            insertbackup.setParameter("IdTipoBackup", entidad.getId_Tipo_BCK());
            insertbackup.setParameter("IdUsuario", entidad.getId_Usuario());
            insertbackup.setParameter("Fecha", entidad.getFecha_Ult_Mod());

            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

    @Override
    public String ActualizarBackup(InsertaBackupEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery rolbackup = repositorio.createNamedStoredProcedureQuery("paInsertaBackup");
            rolbackup.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("IdBackup", Integer.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("IdProyecto", Integer.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("Ambiente", String.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("Periodicidad", String.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("IdServidor", Integer.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("IdTipoBackup", Integer.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("Fecha", String.class, ParameterMode.IN);
            rolbackup.setParameter("Bandera", Bandera);
            rolbackup.setParameter("IdBackup", entidad.getId_B());
            rolbackup.setParameter("Nombre", entidad.getNombre());
            rolbackup.setParameter("IdProyecto", entidad.getId_PRY());
            rolbackup.setParameter("Ambiente", entidad.getAmbiente());
            rolbackup.setParameter("Periodicidad", entidad.getPeriodicidad());
            rolbackup.setParameter("IdServidor", entidad.getId_Servidor());
            rolbackup.setParameter("IdTipoBackup", entidad.getId_Tipo_BCK());
            rolbackup.setParameter("IdUsuario", entidad.getId_Usuario());
            rolbackup.setParameter("Fecha", entidad.getFecha_Ult_Mod());
            rolbackup.execute();
            return null;
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
