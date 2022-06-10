package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.CUsuarioInfoConsolaEntity;
import com.cdi.com.AdministradorCDI.Entity.EncriptacionEntity;

public interface CUsuarioInfoConsolaService {

    public String ConsultaUsuarioInfoConsola(CUsuarioInfoConsolaEntity entidad, Integer bandera);

    public String Clave(EncriptacionEntity entidad);

}
