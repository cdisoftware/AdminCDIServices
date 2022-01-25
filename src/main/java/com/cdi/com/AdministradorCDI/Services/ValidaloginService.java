package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.ValidaloginEntity;
import java.util.List;

public interface ValidaloginService {

    public List<ValidaloginEntity> ConsultaValidLogin(ValidaloginEntity entidad);
}
