package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.CPermisosRolEntity;
import com.cdi.com.AdministradorCDI.Services.CPermisosRolService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CPermisosRolServiceImplementacion implements CPermisosRolService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CPermisosRolEntity> ConsultaPermisosRol(Integer bandera, Integer IdRol, String NombreRol) {
        try {
            StoredProcedureQuery consPermisosrol = repositorio.createNamedStoredProcedureQuery("paCPermisosRol");
            consPermisosrol.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            consPermisosrol.registerStoredProcedureParameter("IdRol", Integer.class, ParameterMode.IN);
            consPermisosrol.registerStoredProcedureParameter("NombreRol", String.class, ParameterMode.IN);
            consPermisosrol.setParameter("bandera", bandera);
            consPermisosrol.setParameter("IdRol", IdRol);
            consPermisosrol.setParameter("NombreRol", NombreRol);
            return consPermisosrol.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
