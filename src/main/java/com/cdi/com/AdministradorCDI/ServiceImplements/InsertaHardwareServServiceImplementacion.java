package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.InsertaHardwareServEntity;
import com.cdi.com.AdministradorCDI.Services.InsertaHardwareServService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class InsertaHardwareServServiceImplementacion implements InsertaHardwareServService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertarHardServ(InsertaHardwareServEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery inserthard = repositorio.createNamedStoredProcedureQuery("paInsertaHardwareServ");
            inserthard.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            inserthard.registerStoredProcedureParameter("IdServidor", Integer.class, ParameterMode.IN);
            inserthard.registerStoredProcedureParameter("DiscoDuro", String.class, ParameterMode.IN);
            inserthard.registerStoredProcedureParameter("RAM", String.class, ParameterMode.IN);
            inserthard.registerStoredProcedureParameter("Procesador", String.class, ParameterMode.IN);
            inserthard.setParameter("Bandera", Bandera);
            inserthard.setParameter("IdServidor", entidad.getId_S());
            inserthard.setParameter("DiscoDuro", entidad.getDiscoDuro());
            inserthard.setParameter("RAM", entidad.getRAM());
            inserthard.setParameter("Procesador", entidad.getProcesador());
            inserthard.execute();
            return JSONObject.quote((String) inserthard.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
