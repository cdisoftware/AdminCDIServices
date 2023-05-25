package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaListaTareaEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaListaTareaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaListaTareaServiceImplementacion implements ConsultaListaTareaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaListaTareaEntity> ConsultaListaTareas() {
        try {
            StoredProcedureQuery conslist = repositorio.createNamedStoredProcedureQuery("PaConsultaListaTarea");
            return conslist.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
