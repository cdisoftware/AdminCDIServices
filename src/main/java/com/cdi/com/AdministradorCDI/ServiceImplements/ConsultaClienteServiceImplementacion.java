package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaClienteEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaClienteService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaClienteServiceImplementacion implements ConsultaClienteService {
    
    @PersistenceContext
    private EntityManager repositorio;
    
    @Override
    public List<ConsultaClienteEntity> ConsultaCliente(ConsultaClienteEntity entidad) {
        try {
            StoredProcedureQuery conscli = repositorio.createNamedStoredProcedureQuery("PaConsultaCliente");
            conscli.registerStoredProcedureParameter("IdCliente", Integer.class, ParameterMode.IN);
            conscli.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);

            conscli.setParameter("IdCliente", entidad.getId_Cliente());
            conscli.setParameter("Descripcion", entidad.getDescripcion());
            return conscli.getResultList();
        } catch (Exception e) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }
    
}
