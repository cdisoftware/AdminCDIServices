package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.ConsultaServiciosEntity;
import java.util.List;

public interface ConsultaServiciosService {

    public List<ConsultaServiciosEntity> ConsultaServicios(Integer IdProyecto, String TipoServicio, String Prioridad, String NombreSp);
}
