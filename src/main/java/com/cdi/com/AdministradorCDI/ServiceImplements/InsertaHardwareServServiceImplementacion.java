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
            return null;
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

    @Override
    public String ActualizarHardServ(InsertaHardwareServEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery actualhard = repositorio.createNamedStoredProcedureQuery("paInsertaHardwareServ");
            actualhard.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actualhard.registerStoredProcedureParameter("IdServidor", Integer.class, ParameterMode.IN);
            actualhard.registerStoredProcedureParameter("DiscoDuro", String.class, ParameterMode.IN);
            actualhard.registerStoredProcedureParameter("RAM", String.class, ParameterMode.IN);
            actualhard.registerStoredProcedureParameter("Procesador", String.class, ParameterMode.IN);
            actualhard.setParameter("Bandera", Bandera);
            actualhard.setParameter("IdServidor", entidad.getId_S());
            actualhard.setParameter("DiscoDuro", entidad.getDiscoDuro());
            actualhard.setParameter("RAM", entidad.getRAM());
            actualhard.setParameter("Procesador", entidad.getProcesador());
            actualhard.execute();
            return null;
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
