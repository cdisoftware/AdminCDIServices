package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.CUsuarioInfoConsolaEntity;
import com.cdi.com.AdministradorCDI.Services.CUsuarioInfoConsolaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CUsuarioInfoConsolaServiceImplementacion implements CUsuarioInfoConsolaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CUsuarioInfoConsolaEntity> ConsultaUsuarioInfoConsola(String Usuario, String Acceso) {
        try {
            StoredProcedureQuery usuarioinfo = repositorio.createNamedStoredProcedureQuery("paCUsuarioInfoConsola");
            usuarioinfo.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            usuarioinfo.registerStoredProcedureParameter("Acceso", String.class, ParameterMode.IN);
            usuarioinfo.setParameter("Usuario", Usuario);
            usuarioinfo.setParameter("Acceso", Acceso);
            return usuarioinfo.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
