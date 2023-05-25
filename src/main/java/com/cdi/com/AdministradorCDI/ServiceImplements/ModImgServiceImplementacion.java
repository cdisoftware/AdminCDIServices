package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ModImgEntity;
import com.cdi.com.AdministradorCDI.Services.ModImgService;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ModImgServiceImplementacion implements ModImgService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public String ActualizaImagen(ModImgEntity entidad, Integer IdUsuario) {
        try {
            StoredProcedureQuery actimg = repositorio.createNamedStoredProcedureQuery("PaModImg");
            actimg.registerStoredProcedureParameter("IdUsuario", Integer.class, ParameterMode.IN);
            actimg.registerStoredProcedureParameter("UrlUsuario", String.class, ParameterMode.IN);
            actimg.setParameter("IdUsuario", IdUsuario);
            actimg.setParameter("UrlUsuario", entidad.getUrlFoto());
            actimg.execute();
            return null;
        } catch (Exception ex) {
            return JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia");
        }

    }

}
