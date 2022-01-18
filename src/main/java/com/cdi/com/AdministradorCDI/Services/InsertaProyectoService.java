package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.InsertaProyectoEntity;

public interface InsertaProyectoService {

    public String InsertarProyecto(InsertaProyectoEntity entidad, Integer Bandera);

    public String ActualizarProyecto(InsertaProyectoEntity entidad, Integer Bandera);
}
