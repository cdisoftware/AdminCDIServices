package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.InsertaServidorEntity;
import com.cdi.com.AdministradorCDI.Services.InsertaServidorService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class InsertaServidorServiceImplementacion implements InsertaServidorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String InsertarServidor(InsertaServidorEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery insertserv = repositorio.createNamedStoredProcedureQuery("paInsertaServidor");
            insertserv.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("IdServidor", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("IpServidor", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("SistemaOper", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("Software", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("IdTipoServ", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("UserServidor", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("Password", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("ServidorAloja", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("Fecha_Ult_Mod", String.class, ParameterMode.IN);

            insertserv.setParameter("Bandera", Bandera);
            insertserv.setParameter("IdServidor", entidad.getId_S());
            insertserv.setParameter("IpServidor", entidad.getIp_S());
            insertserv.setParameter("Nombre", entidad.getNombre());
            insertserv.setParameter("SistemaOper", entidad.getSO());
            insertserv.setParameter("Software", entidad.getSoftware());
            insertserv.setParameter("Estado", entidad.getEstado());
            insertserv.setParameter("IdTipoServ", entidad.getId_Tipo_S());
            insertserv.setParameter("Observacion", entidad.getObservacion());
            insertserv.setParameter("UserServidor", entidad.getUsuario_Ser());
            insertserv.setParameter("Password", entidad.getPassword());
            insertserv.setParameter("ServidorAloja", entidad.getServicio_Aloja());
            insertserv.setParameter("IdUsuario", entidad.getId_U());
            insertserv.setParameter("Fecha_Ult_Mod", entidad.getFecha_Ult_Mod());
            insertserv.execute();
            return JSONObject.quote((String) insertserv.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

    @Override
    public String ActualizarServidordos(InsertaServidorEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery actualserv = repositorio.createNamedStoredProcedureQuery("paInsertaServidor");
            actualserv.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("IdServidor", Integer.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("IpServidor", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("SistemaOper", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("Software", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("IdTipoServ", Integer.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("UserServidor", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("Password", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("ServidorAloja", Integer.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("Fecha_Ult_Mod", String.class, ParameterMode.IN);

            actualserv.setParameter("Bandera", Bandera);
            actualserv.setParameter("IdServidor", entidad.getId_S());
            actualserv.setParameter("IpServidor", entidad.getIp_S());
            actualserv.setParameter("Nombre", entidad.getNombre());
            actualserv.setParameter("SistemaOper", entidad.getSO());
            actualserv.setParameter("Software", entidad.getSoftware());
            actualserv.setParameter("Estado", entidad.getEstado());
            actualserv.setParameter("IdTipoServ", entidad.getId_Tipo_S());
            actualserv.setParameter("Observacion", entidad.getObservacion());
            actualserv.setParameter("UserServidor", entidad.getUsuario_Ser());
            actualserv.setParameter("Password", entidad.getPassword());
            actualserv.setParameter("ServidorAloja", entidad.getServicio_Aloja());
            actualserv.setParameter("IdUsuario", entidad.getId_U());
            actualserv.setParameter("Fecha_Ult_Mod", entidad.getFecha_Ult_Mod());
            actualserv.execute();
            return JSONObject.quote((String) actualserv.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
