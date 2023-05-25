package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.ConsAdminPublicacionesEntity;
import java.util.List;

public interface ConsAdminPublicacionesService {

    public List<ConsAdminPublicacionesEntity> ConsAdminPublic(ConsAdminPublicacionesEntity entidad, Integer Bandera, Integer TipoPublicacion, Integer Estado);
}
