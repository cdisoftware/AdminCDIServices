package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaBackupEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaBackupService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaBackupServiceImplementacion implements ConsultaBackupService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaBackupEntity> ConsultaBackup(String Nombre_Bck, String Ip, String Usuario, String Cliente) {
        try {
            StoredProcedureQuery consbackup = repositorio.createNamedStoredProcedureQuery("PaConsultaBackup");
            consbackup.registerStoredProcedureParameter("Nombre_Bck", String.class, ParameterMode.IN);
            consbackup.registerStoredProcedureParameter("Ip", String.class, ParameterMode.IN);
            consbackup.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            consbackup.registerStoredProcedureParameter("Cliente", String.class, ParameterMode.IN);
            consbackup.setParameter("Nombre_Bck", Nombre_Bck);
            consbackup.setParameter("Ip", Ip);
            consbackup.setParameter("Usuario", Usuario);
            consbackup.setParameter("Cliente", Cliente);
            return consbackup.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
