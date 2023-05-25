package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.CListaFiltrosEntity;
import com.cdi.com.AdministradorCDI.Services.CListaFiltrosService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CListaFiltrosServiceImplementacion implements CListaFiltrosService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CListaFiltrosEntity> ConsultaListFiltrs(Integer Bandera) {
        try {
            StoredProcedureQuery listFltrs = repositorio.createNamedStoredProcedureQuery("paCListaFiltros");
            listFltrs.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            listFltrs.setParameter("Bandera", Bandera);
            return listFltrs.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
