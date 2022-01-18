package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.InsertaTipoServidorEntity;

public interface InsertaTipoServidorService {

    public String InsertaTipoServidor(InsertaTipoServidorEntity entidad, Integer Bandera);

    public String ActualizaTipoServidor(InsertaTipoServidorEntity entidad, Integer Bandera);

}
