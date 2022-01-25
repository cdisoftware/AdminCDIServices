package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ValidaloginEntity;
import com.cdi.com.AdministradorCDI.Services.ValidaloginService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ValidaloginServiceImplementacion implements ValidaloginService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ValidaloginEntity> ConsultaValidLogin(ValidaloginEntity entidad) {
        try {
            StoredProcedureQuery consbackup = repositorio.createNamedStoredProcedureQuery("PaValidalogin");
            consbackup.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            consbackup.registerStoredProcedureParameter("Password", String.class, ParameterMode.IN);
            consbackup.registerStoredProcedureParameter("Respuesta", String.class, ParameterMode.IN);

            consbackup.setParameter("Usuario", entidad.getUsuario());
            consbackup.setParameter("Password", entidad.getPassword());
            consbackup.setParameter("Respuesta", entidad.getRESPUESTA());

            return consbackup.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("El usuario o contraseña son invalidos. Encuentra tu cuenta e inicia sesion"));
            return list;
        }
    }

}
