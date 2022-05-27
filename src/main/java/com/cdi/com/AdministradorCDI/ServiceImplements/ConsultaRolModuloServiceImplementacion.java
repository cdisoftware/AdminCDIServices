package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaRolModuloEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaRolModuloService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaRolModuloServiceImplementacion implements ConsultaRolModuloService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaRolModuloEntity> ConsultaRolModulo(Integer IdRol, String Modulo) {
        try {
            StoredProcedureQuery consrol = repositorio.createNamedStoredProcedureQuery("PaConsultaRolModulo");
            consrol.registerStoredProcedureParameter("IdRol", Integer.class, ParameterMode.IN);
            consrol.registerStoredProcedureParameter("Modulo", String.class, ParameterMode.IN);
            consrol.setParameter("IdRol", IdRol);
            consrol.setParameter("Modulo", Modulo);
            return consrol.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
}
