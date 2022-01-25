package com.cdi.com.AdministradorCDI.ServiceImplements;

import com.cdi.com.AdministradorCDI.Entity.ConsultaServidoresEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaServidoresService;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ConsultaServidoresServiceImplementacion implements ConsultaServidoresService {

    @PersistenceContext
    private EntityManager repositorio;

    @Override
    public List<ConsultaServidoresEntity> ConsultaServ(Integer bandera, String NomServidor, String SO,
            Integer Estado, String Usuario) {
        try {
            StoredProcedureQuery conservid = repositorio.createNamedStoredProcedureQuery("paConsultaServidores");
            conservid.registerStoredProcedureParameter("bandera", Integer.class, ParameterMode.IN);
            conservid.registerStoredProcedureParameter("NomServidor", String.class, ParameterMode.IN);
            conservid.registerStoredProcedureParameter("SO", String.class, ParameterMode.IN);
            conservid.registerStoredProcedureParameter("Estado", Integer.class, ParameterMode.IN);
            conservid.registerStoredProcedureParameter("Usuario", String.class, ParameterMode.IN);
            conservid.setParameter("bandera", bandera);
            conservid.setParameter("NomServidor", NomServidor);
            conservid.setParameter("SO", SO);
            conservid.setParameter("Estado", Estado);
            conservid.setParameter("Usuario", Usuario);
            return conservid.getResultList();
        } catch (Exception e) {
            List list = new ArrayList();
            list.add(0, JSONObject.quote("No fue posible ejecutar los datos, verifique el Log para validar la inconsistencia"));
            return list;
        }
    }

}
