package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.ConsultaHardwareEntity;
import java.util.List;

public interface ConsultaHardwareService {
    public List<ConsultaHardwareEntity> ConsultaHardware(Integer IdServidor, String DiscoDuro, String Ram, String Procesador);
}
