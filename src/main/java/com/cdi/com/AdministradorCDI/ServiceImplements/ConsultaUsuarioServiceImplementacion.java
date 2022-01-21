package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaUsuarioEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaUsuarioService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaUsuarioServiceImplementacion implements ConsultaUsuarioService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaUsuarioEntity> ConsultaUsuario(ConsultaUsuarioEntity entidad) {
        try {
            StoredProcedureQuery consUser = repositorio.createNamedStoredProcedureQuery("PaConsultaUsuario");
            consUser.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            consUser.registerStoredProcedureParameter("Apellido", String.class, ParameterMode.IN);
            consUser.registerStoredProcedureParameter("Cedula", String.class, ParameterMode.IN);
            consUser.setParameter("Nombre", entidad.getNombre());
            consUser.setParameter("Apellido", entidad.getApellido());
            consUser.setParameter("Cedula", entidad.getCedula());
            return consUser.getResultList();
        } catch (Exception e) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
