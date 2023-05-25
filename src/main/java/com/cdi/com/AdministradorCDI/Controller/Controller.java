package com.cdi.com.AdministradorCDI.Controller;

import com.cdi.com.AdministradorCDI.Entity.CListaEstadoEntity;
import com.cdi.com.AdministradorCDI.Entity.CListaFiltrosEntity;
import com.cdi.com.AdministradorCDI.Entity.CListaRolEntity;
import com.cdi.com.AdministradorCDI.Entity.CPermisosRolEntity;
import com.cdi.com.AdministradorCDI.Entity.CPermisosRolModEntity;
import com.cdi.com.AdministradorCDI.Entity.CRegistroTareasEntity;
import com.cdi.com.AdministradorCDI.Entity.CRegistroTareasModEntity;
import com.cdi.com.AdministradorCDI.Entity.CRolModEntity;
import com.cdi.com.AdministradorCDI.Entity.CUsuarioConsModEntity;
import com.cdi.com.AdministradorCDI.Entity.CUsuarioConsultaEntity;
import com.cdi.com.AdministradorCDI.Entity.CUsuarioConsultaRolesEntity;
import com.cdi.com.AdministradorCDI.Entity.CUsuarioInfoConsolaEntity;
import com.cdi.com.AdministradorCDI.Entity.CUsuarioRolModificaEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaClienteEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaDesarollosPendientesEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaDetallesServidorEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaGrilaProyecBckEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaHardwareEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaInfoUserEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaListaTareaEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaProyectosEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaRegistroBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaRolModuloEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaServiciosEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaServidoresEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaTipoBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.ConsultaTipoServidorEntity;
import com.cdi.com.AdministradorCDI.Entity.EliminaBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.EliminaClienteEntity;
import com.cdi.com.AdministradorCDI.Entity.EliminaHardwareEntity;
import com.cdi.com.AdministradorCDI.Entity.EliminaProyectoEntity;
import com.cdi.com.AdministradorCDI.Entity.EliminaRegistroBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.EliminaServicioEntity;
import com.cdi.com.AdministradorCDI.Entity.EliminaServidorEntity;
import com.cdi.com.AdministradorCDI.Entity.EliminaTipoBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.EliminaTipoServidorEntity;
import com.cdi.com.AdministradorCDI.Entity.EncriptacionEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaClientesEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaHardwareServEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaProyectoEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaRegistroBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaServicioEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaServidorEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaTipoBackupEntity;
import com.cdi.com.AdministradorCDI.Entity.InsertaTipoServidorEntity;
import com.cdi.com.AdministradorCDI.Entity.ModImgEntity;
import com.cdi.com.AdministradorCDI.Entity.UpdateDetalleServidorEntity;
import com.cdi.com.AdministradorCDI.Entity.UpdateInfoUsuarioEntity;
import com.cdi.com.AdministradorCDI.Entity.UpdateServicioRealizadoEntity;
import com.cdi.com.AdministradorCDI.Entity.UploadFileResponse;
import com.cdi.com.AdministradorCDI.ServiceImplements.FileStorageException;
import com.cdi.com.AdministradorCDI.ServiceImplements.FileStorageService;
import com.cdi.com.AdministradorCDI.Services.CListaEstadoService;
import com.cdi.com.AdministradorCDI.Services.CListaFiltrosService;
import com.cdi.com.AdministradorCDI.Services.CListaRolService;
import com.cdi.com.AdministradorCDI.Services.CPermisosRolModService;
import com.cdi.com.AdministradorCDI.Services.CPermisosRolService;
import com.cdi.com.AdministradorCDI.Services.CRegistroTareaService;
import com.cdi.com.AdministradorCDI.Services.CRegistroTareasModService;
import com.cdi.com.AdministradorCDI.Services.CRolModService;
import com.cdi.com.AdministradorCDI.Services.CUsuarioConsModService;
import com.cdi.com.AdministradorCDI.Services.CUsuarioConsultaRolesService;
import com.cdi.com.AdministradorCDI.Services.CUsuarioConsultaService;
import com.cdi.com.AdministradorCDI.Services.CUsuarioInfoConsolaService;
import com.cdi.com.AdministradorCDI.Services.CUsuarioRolModificaService;
import com.cdi.com.AdministradorCDI.Services.CValidaUsuarioConsolaService;
import com.cdi.com.AdministradorCDI.Services.ConsultaBackupService;
import com.cdi.com.AdministradorCDI.Services.ConsultaClienteService;
import com.cdi.com.AdministradorCDI.Services.ConsultaDesarollosPendientesService;
import com.cdi.com.AdministradorCDI.Services.ConsultaDetallesServidorService;
import com.cdi.com.AdministradorCDI.Services.ConsultaGrilaProyecBckService;
import com.cdi.com.AdministradorCDI.Services.ConsultaHardwareService;
import com.cdi.com.AdministradorCDI.Services.ConsultaInfoUserService;
import com.cdi.com.AdministradorCDI.Services.ConsultaListaTareaService;
import com.cdi.com.AdministradorCDI.Services.ConsultaProyectosService;
import com.cdi.com.AdministradorCDI.Services.ConsultaRegistroBackupService;
import com.cdi.com.AdministradorCDI.Services.ConsultaRolModuloService;
import com.cdi.com.AdministradorCDI.Services.ConsultaServiciosService;
import com.cdi.com.AdministradorCDI.Services.ConsultaServidoresService;
import com.cdi.com.AdministradorCDI.Services.ConsultaTipoBackupService;
import com.cdi.com.AdministradorCDI.Services.ConsultaTipoServidorService;
import com.cdi.com.AdministradorCDI.Services.EliminaBackupService;
import com.cdi.com.AdministradorCDI.Services.EliminaClienteService;
import com.cdi.com.AdministradorCDI.Services.EliminaHardwareService;
import com.cdi.com.AdministradorCDI.Services.EliminaProyectoService;
import com.cdi.com.AdministradorCDI.Services.EliminaRegistroBackupService;
import com.cdi.com.AdministradorCDI.Services.EliminaServicioService;
import com.cdi.com.AdministradorCDI.Services.EliminaServidorService;
import com.cdi.com.AdministradorCDI.Services.EliminaTipoBackupService;
import com.cdi.com.AdministradorCDI.Services.EliminaTipoServidorService;
import com.cdi.com.AdministradorCDI.Services.InsertaBackupService;
import com.cdi.com.AdministradorCDI.Services.InsertaClientesService;
import com.cdi.com.AdministradorCDI.Services.InsertaHardwareServService;
import com.cdi.com.AdministradorCDI.Services.InsertaProyectoService;
import com.cdi.com.AdministradorCDI.Services.InsertaRegistroBackupService;
import com.cdi.com.AdministradorCDI.Services.InsertaServicioService;
import com.cdi.com.AdministradorCDI.Services.InsertaServidorService;
import com.cdi.com.AdministradorCDI.Services.InsertaTipoBackupService;
import com.cdi.com.AdministradorCDI.Services.InsertaTipoServidorService;
import com.cdi.com.AdministradorCDI.Services.ModImgService;
import com.cdi.com.AdministradorCDI.Services.UpdateDetalleServidorService;
import com.cdi.com.AdministradorCDI.Services.UpdateInfoUsuarioService;
import com.cdi.com.AdministradorCDI.Services.UpdateServicioRealizadoService;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
    ConsultaRegistroBackupService serviceConsultaRegistroBackupService;
    
    @Autowired
    ConsultaTipoBackupService serviceConsultaTipoBackupService;
    
    @Autowired
    InsertaRegistroBackupService serviceInsertaRegistroBackupService;
    
    @Autowired
    ConsultaTipoServidorService serviceConsultaTipoServidorService;
    
    @Autowired
    ConsultaClienteService serviceConsultaClienteService;
    
    @Autowired
    ConsultaHardwareService serviceConsultaHardwareService;
    
    @Autowired
    ConsultaGrilaProyecBckService serviceConsultaGrilaProyecBckService;
    
    @Autowired
    EliminaBackupService serviceEliminaBackupService;
    
    @Autowired
    EliminaRegistroBackupService serviceEliminaRegistroBackupService;
    
    @Autowired
    EliminaServidorService serviceEliminaServidorService;
    
    @Autowired
    EliminaProyectoService serviceEliminaProyectoService;
    
    @Autowired
    EliminaTipoBackupService serviceEliminaTipoBackupService;
    
    @Autowired
    EliminaTipoServidorService serviceEliminaTipoServidorService;
    
    @Autowired
    EliminaHardwareService serviceEliminaHardwareService;
    
    @Autowired
    EliminaClienteService serviceEliminaClienteService;
    
    @Autowired
    ConsultaDetallesServidorService serviceConsultaDetallesServidorService;
    
    @Autowired
    UpdateDetalleServidorService serviceUpdateDetalleServidorService;
    
    @Autowired
    UpdateInfoUsuarioService serviceUpdateInfoUsuarioService;
    
    @Autowired
    ConsultaServiciosService serviceConsultaServiciosService;
    
    @Autowired
    private FileStorageService fileStorageService;
    
    @Autowired
    InsertaServicioService serviceInsertaServicioService;
    
    @Autowired
    ModImgService serviceModImgService;
    
    @Autowired
    ConsultaInfoUserService serviceConsultaInfoUserService;
    
    @Autowired
    EliminaServicioService serviceEliminaServicioService;
    
    @Autowired
    ConsultaDesarollosPendientesService serviceConsultaDesarollosPendientesService;
    
    @Autowired
    UpdateServicioRealizadoService serviceUpdateServicioRealizadoService;
    
    @Autowired
    CListaEstadoService serviceCListaEstadoService;
    
    @Autowired
    CListaFiltrosService serviceCListaFiltrosService;
    
    @Autowired
    CValidaUsuarioConsolaService serviceCValidaUsuarioConsolaService;
    
    @Autowired
    CUsuarioInfoConsolaService serviceCUsuarioInfoConsolaService;
    
    @Autowired
    CListaRolService serviceCListaRolService;
    
    @Autowired
    CRolModService serviceCRolModService;
    
    @Autowired
    CPermisosRolService serviceCPermisosRolService;
    
    @Autowired
    CPermisosRolModService serviceCPermisosRolModService;
    
    @Autowired
    CUsuarioConsModService serviceCUsuarioConsModService;
    
    @Autowired
    CUsuarioRolModificaService serviceCUsuarioRolModificaService;
    
    @Autowired
    CUsuarioConsultaRolesService serviceCUsuarioConsultaRolesService;
    
    @Autowired
    CUsuarioConsultaService serviceCUsuarioConsultaService;
    
    @Autowired
    ConsultaRolModuloService serviceConsultaRolModuloService;
    
    @Autowired
    ConsultaListaTareaService serviceConsultaListaTareaService;
    
    @Autowired
    CRegistroTareaService serviceCRegistroTareaService;
    
    @Autowired
    CRegistroTareasModService serviceCRegistroTareasModService;
    
    @GetMapping("/consultabackup/{Nombre_Bck}/{Ip}/{Usuario}/{Cliente}")
    public List<ConsultaBackupEntity> ConsultaBackup(
            @PathVariable String Nombre_Bck,
            @PathVariable String Ip,
            @PathVariable String Usuario,
            @PathVariable String Cliente) {
        return serviceConsultaBackupService.ConsultaBackup(Nombre_Bck, Ip, Usuario, Cliente);
    }
    
    @GetMapping("/consultaproyect/{bandera}/{Nombre}/{IdCliente}")
    public List<ConsultaProyectosEntity> ConsultaProyect(
            @PathVariable Integer bandera,
            @PathVariable String Nombre,
            @PathVariable Integer IdCliente) {
        return serviceConsultaProyectosService.ConsultaProyect(bandera, Nombre, IdCliente);
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
    
    @GetMapping("/consgrilaproyectbck/{IdProyecto}")
    public List<ConsultaGrilaProyecBckEntity> ConsultaGrilaProyectBck(
            @PathVariable Integer IdProyecto) {
        return serviceConsultaGrilaProyecBckService.ConsultaGrilaProyectBck(IdProyecto);
    }
    
    @DeleteMapping("/eliminabackup/{bandera}")
    public String EliminaBackup(
            @RequestBody EliminaBackupEntity entidad,
            @PathVariable Integer bandera) {
        return serviceEliminaBackupService.EliminaBackup(entidad, bandera);
    }
    
    @DeleteMapping("/eliminaregistbck/{bandera}")
    public String EliminaRegistBck(
            @RequestBody EliminaRegistroBackupEntity entidad,
            @PathVariable Integer bandera) {
        return serviceEliminaRegistroBackupService.EliminaRegistBck(entidad, bandera);
    }
    
    @DeleteMapping("/eliminaservidor/{bandera}")
    public String EliminaServidor(
            @RequestBody EliminaServidorEntity entidad,
            @PathVariable Integer bandera) {
        return serviceEliminaServidorService.EliminaServidor(entidad, bandera);
    }
    
    @DeleteMapping("/eliminaproyect/{bandera}")
    public String EliminaProyect(
            @RequestBody EliminaProyectoEntity entidad,
            @PathVariable Integer bandera) {
        return serviceEliminaProyectoService.EliminaProyect(entidad, bandera);
    }
    
    @DeleteMapping("/eliminatipobck/{bandera}")
    public String EliminaTipoBCK(
            @RequestBody EliminaTipoBackupEntity entidad,
            @PathVariable Integer bandera) {
        return serviceEliminaTipoBackupService.EliminaTipoBCK(entidad, bandera);
    }
    
    @DeleteMapping("/eliminatiposerv/{bandera}")
    public String EliminaTipoServ(
            @RequestBody EliminaTipoServidorEntity entidad,
            @PathVariable Integer bandera) {
        return serviceEliminaTipoServidorService.EliminaTipoServ(entidad, bandera);
    }
    
    @DeleteMapping("/eliminahardserv/{bandera}")
    public String EliminaHardServ(
            @RequestBody EliminaHardwareEntity entidad,
            @PathVariable Integer bandera) {
        return serviceEliminaHardwareService.EliminaHardServ(entidad, bandera);
    }
    
    @DeleteMapping("/eliminaclient/{bandera}")
    public String EliminaClient(
            @RequestBody EliminaClienteEntity entidad,
            @PathVariable Integer bandera) {
        return serviceEliminaClienteService.EliminaClient(entidad, bandera);
    }
    
    @GetMapping("/consdetallserv/{bandera}/{IdServidor}")
    public List<ConsultaDetallesServidorEntity> ConsultaDetallServ(
            @PathVariable Integer bandera,
            @PathVariable Integer IdServidor) {
        return serviceConsultaDetallesServidorService.ConsultaDetallServ(bandera, IdServidor);
    }
    
    @PutMapping("/updatedetllserv")
    public String UpdateDetllServ(
            @RequestBody UpdateDetalleServidorEntity entidad) {
        return serviceUpdateDetalleServidorService.UpdateDetllServ(entidad);
    }
    
    @PutMapping("/actualizainfousuario/{Bandera}")
    public String ActualizaInfoUser(
            @RequestBody UpdateInfoUsuarioEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceUpdateInfoUsuarioService.ActualizaInfoUser(entidad, Bandera);
    }
    
    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        String fileName = null;
        try {
            fileName = fileStorageService.storeFile(file);
        } catch (FileStorageException ex) {
            System.out.println("Error " + ex);
        }
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/ImagenesAdminCDI/")
                .path(fileName)
                .toUriString();
        fileDownloadUri = fileDownloadUri.replace(":8092/AdministradorCDI", "");
        try {
            file.transferTo(new File("C:/inetpub/wwwroot/ImagenesAdminCDI/" + fileName));
        } catch (IOException | IllegalStateException ex) {
            System.out.println("Error " + ex);
        }
        UploadFileResponse uploadfile = new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
        uploadfile.getFileDownloadUri();
        return JSONObject.quote("Archivo Subido Correctamente");
    }
    
    @GetMapping("/consultservicios/{IdProyecto}/{TipoServicio}/{Prioridad}/{NombreSp}")
    public List<ConsultaServiciosEntity> ConsultaServicios(
            @PathVariable Integer IdProyecto,
            @PathVariable String TipoServicio,
            @PathVariable String Prioridad,
            @PathVariable String NombreSp) {
        return serviceConsultaServiciosService.ConsultaServicios(IdProyecto, TipoServicio, Prioridad, NombreSp);
    }
    
    @PostMapping("/insertaservicio/{bandera}")
    public String InsertaServicio(
            @RequestBody InsertaServicioEntity entidad,
            @PathVariable Integer bandera) {
        return serviceInsertaServicioService.InsertaServicio(entidad, bandera);
    }
    
    @PutMapping("/actualizaservicio/{bandera}")
    public String ActualizaServicio(
            @RequestBody InsertaServicioEntity entidad,
            @PathVariable Integer bandera) {
        return serviceInsertaServicioService.ActualizaServicio(entidad, bandera);
    }
    
    @PutMapping("/modificaimagen/{IdUsuario}")
    public String ActualizaImagen(
            @RequestBody ModImgEntity entidad,
            @PathVariable Integer IdUsuario) {
        return serviceModImgService.ActualizaImagen(entidad, IdUsuario);
    }
    
    @GetMapping("/consultainfouser/{IdUsuario}")
    public List<ConsultaInfoUserEntity> ConsultaBackup(
            @PathVariable Integer IdUsuario) {
        return serviceConsultaInfoUserService.ConsultaInfoUser(IdUsuario);
    }
    
    @DeleteMapping("/eliminaservicio/{bandera}")
    public String EliminaServicio(
            @RequestBody EliminaServicioEntity entidad,
            @PathVariable Integer bandera) {
        return serviceEliminaServicioService.EliminaServicio(entidad, bandera);
    }
    
    @GetMapping("/consdesrrllopendient/{IdIntegrador}/{IdProyecto}")
    public List<ConsultaDesarollosPendientesEntity> ConsultaDesrrlloPendient(
            @PathVariable Integer IdIntegrador,
            @PathVariable Integer IdProyecto) {
        return serviceConsultaDesarollosPendientesService.ConsultaDesrrlloPendient(IdIntegrador, IdProyecto);
    }
    
    @PutMapping("/updateserviciorealizado/{bandera}")
    public String UpdateServRealzdo(
            @RequestBody UpdateServicioRealizadoEntity entidad,
            @PathVariable Integer bandera) {
        return serviceUpdateServicioRealizadoService.UpdateServRealzdo(entidad, bandera);
    }
    
    @GetMapping("/conslistestds")
    public List<CListaEstadoEntity> ConsultaListEstds() {
        return serviceCListaEstadoService.ConsultaListEstds();
    }
    
    @GetMapping("/conslistfiltrs/{Bandera}")
    public List<CListaFiltrosEntity> ConsultaListFiltrs(
            @PathVariable Integer Bandera) {
        return serviceCListaFiltrosService.ConsultaListFiltrs(Bandera);
    }
    
    @GetMapping("/consvalusuarioconsola/{Usuario}")
    public String ConsultaValUsuarioConsola(
            @PathVariable String Usuario) {
        return serviceCValidaUsuarioConsolaService.ConsultaValUsuarioConsola(Usuario);
    }
    
    @GetMapping("/consusuarioinfoconsola/{bandera}")
    public String ConsultaUsuarioInfoConsola(
            @RequestBody CUsuarioInfoConsolaEntity entidad,
            @PathVariable Integer bandera) {
        return serviceCUsuarioInfoConsolaService.ConsultaUsuarioInfoConsola(entidad, bandera);
    }
    
    @GetMapping("/conslistrol/{Bandera}")
    public List<CListaRolEntity> ConsultaListRol(
            @PathVariable Integer Bandera) {
        return serviceCListaRolService.ConsultaListRol(Bandera);
    }
    
    @PostMapping("/insertacrolmod/{Bandera}/{IdUsuario}")
    public String InsertaRolMod(
            @RequestBody CRolModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return serviceCRolModService.InsertaRolMod(entidad, Bandera, IdUsuario);
    }
    
    @PutMapping("/actualizacrolmod/{Bandera}/{IdUsuario}")
    public String ActualizaRolMod(
            @RequestBody CRolModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return serviceCRolModService.ActualizaRolMod(entidad, Bandera, IdUsuario);
    }
    
    @GetMapping("/conspermisosrol/{bandera}/{IdRol}/{NombreRol}")
    public List<CPermisosRolEntity> ConsultaPermisosRol(
            @PathVariable Integer bandera,
            @PathVariable Integer IdRol,
            @PathVariable String NombreRol) {
        return serviceCPermisosRolService.ConsultaPermisosRol(bandera, IdRol, NombreRol);
    }
    
    @PutMapping("/actualizacpermisorol/{Bandera}/{IdUsuario}")
    public String ActualizaCPermisosRolMod(
            @RequestBody CPermisosRolModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return serviceCPermisosRolModService.ActualizaCPermisosRolMod(entidad, Bandera, IdUsuario);
    }
    
    @PostMapping("/insertausuarioconsmod/{Bandera}/{Idusuario}")
    public String InsertaUsuarioConsMod(
            @RequestBody CUsuarioConsModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer Idusuario) {
        return serviceCUsuarioConsModService.InsertaUsuarioConsMod(entidad, Bandera, Idusuario);
    }
    
    @PutMapping("/actualizausuarioconsmod/{Bandera}/{Idusuario}")
    public String ActualizaUsuarioConsMod(
            @RequestBody CUsuarioConsModEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer Idusuario) {
        return serviceCUsuarioConsModService.ActualizaUsuarioConsMod(entidad, Bandera, Idusuario);
    }
    
    @PostMapping("/insertauserolmodifica/{Bandera}/{IdUsuarioRol}/{IdUsuario}")
    public String InsertaUserRolModifica(
            @RequestBody CUsuarioRolModificaEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuarioRol,
            @PathVariable Integer IdUsuario) {
        return serviceCUsuarioRolModificaService.InsertaUserRolModifica(entidad, Bandera, IdUsuarioRol, IdUsuario);
    }
    
    @DeleteMapping("/eliminauserolmodifica/{Bandera}/{IdUsuarioRol}/{IdUsuario}")
    public String EliminaUserRolModifica(
            @RequestBody CUsuarioRolModificaEntity entidad,
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuarioRol,
            @PathVariable Integer IdUsuario) {
        return serviceCUsuarioRolModificaService.EliminaUserRolModifica(entidad, Bandera, IdUsuarioRol, IdUsuario);
    }
    
    @GetMapping("/consusuarioroles/{Bandera}/{IdUsuario}")
    public List<CUsuarioConsultaRolesEntity> ConsultaUserRoles(
            @PathVariable Integer Bandera,
            @PathVariable Integer IdUsuario) {
        return serviceCUsuarioConsultaRolesService.ConsultaUserRoles(Bandera, IdUsuario);
    }
    
    @GetMapping("/conscusuario/{Bandera}/{Idusuario}/{Estado}/{IdRol}/{IdUsuarioCons}/{NombreUsuario}")
    public List<CUsuarioConsultaEntity> ConsultaCUsuario(
            @PathVariable Integer Bandera,
            @PathVariable Integer Idusuario,
            @PathVariable Integer Estado,
            @PathVariable Integer IdRol,
            @PathVariable Integer IdUsuarioCons,
            @PathVariable String NombreUsuario) {
        return serviceCUsuarioConsultaService.ConsultaCUsuario(Bandera, Idusuario, Estado, IdRol, IdUsuarioCons, NombreUsuario);
    }
    
    @GetMapping("/consrolmodulo/{IdRol}/{Modulo}")
    public List<ConsultaRolModuloEntity> ConsultaRolModulo(
            @PathVariable Integer IdRol,
            @PathVariable String Modulo) {
        return serviceConsultaRolModuloService.ConsultaRolModulo(IdRol, Modulo);
    }
    
    @GetMapping("/conslistatarea")
    public List<ConsultaListaTareaEntity> ConsultaListaTareas() {
        return serviceConsultaListaTareaService.ConsultaListaTareas();
    }
    
    @PostMapping("/consregistrotareas/{Bandera}")
    public List<CRegistroTareasEntity> ConsultaRegistroTarea(
            @RequestBody CRegistroTareasEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCRegistroTareaService.ConsultaRegistroTarea(entidad, Bandera);
    }
    
    @PostMapping("/insertaregtareasmod/{Bandera}")
    public String InsertarRegTareasMod(
            @RequestBody CRegistroTareasModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCRegistroTareasModService.InsertarRegTareasMod(entidad, Bandera);
    }
    
    @PutMapping("/actualizaregtareasmod/{Bandera}")
    public String ActualizarRegTareasMod(
            @RequestBody CRegistroTareasModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCRegistroTareasModService.ActualizarRegTareasMod(entidad, Bandera);
    }
    
    @PostMapping("/eliminaregtareamod/{Bandera}")
    public String EliminaRegTareasMod(
            @RequestBody CRegistroTareasModEntity entidad,
            @PathVariable Integer Bandera) {
        return serviceCRegistroTareasModService.EliminaRegTareasMod(entidad, Bandera);
    }
    
    @PostMapping("/servicioencripta")
    public String ServicioEncriptaDesencripta(
            @RequestBody EncriptacionEntity entidad) {
        return serviceCUsuarioInfoConsolaService.Clave(entidad);
    }
    
}
