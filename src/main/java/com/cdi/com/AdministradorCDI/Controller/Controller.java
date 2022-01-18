package com.cdi.com.AdministradorCDI.Controller;

import com.cdi.com.AdministradorCDI.Entity.ConsultaBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaProyectosEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaServidoresEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaUsuarioEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaClientesEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaHardwareServEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaProyectoEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaServidorEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaTipoBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaTipoServidorEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaUsuarioEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaBackupService;
import com.cdi.com.AdministradorCDI.Services.ConsultaProyectosService;
import com.cdi.com.AdministradorCDI.Services.ConsultaServidoresService;
import com.cdi.com.AdministradorCDI.Services.ConsultaUsuarioService;
import com.cdi.com.AdministradorCDI.Services.InsertaBackupService;
import com.cdi.com.AdministradorCDI.Services.InsertaClientesService;
import com.cdi.com.AdministradorCDI.Services.InsertaHardwareServService;
import com.cdi.com.AdministradorCDI.Services.InsertaProyectoService;
import com.cdi.com.AdministradorCDI.Services.InsertaServidorService;
import com.cdi.com.AdministradorCDI.Services.InsertaTipoBackupService;
import com.cdi.com.AdministradorCDI.Services.InsertaTipoServidorService;
import com.cdi.com.AdministradorCDI.Services.InsertaUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = "application/json", method = {RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH})
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.DELETE})

public class Controller {

    @Autowired
    ConsultaBackupService serviceConsultaBackupService;

    @Autowired
    ConsultaProyectosService serviceConsultaProyectosService;

    @Autowired
    InsertaBackupService serviceInsertaBackupService;

    @Autowired
    ConsultaServidoresService serviceConsultaServidoresService;

    @Autowired
    ConsultaUsuarioService serviceConsultaUsuarioService;

    @Autowired
    InsertaClientesService serviceInsertaClientesService;

    @Autowired
    InsertaHardwareServService serviceInsertaHardwareServService;

    @Autowired
    InsertaServidorService serviceInsertaServidorService;

    @Autowired
    InsertaProyectoService serviceInsertaProyectoService;

    @Autowired
    InsertaTipoBackupService serviceInsertaTipoBackupService;

    @Autowired
    InsertaTipoServidorService serviceInsertaTipoServidorService;
    
    @Autowired
    InsertaUsuarioService serviceInsertaUsuarioService;

    @GetMapping("/consultabackup/{Nombre_Bck}/{Ip}/{Usuario}/{Cliente}")
    public List<ConsultaBackupEntity> ConsultaBackup(
            @PathVariable String Nombre_Bck,
            @PathVariable String Ip,
            @PathVariable String Usuario,
            @PathVariable String Cliente) {
        return serviceConsultaBackupService.ConsultaBackup(Nombre_Bck, Ip, Usuario, Cliente);
    }

    @GetMapping("/consultaproyect/{bandera}")
    public List<ConsultaProyectosEntity> ConsultaProyect(
            @PathVariable Integer bandera) {
        return serviceConsultaProyectosService.ConsultaProyect(bandera);
    }

    @GetMapping("/consultaservidors/{bandera}")
    public List<ConsultaServidoresEntity> ConsultaServ(
            @PathVariable Integer bandera) {
        return serviceConsultaServidoresService.ConsultaServ(bandera);
    }

    @GetMapping("/consultausuarios")
    public List<ConsultaUsuarioEntity> ConsultaUsuario() {
        return serviceConsultaUsuarioService.ConsultaUsuario();
    }

    @PostMapping("/insertarbackup/{Bandera}")
    public String InsertarBackup(
            @RequestBody InsertaBackupEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaBackupService.InsertarBackup(entidad, Bandera);
    }

    @PutMapping("/actualizabackup/{Bandera}")
    public String ActualizarBackup(
            @RequestBody InsertaBackupEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaBackupService.ActualizarBackup(entidad, Bandera);
    }

    @PostMapping("/insertarcliente/{Bandera}")
    public String InsertaCliente(
            @RequestBody InsertaClientesEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaClientesService.InsertaCliente(entidad, Bandera);
    }

    @PutMapping("/actualizacliente/{Bandera}")
    public String ActualizaCliente(
            @RequestBody InsertaClientesEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaClientesService.ActualizaCliente(entidad, Bandera);
    }

    @PostMapping("/insertarhardserv/{Bandera}")
    public String InsertarHardServ(
            @RequestBody InsertaHardwareServEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaHardwareServService.InsertarHardServ(entidad, Bandera);
    }

    @PutMapping("/actualizachardserv/{Bandera}")
    public String ActualizarHardServ(
            @RequestBody InsertaHardwareServEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaHardwareServService.ActualizarHardServ(entidad, Bandera);
    }

    @PostMapping("/insertaserv/{Bandera}")
    public String InsertarServidor(
            @RequestBody InsertaServidorEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaServidorService.InsertarServidor(entidad, Bandera);
    }

    @PutMapping("/actualizaserv/{Bandera}")
    public String ActualizarServidor(
            @RequestBody InsertaServidorEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaServidorService.ActualizarServidor(entidad, Bandera);
    }

    @PostMapping("/insertaproyecto/{Bandera}")
    public String InsertarProyecto(
            @RequestBody InsertaProyectoEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaProyectoService.InsertarProyecto(entidad, Bandera);
    }

    @PutMapping("/actualizaproyecto/{Bandera}")
    public String ActualizarProyecto(
            @RequestBody InsertaProyectoEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaProyectoService.ActualizarProyecto(entidad, Bandera);
    }

    @PostMapping("/insertatipobackup/{Bandera}")
    public String InsertaTipoBackup(
            @RequestBody InsertaTipoBackupEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaTipoBackupService.InsertaTipoBackup(entidad, Bandera);
    }

    @PutMapping("/actualizatipobackup/{Bandera}")
    public String ActualizaTipoBackup(
            @RequestBody InsertaTipoBackupEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaTipoBackupService.ActualizaTipoBackup(entidad, Bandera);
    }

    @PostMapping("/insertatiposervidor/{Bandera}")
    public String InsertaTipoServidor(
            @RequestBody InsertaTipoServidorEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaTipoServidorService.InsertaTipoServidor(entidad, Bandera);
    }

    @PutMapping("/actualizatiposervidor/{Bandera}")
    public String ActualizaTipoServidor(
            @RequestBody InsertaTipoServidorEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaTipoServidorService.ActualizaTipoServidor(entidad, Bandera);
    }
    
       @PostMapping("/insertausuario/{Bandera}")
    public String InsertaUsuario(
            @RequestBody InsertaUsuarioEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaUsuarioService.InsertaUsuario(entidad, Bandera);
    }

    @PutMapping("/actualizausuario/{Bandera}")
    public String ActualizaUsuario(
            @RequestBody InsertaUsuarioEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaUsuarioService.ActualizaUsuario(entidad, Bandera);
    }
}
