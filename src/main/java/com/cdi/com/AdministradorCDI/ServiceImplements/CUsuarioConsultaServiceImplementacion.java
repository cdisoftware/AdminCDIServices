package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.CUsuarioConsultaEntity;
import com.cdi.com.AdministradorCDI.Services.CUsuarioConsultaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CUsuarioConsultaServiceImplementacion implements CUsuarioConsultaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CUsuarioConsultaEntity> ConsultaCUsuario(Integer Bandera, Integer Idusuario, Integer Estado, Integer IdRol, Integer IdUsuarioCons, String NombreUsuario) {
        try {
            StoredProcedureQuery consUserC = repositorio.createNamedStoredProcedureQuery("paCUsuarioConsulta");
            consUserC.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consUserC.registerStoredProcedureParameter("Idusuario", Integer.class, ParameterMode.IN);
            consUserC.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            consUserC.registerStoredProcedureParameter("IdRol", Integer.class, ParameterMode.IN);
            consUserC.registerStoredProcedureParameter("IdUsuarioCons", Integer.class, ParameterMode.IN);
            consUserC.registerStoredProcedureParameter("NombreUsuario", String.class, ParameterMode.IN);
            consUserC.setParameter("Bandera", Bandera);
            consUserC.setParameter("Idusuario", Idusuario);
            consUserC.setParameter("Estado", Estado);
            consUserC.setParameter("IdRol", IdRol);
            consUserC.setParameter("IdUsuarioCons", IdUsuarioCons);
            consUserC.setParameter("NombreUsuario", NombreUsuario);
            return consUserC.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
