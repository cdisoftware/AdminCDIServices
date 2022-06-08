package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.CRegistroTareasModEntity;

public interface CRegistroTareasModService {

    public String InsertarRegTareasMod(CRegistroTareasModEntity entidad, Integer Bandera);

    public String ActualizarRegTareasMod(CRegistroTareasModEntity entidad, Integer Bandera);

    public String EliminaRegTareasMod(CRegistroTareasModEntity entidad, Integer Bandera);

}
