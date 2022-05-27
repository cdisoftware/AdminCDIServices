package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.CUsuarioConsultaEntity;
import java.util.List;

public interface CUsuarioConsultaService {

    public List<CUsuarioConsultaEntity> ConsultaCUsuario(Integer Bandera, Integer Idusuario, Integer Estado, Integer IdRol, Integer IdUsuarioCons, String NombreUsuario);
}
