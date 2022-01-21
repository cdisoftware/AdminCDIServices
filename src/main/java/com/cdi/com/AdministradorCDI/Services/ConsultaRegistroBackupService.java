
package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.ConsultaRegistroBackupEntity;
import java.util.List;


public interface ConsultaRegistroBackupService {
    
    public List<ConsultaRegistroBackupEntity> ConsultaRegistBck(ConsultaRegistroBackupEntity entidad, Integer Nombre_Bck);
}
