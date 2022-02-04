package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaHardwareEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaHardwareService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaHardwareServiceImplementacion implements ConsultaHardwareService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaHardwareEntity> ConsultaHardware(Integer IdServidor, String DiscoDuro, String Ram, String Procesador) {
        try {
            StoredProcedureQuery conhar = repositorio.createNamedStoredProcedureQuery("PaConsultaHardware");
            conhar.registerStoredProcedureParameter("IdServidor", Integer.class, ParameterMode.IN);//Aca va el nombre de el parametro de entrada en el sp
            conhar.registerStoredProcedureParameter("DiscoDuro", String.class, ParameterMode.IN);//Aca va el nombre de el parametro de entrada en el sp
            conhar.registerStoredProcedureParameter("Ram", String.class, ParameterMode.IN);//Aca va el nombre de el parametro de entrada en el sp
            conhar.registerStoredProcedureParameter("Procesador", String.class, ParameterMode.IN);//Aca va el nombre de el parametro de entrada en el sp

            conhar.setParameter("IdServidor", IdServidor);
            conhar.setParameter("DiscoDuro", DiscoDuro);
            conhar.setParameter("Ram", Ram);
            conhar.setParameter("Procesador", Procesador);
            return conhar.getResultList();
        } catch (Exception e) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
