package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaProyectosEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaProyectosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;

import org.springframework.stereotype.Service;

@Service
public class ConsultaProyectosServiceImplementacion implements ConsultaProyectosService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaProyectosEntity> ConsultaProyect(Integer bandera, String Nombre, Integer IdCliente) {
        try {
            StoredProcedureQuery consProyect = repositorio.createNamedStoredProcedureQuery("PaConsultaProyectos");
             consProyect.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
             consProyect.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
             consProyect.registerStoredProcedureParameter("IdCliente", Integer.class, ParameterMode.IN);
             
             consProyect.setParameter("bandera", bandera);
             consProyect.setParameter("Nombre", Nombre);
             consProyect.setParameter("IdCliente", IdCliente);
          
            return consProyect.getResultList();
        } catch (Exception e) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
