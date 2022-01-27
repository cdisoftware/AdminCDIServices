package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaTipoServidorEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaTipoServidorService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaTipoServidorServiceImplementacion implements ConsultaTipoServidorService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaTipoServidorEntity> ConsultaTipoServidor(ConsultaTipoServidorEntity entidad, Integer IdTipoServidor) {
        try {
            StoredProcedureQuery constipserv = repositorio.createNamedStoredProcedureQuery("PaConsultaTipoServidor");
            constipserv.registerStoredProcedureParameter("IdTipoServidor", Integer.class, ParameterMode.IN);
            constipserv.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            constipserv.setParameter("IdTipoServidor", IdTipoServidor);
            constipserv.setParameter("Descripcion", entidad.getDescripcion());
            return constipserv.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
