package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaInfoUserEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaInfoUserService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaInfoUserServiceImplementacion implements ConsultaInfoUserService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaInfoUserEntity> ConsultaInfoUser(Integer IdUsuario) {
        try {
            StoredProcedureQuery consuser = repositorio.createNamedStoredProcedureQuery("PaConsultaInfoUser");
            consuser.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            consuser.setParameter("IdUsuario", IdUsuario);
            return consuser.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
