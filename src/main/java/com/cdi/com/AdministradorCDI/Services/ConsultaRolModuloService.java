package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.ConsultaRolModuloEntity;
import java.util.List;

public interface ConsultaRolModuloService {

    public List<ConsultaRolModuloEntity> ConsultaRolModulo(Integer IdRol, String Modulo);
}
