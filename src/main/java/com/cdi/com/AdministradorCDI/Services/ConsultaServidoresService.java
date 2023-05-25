package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.ConsultaServidoresEntity;
import java.util.List;

public interface ConsultaServidoresService {

    public List<ConsultaServidoresEntity> ConsultaServ(Integer bandera, String IpServidor, String SO, Integer Estado, String TipoUser);
}
