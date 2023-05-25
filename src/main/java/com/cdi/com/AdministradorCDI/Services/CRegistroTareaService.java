package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.CRegistroTareasEntity;
import java.util.List;

public interface CRegistroTareaService {

    public List<CRegistroTareasEntity> ConsultaRegistroTarea(CRegistroTareasEntity entidad, Integer Bandera);
}
