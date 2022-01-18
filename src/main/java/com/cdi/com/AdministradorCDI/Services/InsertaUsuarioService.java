package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.InsertaUsuarioEntity;

public interface InsertaUsuarioService {

    public String InsertaUsuario(InsertaUsuarioEntity entidad, Integer Bandera);

    public String ActualizaUsuario(InsertaUsuarioEntity entidad, Integer Bandera);
}
