package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.InsertaServidorEntity;

public interface InsertaServidorService {

    public String InsertarServidor(InsertaServidorEntity entidad, Integer Bandera);

    public String ActualizarServidor(InsertaServidorEntity entidad, Integer Bandera);
}
