package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.InsertaHardwareServEntity;

public interface InsertaHardwareServService {

    public String InsertarHardServ(InsertaHardwareServEntity entidad, Integer Bandera);

    public String ActualizarHardServ(InsertaHardwareServEntity entidad, Integer Bandera);
}
