package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.CUsuarioConsultaRolesEntity;
import java.util.List;

public interface CUsuarioConsultaRolesService {

    public List<CUsuarioConsultaRolesEntity> ConsultaUserRoles(Integer Bandera, Integer IdUsuario);
}
