package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.CUsuarioRolModificaEntity;

public interface CUsuarioRolModificaService {

    public String InsertaUserRolModifica(CUsuarioRolModificaEntity entidad, Integer Bandera, Integer IdUsuarioRol, Integer IdUsuario);

    public String EliminaUserRolModifica(CUsuarioRolModificaEntity entidad, Integer Bandera, Integer IdUsuarioRol, Integer IdUsuario);

}
