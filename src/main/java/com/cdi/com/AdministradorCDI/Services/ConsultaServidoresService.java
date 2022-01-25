package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.ConsultaServidoresEntity;
import java.util.List;

public interface ConsultaServidoresService {

    public List<ConsultaServidoresEntity> ConsultaServ(Integer bandera, String NomServidor, String SO, Integer Estado, String Usuario);
}
