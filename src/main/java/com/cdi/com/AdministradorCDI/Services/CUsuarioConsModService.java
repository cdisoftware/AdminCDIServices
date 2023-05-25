package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.CUsuarioConsModEntity;

public interface CUsuarioConsModService {

    public String InsertaUsuarioConsMod(CUsuarioConsModEntity entidad, Integer Bandera, Integer Idusuario);

    public String ActualizaUsuarioConsMod(CUsuarioConsModEntity entidad, Integer Bandera, Integer Idusuario);
}
