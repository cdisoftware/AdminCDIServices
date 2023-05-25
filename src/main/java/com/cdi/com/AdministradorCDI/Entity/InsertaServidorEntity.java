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
            name = "paInsertaServidor",
            procedureName = "paInsertaServidor",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class InsertaServidorEntity {

    @Id
    @JsonProperty("IdServidor")
    public Integer IdServidor;

    @JsonProperty("IpServidor")
    public String IpServidor;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("SistemaOper")
    public String SistemaOper;

    @JsonProperty("Software")
    public String Software;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("IdTipoServ")
    public Integer IdTipoServ;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("UserServidor")
    public String UserServidor;

    @JsonProperty("Password")
    public String Password;

    @JsonProperty("ServidorAloja")
    public Integer ServidorAloja;

    @JsonProperty("IdUsuario")
    public Integer IdUsuario;

    @JsonProperty("Host")
    public String Host;

    @JsonProperty("IpPublica")
    public String IpPublica;

    @JsonProperty("AplicacionesIIS")
    public String AplicacionesIIS;

    @JsonProperty("DiscoDuro")
    public String DiscoDuro;

    @JsonProperty("RAM")
    public String RAM;

    @JsonProperty("Procesador")
    public String Procesador;

    @JsonProperty("BaseDeDatos")
    public String BaseDeDatos;

}
