package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.CRolModEntity;

public interface CRolModService {

    public String InsertaRolMod(CRolModEntity entidad, Integer Bandera, Integer IdUsuario);
    public String ActualizaRolMod(CRolModEntity entidad, Integer Bandera, Integer IdUsuario);
}
