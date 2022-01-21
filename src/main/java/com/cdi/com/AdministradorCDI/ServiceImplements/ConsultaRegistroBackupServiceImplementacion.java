package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaRegistroBackupEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaRegistroBackupService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaRegistroBackupServiceImplementacion implements ConsultaRegistroBackupService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaRegistroBackupEntity> ConsultaRegistBck(ConsultaRegistroBackupEntity entidad, Integer Nombre_Bck) {
        try {
            StoredProcedureQuery consbackup = repositorio.createNamedStoredProcedureQuery("PaConsultaRegistroBackup");
            consbackup.registerStoredProcedureParameter("Nombre_Bck", Integer.class, ParameterMode.IN);
            consbackup.registerStoredProcedureParameter("Fecha", String.class, ParameterMode.IN);
            consbackup.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            consbackup.registerStoredProcedureParameter("Usuario", Integer.class, ParameterMode.IN);
            consbackup.setParameter("Nombre_Bck", Nombre_Bck);
            consbackup.setParameter("Fecha", entidad.getFecha());
            consbackup.setParameter("Estado", entidad.getEstado());
            consbackup.setParameter("Usuario", entidad.getNombre());
            return consbackup.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
