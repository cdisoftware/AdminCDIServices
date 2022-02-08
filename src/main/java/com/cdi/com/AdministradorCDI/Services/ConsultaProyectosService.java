
package com.cdi.com.AdministradorCDI.Services;

import com.cdi.com.AdministradorCDI.Entity.ConsultaProyectosEntity;
import java.util.List;


public interface ConsultaProyectosService {
 
    public List<ConsultaProyectosEntity> ConsultaProyect(Integer bandera, String Nombre, Integer IdCliente);
}
