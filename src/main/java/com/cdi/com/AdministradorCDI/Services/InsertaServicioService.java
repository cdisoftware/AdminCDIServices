package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.InsertaServicioEntity;

public interface InsertaServicioService {

    public String InsertaServicio(InsertaServicioEntity entidad, Integer bandera);

    public String ActualizaServicio(InsertaServicioEntity entidad, Integer bandera);
}
