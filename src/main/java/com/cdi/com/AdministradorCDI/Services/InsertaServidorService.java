package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.InsertaServidorEntity;

public interface InsertaServidorService {

    public String InsertarServidor(InsertaServidorEntity entidad, Integer Bandera);

    public String ActualizarServidordos(InsertaServidorEntity entidad, Integer Bandera);
    public String ActualizarServidorcuatro(InsertaServidorEntity entidad, Integer Bandera, Integer ServidorAloja);

}
