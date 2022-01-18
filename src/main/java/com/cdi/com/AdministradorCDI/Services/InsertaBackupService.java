
package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.InsertaBackupEntity;


public interface InsertaBackupService {
    
    public String InsertarBackup(InsertaBackupEntity entidad, Integer Bandera);
    public String ActualizarBackup(InsertaBackupEntity entidad, Integer Bandera);
    
}
