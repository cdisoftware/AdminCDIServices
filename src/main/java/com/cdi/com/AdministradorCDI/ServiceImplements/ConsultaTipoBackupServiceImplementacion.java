package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaTipoBackupEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaTipoBackupService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaTipoBackupServiceImplementacion implements ConsultaTipoBackupService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaTipoBackupEntity> ConsultaTipoBackup(ConsultaTipoBackupEntity entidad) {
        try {
            StoredProcedureQuery consTbck = repositorio.createNamedStoredProcedureQuery("PaConsultaTipoBackup");
            consTbck.registerStoredProcedureParameter("IdTipoBackup", Integer.class, ParameterMode.IN);
            consTbck.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);

            consTbck.setParameter("IdTipoBackup", entidad.getId_Tipo_BCK());
            consTbck.setParameter("Descripcion", entidad.getDescripcion());
            return consTbck.getResultList();
        } catch (Exception e) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
