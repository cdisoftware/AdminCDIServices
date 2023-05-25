package com.cdi.com.AdministradorCDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paInsertaBackup",
            procedureName = "paInsertaBackup",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class InsertaBackupEntity {

     @Id
    @JsonProperty("IdBackup")
    public Integer IdBackup;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("IdProyecto")
    public Integer IdProyecto;

    @JsonProperty("Ambiente")
    public String Ambiente;

    @JsonProperty("Periodicidad")
    public String Periodicidad;

    @JsonProperty("Id_Servidor")
    public Integer Id_Servidor;
   
    @JsonProperty("IdTipoBackup")
    public Integer IdTipoBackup;
        
    @JsonProperty("IdUsuario")
    public Integer IdUsuario;

    @JsonProperty("Fecha")
    public String Fecha;

    @JsonProperty("Ruta")
    public String Ruta;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Estado")
    public Integer Estado;
}
