package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.ConsultaTipoServidorEntity;
import java.util.List;

public interface ConsultaTipoServidorService {

    public List<ConsultaTipoServidorEntity> ConsultaTipoServidor(ConsultaTipoServidorEntity entidad, Integer IdTipoServidor);
}
