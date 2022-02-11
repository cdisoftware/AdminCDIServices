package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.ConsultaDetallesServidorEntity;
import java.util.List;

public interface ConsultaDetallesServidorService {

    public List<ConsultaDetallesServidorEntity> ConsultaDetallServ(Integer bandera, Integer IdServidor);
}
