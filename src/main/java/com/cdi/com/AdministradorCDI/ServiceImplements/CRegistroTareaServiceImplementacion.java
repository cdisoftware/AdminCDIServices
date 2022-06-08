package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.CRegistroTareasEntity;
import com.cdi.com.AdministradorCDI.Services.CRegistroTareaService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class CRegistroTareaServiceImplementacion implements CRegistroTareaService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<CRegistroTareasEntity> ConsultaRegistroTarea(CRegistroTareasEntity entidad, Integer Bandera) {
        try {
            StoredProcedureQuery consregtareas = repositorio.createNamedStoredProcedureQuery("paCRegistroTareas");
            consregtareas.registerStoredProcedureParameter("Bandera", Integer.class, ParameterMode.IN);
            consregtareas.registerStoredProcedureParameter("IdActividad", Integer.class, ParameterMode.IN);
            consregtareas.registerStoredProcedureParameter("Id_U", Integer.class, ParameterMode.IN);
            consregtareas.registerStoredProcedureParameter("Id_Pry", Integer.class, ParameterMode.IN);
            consregtareas.registerStoredProcedureParameter("IdTipoTarea", Integer.class, ParameterMode.IN);
            consregtareas.registerStoredProcedureParameter("Descripcion", String.class, ParameterMode.IN);
            consregtareas.registerStoredProcedureParameter("Tiempo", Integer.class, ParameterMode.IN);
            consregtareas.registerStoredProcedureParameter("Fecharegistro", String.class, ParameterMode.IN);
            consregtareas.registerStoredProcedureParameter("NombreUsuario", String.class, ParameterMode.IN);

            consregtareas.setParameter("Bandera", Bandera);
            consregtareas.setParameter("IdActividad", entidad.getIdActividad());
            consregtareas.setParameter("Id_U", entidad.getId_U());
            consregtareas.setParameter("Id_Pry", entidad.getId_Pry());
            consregtareas.setParameter("IdTipoTarea", entidad.getIdTipoTarea());
            consregtareas.setParameter("Descripcion", entidad.getDescripcionTarea());
            consregtareas.setParameter("Tiempo", entidad.getTiempo());
            consregtareas.setParameter("Fecharegistro", entidad.getFechaRegistro());
            consregtareas.setParameter("NombreUsuario", entidad.getUsuario());

            return consregtareas.getResultList();
        } catch (Exception ex) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
