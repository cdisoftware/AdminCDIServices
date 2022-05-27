package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.CUsuarioInfoConsolaEntity;
import java.util.List;

public interface CUsuarioInfoConsolaService {

    public List<CUsuarioInfoConsolaEntity> ConsultaUsuarioInfoConsola(CUsuarioInfoConsolaEntity entidad, Integer bandera);
}
