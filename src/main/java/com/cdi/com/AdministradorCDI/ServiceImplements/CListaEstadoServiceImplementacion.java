package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.CListaEstadoEntity;
import com.cdi.com.AdministradorCDI.Services.CListaEstadoService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CListaEstadoServiceImplementacion implements CListaEstadoService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CListaEstadoEntity> ConsultaListEstds() {
        try {
            StoredProcedureQuery listEstads = repositorio.createNamedStoredProcedureQuery("paCListaEstado");
            return listEstads.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
