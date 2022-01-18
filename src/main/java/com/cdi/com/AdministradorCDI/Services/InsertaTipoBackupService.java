package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.InsertaTipoBackupEntity;

public interface InsertaTipoBackupService {

    public String InsertaTipoBackup(InsertaTipoBackupEntity entidad, Integer Bandera);

    public String ActualizaTipoBackup(InsertaTipoBackupEntity entidad, Integer Bandera);
}
