
package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.InsertaClientesEntity;


public interface InsertaClientesService {
    
    public String InsertaCliente(InsertaClientesEntity entidad, Integer Bandera);
    public String ActualizaCliente(InsertaClientesEntity entidad, Integer Bandera);
}
