package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.CListaRolEntity;
import com.cdi.com.AdministradorCDI.Services.CListaRolService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CListaRolServiceImplementacion implements CListaRolService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CListaRolEntity> ConsultaListRol(Integer Bandera) {
        try {
            StoredProcedureQuery listRol = repositorio.createNamedStoredProcedureQuery("paCListaRol");
            listRol.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            listRol.setParameter("Bandera", Bandera);
            return listRol.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
