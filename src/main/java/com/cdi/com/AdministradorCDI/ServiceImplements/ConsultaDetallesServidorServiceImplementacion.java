package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaDetallesServidorEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaDetallesServidorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaDetallesServidorServiceImplementacion implements ConsultaDetallesServidorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaDetallesServidorEntity> ConsultaDetallServ(Integer bandera, Integer IdServidor) {
        try {
            StoredProcedureQuery consdllserv = repositorio.createNamedStoredProcedureQuery("PaConsultaDetallesServidor");
            consdllserv.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consdllserv.registerStoredProcedureParameter("IdServidor", Integer.class, ParameterMode.IN);
            consdllserv.setParameter("bandera", bandera);
            consdllserv.setParameter("IdServidor", IdServidor);
            return consdllserv.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
