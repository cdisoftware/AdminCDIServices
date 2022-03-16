package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.ConsultaDesarollosPendientesEntity;
import java.util.List;

public interface ConsultaDesarollosPendientesService {

    public List<ConsultaDesarollosPendientesEntity> ConsultaDesrrlloPendient(Integer IdIntegrador, Integer IdProyecto);
}
