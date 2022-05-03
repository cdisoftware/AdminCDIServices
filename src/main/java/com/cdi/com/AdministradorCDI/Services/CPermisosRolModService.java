package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.CPermisosRolModEntity;

public interface CPermisosRolModService {

    public String InsertaCPermisosRolMod(CPermisosRolModEntity entidad, Integer Bandera, Integer IdUsuario);

    public String ActualizaCPermisosRolMod(CPermisosRolModEntity entidad, Integer Bandera, Integer IdUsuario);

}
