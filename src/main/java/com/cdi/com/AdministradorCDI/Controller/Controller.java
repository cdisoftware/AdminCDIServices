package com.cdi.com.AdministradorCDI.Controller;

import com.cdi.com.AdministradorCDI.Entity.ConsultaBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaClienteEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaHardwareEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaProyectosEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaRegistroBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaServidoresEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaTipoBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaTipoServidorEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaUsuarioEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaClientesEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaHardwareServEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaProyectoEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaRegistroBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaServidorEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaTipoBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaTipoServidorEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaUsuarioEntity;
import com.cdi.com.AdministradorCDI.Entity.ValidaloginEntity;
import com.cdi.com.AdministradorCDI.Services.ConsultaBackupService;
import com.cdi.com.AdministradorCDI.Services.ConsultaClienteService;
import com.cdi.com.AdministradorCDI.Services.ConsultaHardwareService;
import com.cdi.com.AdministradorCDI.Services.ConsultaProyectosService;
import com.cdi.com.AdministradorCDI.Services.ConsultaRegistroBackupService;
import com.cdi.com.AdministradorCDI.Services.ConsultaServidoresService;
import com.cdi.com.AdministradorCDI.Services.ConsultaTipoBackupService;
import com.cdi.com.AdministradorCDI.Services.ConsultaTipoServidorService;
import com.cdi.com.AdministradorCDI.Services.ConsultaUsuarioService;
import com.cdi.com.AdministradorCDI.Services.InsertaBackupService;
import com.cdi.com.AdministradorCDI.Services.InsertaClientesService;
import com.cdi.com.AdministradorCDI.Services.InsertaHardwareServService;
import com.cdi.com.AdministradorCDI.Services.InsertaProyectoService;
import com.cdi.com.AdministradorCDI.Services.InsertaRegistroBackupService;
import com.cdi.com.AdministradorCDI.Services.InsertaServidorService;
import com.cdi.com.AdministradorCDI.Services.InsertaTipoBackupService;
import com.cdi.com.AdministradorCDI.Services.InsertaTipoServidorService;
import com.cdi.com.AdministradorCDI.Services.InsertaUsuarioService;
import com.cdi.com.AdministradorCDI.Services.ValidaloginService;
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

    @Autowired
    ConsultaRegistroBackupService serviceConsultaRegistroBackupService;

    @Autowired
    ConsultaTipoBackupService serviceConsultaTipoBackupService;

    @Autowired
    ValidaloginService serviceValidaloginService;

    @Autowired
    InsertaRegistroBackupService serviceInsertaRegistroBackupService;

    @Autowired
    ConsultaTipoServidorService serviceConsultaTipoServidorService;

    @Autowired
    ConsultaClienteService serviceConsultaClienteService;

    @Autowired
    ConsultaHardwareService serviceConsultaHardwareService;

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

    @GetMapping("/consultaservidors/{bandera}/{NomServidor}/{SO}/{Estado}/{Usuario}")
    public List<ConsultaServidoresEntity> ConsultaServ(
            @PathVariable Integer bandera,
            @PathVariable String NomServidor,
            @PathVariable String SO,
            @PathVariable Integer Estado,
            @PathVariable String Usuario) {
        return serviceConsultaServidoresService.ConsultaServ(bandera, NomServidor, SO, Estado, Usuario);
    }

    @GetMapping("/consultausuarios")
    public List<ConsultaUsuarioEntity> ConsultaUsuario(
            @RequestBody ConsultaUsuarioEntity entidad) {
        return serviceConsultaUsuarioService.ConsultaUsuario(entidad);
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

    @PutMapping("/actualizaservdos/{Bandera}")
    public String ActualizarServidordos(
            @RequestBody InsertaServidorEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceInsertaServidorService.ActualizarServidordos(entidad, Bandera);
    }
    
    @PutMapping("/actualizaservcuatro/{Bandera}/{ServidorAloja}")
    public String ActualizarServidorcuatro(
            @RequestBody InsertaServidorEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer ServidorAloja) {
        return serviceInsertaServidorService.ActualizarServidorcuatro(entidad, Bandera, ServidorAloja);
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

    @GetMapping("/consultaregistbck/{Nombre_Bck}")
    public List<ConsultaRegistroBackupEntity> ConsultaRegistBck(
            @RequestBody ConsultaRegistroBackupEntity entidad,
            @PathVariable Integer Nombre_Bck) {
        return serviceConsultaRegistroBackupService.ConsultaRegistBck(entidad, Nombre_Bck);
    }

    @PostMapping("/consultatipobck")
    public List<ConsultaTipoBackupEntity> ConsultaTipoBackup(
            @RequestBody ConsultaTipoBackupEntity entidad) {
        return serviceConsultaTipoBackupService.ConsultaTipoBackup(entidad);
    }

    @PostMapping("/consultavalidlogin")
    public List<ValidaloginEntity> ConsultaValidLogin(
            @RequestBody ValidaloginEntity entidad) {
        return serviceValidaloginService.ConsultaValidLogin(entidad);
    }

    @PostMapping("/insertaregistbck")
    public String InsertaRegistroBCK(
            @RequestBody InsertaRegistroBackupEntity entidad) {
        return serviceInsertaRegistroBackupService.InsertaRegistroBCK(entidad);
    }

    @PostMapping("/consultatiposerv/{IdTipoServidor}")
    public List<ConsultaTipoServidorEntity> ConsultaTipoServidor(
            @RequestBody ConsultaTipoServidorEntity entidad,
            @PathVariable Integer IdTipoServidor) {//Solo cuando se envia por url algun parametro
        return serviceConsultaTipoServidorService.ConsultaTipoServidor(entidad, IdTipoServidor);
    }

    @PostMapping("/consultacliente")
    public List<ConsultaClienteEntity> ConsultaCliente(
            @RequestBody ConsultaClienteEntity entidad) {
        return serviceConsultaClienteService.ConsultaCliente(entidad);
    }
    
    @GetMapping("/consultahardware/{IdServidor}/{DiscoDuro}/{Ram}/{Procesador}")
    public List<ConsultaHardwareEntity> ConsultaHardware(
            @PathVariable Integer IdServidor,
            @PathVariable String DiscoDuro,
            @PathVariable String Ram,
            @PathVariable String Procesador) {
        return serviceConsultaHardwareService.ConsultaHardware(IdServidor, DiscoDuro, Ram, Procesador);
    }
}
