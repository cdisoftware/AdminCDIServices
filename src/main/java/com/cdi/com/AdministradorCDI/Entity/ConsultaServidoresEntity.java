package com.cdi.com.AdministradorCDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "paConsultaServidores",
            procedureName = "paConsultaServidores",
            resultClasses = ConsultaServidoresEntity.class)
})
public class ConsultaServidoresEntity {

    @Id
    @JsonProperty("Id_S")
    public Integer Id_S;

    @JsonProperty("IpPublica")
    public String IpPublica;

    @JsonProperty("TieneIpPublica")
    public String TieneIpPublica;

    @JsonProperty("AplicacionesIIS")
    public String AplicacionesIIS;

    @JsonProperty("TieneIIS")
    public String TieneIIS;

    @JsonProperty("BaseDeDatos")
    public String BaseDeDatos;

    @JsonProperty("TieneBD")
    public String TieneBD;

    @JsonProperty("Ip_S")
    public String Ip_S;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("SO")
    public String SO;

    @JsonProperty("Software")
    public String Software;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("TipoServidor")
    public String TipoServidor;

    @JsonProperty("IdTipoServidor")
    public Integer IdTipoServidor;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("Usuario_Ser")
    public String Usuario_Ser;

    @JsonProperty("Password")
    public String Password;

    @JsonProperty("Servidor_Aloja")
    public Integer Servidor_Aloja;

    @JsonProperty("NombreServidorAloja")
    public String NombreServidorAloja;

    @JsonProperty("UsuarioUltMod")
    public String UsuarioUltMod;

    @JsonProperty("Fecha_Ult_Mod")
    public String Fecha_Ult_Mod;

    @JsonProperty("Procesador")
    public String Procesador;

    @JsonProperty("DiscoDuro")
    public String DiscoDuro;

    @JsonProperty("RAM")
    public String RAM;
}
