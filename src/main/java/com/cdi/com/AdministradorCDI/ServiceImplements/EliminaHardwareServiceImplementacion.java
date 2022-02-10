package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.EliminaHardwareEntity;
import com.cdi.com.AdministradorCDI.Services.EliminaHardwareService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class EliminaHardwareServiceImplementacion implements EliminaHardwareService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String EliminaHardServ(EliminaHardwareEntity entidad, Integer bandera) {
        try {
            StoredProcedureQuery insertbackup = repositorio.createNamedStoredProcedureQuery("PaEliminaHardware");
            insertbackup.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            insertbackup.registerStoredProcedureParameter("IdHardware", Integer.class, ParameterMode.IN);
            insertbackup.setParameter("bandera", bandera);
            insertbackup.setParameter("IdHardware", entidad.getId_S());
            insertbackup.execute();
            return JSONObject.quote((String) insertbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
