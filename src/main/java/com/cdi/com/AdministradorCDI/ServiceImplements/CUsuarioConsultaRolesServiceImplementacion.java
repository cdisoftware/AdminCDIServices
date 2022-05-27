package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.CUsuarioConsultaRolesEntity;
import com.cdi.com.AdministradorCDI.Services.CUsuarioConsultaRolesService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CUsuarioConsultaRolesServiceImplementacion implements CUsuarioConsultaRolesService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CUsuarioConsultaRolesEntity> ConsultaUserRoles(Integer Bandera, Integer IdUsuario) {
        try {
            StoredProcedureQuery consbackup = repositorio.createNamedStoredProcedureQuery("paCUsuarioConsultaRoles");
            consbackup.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consbackup.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            consbackup.setParameter("Bandera", Bandera);
            consbackup.setParameter("IdUsuario", IdUsuario);
            return consbackup.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
