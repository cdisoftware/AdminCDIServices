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
            insertserv.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("Software", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("SistemaOper", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("Procesador", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("DiscoDuro", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("RAM", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("IdTipoServ", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("ServidorAloja", Integer.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("IpPublica", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("AplicacionesIIS", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("BaseDeDatos", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("UserServidor", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("Password", String.class, ParameterMode.IN);
            insertserv.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);

            insertserv.setParameter("Bandera", Bandera);
            insertserv.setParameter("IdServidor", entidad.getIdServidor());
            insertserv.setParameter("IpServidor", entidad.getIpServidor());
            insertserv.setParameter("Nombre", entidad.getNombre());
            insertserv.setParameter("Observacion", entidad.getObservacion());
            insertserv.setParameter("Software", entidad.getSoftware());
            insertserv.setParameter("SistemaOper", entidad.getSistemaOper());
            insertserv.setParameter("Estado", entidad.getEstado());
            insertserv.setParameter("Procesador", entidad.getProcesador());
            insertserv.setParameter("DiscoDuro", entidad.getDiscoDuro());
            insertserv.setParameter("RAM", entidad.getRAM());
            insertserv.setParameter("IdTipoServ", entidad.getIdTipoServ());
            insertserv.setParameter("ServidorAloja", entidad.getServidorAloja());
            insertserv.setParameter("IpPublica", entidad.getIpPublica());
            insertserv.setParameter("AplicacionesIIS", entidad.getAplicacionesIIS());
            insertserv.setParameter("BaseDeDatos", entidad.getBaseDeDatos());
            insertserv.setParameter("UserServidor", entidad.getUserServidor());
            insertserv.setParameter("Password", entidad.getPassword());
            insertserv.setParameter("IdUsuario", entidad.getIdUsuario());

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
            actualserv.registerStoredProcedureParameter("Observacion", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("Software", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("SistemaOper", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("Procesador", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("DiscoDuro", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("RAM", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("IdTipoServ", Integer.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("ServidorAloja", Integer.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("IpPublica", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("AplicacionesIIS", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("BaseDeDatos", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("UserServidor", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("Password", String.class, ParameterMode.IN);
            actualserv.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);

            actualserv.setParameter("Bandera", Bandera);
            actualserv.setParameter("IdServidor", entidad.getIdServidor());
            actualserv.setParameter("IpServidor", entidad.getIpServidor());
            actualserv.setParameter("Nombre", entidad.getNombre());
            actualserv.setParameter("Observacion", entidad.getObservacion());
            actualserv.setParameter("Software", entidad.getSoftware());
            actualserv.setParameter("SistemaOper", entidad.getSistemaOper());
            actualserv.setParameter("Estado", entidad.getEstado());
            actualserv.setParameter("Procesador", entidad.getProcesador());
            actualserv.setParameter("DiscoDuro", entidad.getDiscoDuro());
            actualserv.setParameter("RAM", entidad.getRAM());
            actualserv.setParameter("IdTipoServ", entidad.getIdTipoServ());
            actualserv.setParameter("ServidorAloja", entidad.getServidorAloja());
            actualserv.setParameter("IpPublica", entidad.getIpPublica());
            actualserv.setParameter("AplicacionesIIS", entidad.getAplicacionesIIS());
            actualserv.setParameter("BaseDeDatos", entidad.getBaseDeDatos());
            actualserv.setParameter("UserServidor", entidad.getUserServidor());
            actualserv.setParameter("Password", entidad.getPassword());
            actualserv.setParameter("IdUsuario", entidad.getIdUsuario());

            actualserv.execute();
            return JSONObject.quote((String) actualserv.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }
}
