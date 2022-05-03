package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.CPermisosRolEntity;
import java.util.List;

public interface CPermisosRolService {

    public List<CPermisosRolEntity> ConsultaPermisosRol(Integer bandera, Integer IdRol, String NombreRol);
}
