package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsAdminPublicacionesEntity;
import com.cdi.com.AdministradorCDI.Services.ConsAdminPublicacionesService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsAdminPublicacionesServiceImplementacion implements ConsAdminPublicacionesService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsAdminPublicacionesEntity> ConsAdminPublic(ConsAdminPublicacionesEntity entidad, Integer Bandera, Integer TipoPublicacion, Integer Estado) {
        try {
            StoredProcedureQuery tpoDoc = repositorio.createNamedStoredProcedureQuery("PaConsAdminPublicaciones");
            tpoDoc.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("TipoPublicacion", Integer.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("IpPublicacion", String.class, ParameterMode.IN);
            tpoDoc.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);

            tpoDoc.setParameter("Bandera", Bandera);
            tpoDoc.setParameter("TipoPublicacion", TipoPublicacion);
            tpoDoc.setParameter("IpPublicacion", entidad.getIpPublicacion());
            tpoDoc.setParameter("Estado", Estado);

            return tpoDoc.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
