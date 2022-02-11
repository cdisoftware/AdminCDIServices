package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.UpdateDetalleServidorEntity;
import com.cdi.com.AdministradorCDI.Services.UpdateDetalleServidorService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class UpdateDetalleServidorServiceImplementacion implements UpdateDetalleServidorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String UpdateDetllServ(UpdateDetalleServidorEntity entidad) {
        try {
            StoredProcedureQuery rolbackup = repositorio.createNamedStoredProcedureQuery("PaUpdateDetalleServidor");

            rolbackup.registerStoredProcedureParameter("IdServidores", Integer.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("DiscoDuro", String.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("RAM", String.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("Procesador", String.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("UsuarioSer", String.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("Passwordd", String.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("IdServidorAloja", Integer.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            rolbackup.registerStoredProcedureParameter("Fecha", String.class, ParameterMode.IN);

            rolbackup.setParameter("IdServidores", entidad.getId_S());
            rolbackup.setParameter("DiscoDuro", entidad.getDiscoDuro());
            rolbackup.setParameter("RAM", entidad.getRAM());
            rolbackup.setParameter("Procesador", entidad.getProcesador());
            rolbackup.setParameter("UsuarioSer", entidad.getUsuario_Ser());
            rolbackup.setParameter("Passwordd", entidad.getPassword());
            rolbackup.setParameter("IdServidorAloja", entidad.getServidor_Aloja());
            rolbackup.setParameter("IdUsuario", entidad.getId_U());
            rolbackup.setParameter("Fecha", entidad.getFecha_Ult_Mod());
            rolbackup.execute();
            return JSONObject.quote((String) rolbackup.getOutputParameterValue("Respuesta"));
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
