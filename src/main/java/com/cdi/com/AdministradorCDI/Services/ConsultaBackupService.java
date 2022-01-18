
package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.ConsultaBackupEntity;
import java.util.List;

public interface ConsultaBackupService {
    
    public List<ConsultaBackupEntity> ConsultaBackup(String Nombre_Bck, String Ip, String Usuario, String Cliente);
}
