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
            name = "paCUsuarioConsulta",
            procedureName = "paCUsuarioConsulta",
            resultClasses = CUsuarioConsultaEntity.class)
})
public class CUsuarioConsultaEntity {

    @Id
    @JsonProperty("Cons")
    public Integer Cons;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Apellido")
    public String Apellido;

    @JsonProperty("Usuario")
    public String Usuario;

    @JsonProperty("Identificacion")
    public String Identificacion;

    @JsonProperty("IdUsuarioC")
    public Integer IdUsuarioC;

    @JsonProperty("Estado")
    public String Estado;

    @JsonProperty("IdRol")
    public Integer IdRol;

    @JsonProperty("NombreRol")
    public String NombreRol;

    @JsonProperty("IdEstadoRol")
    public Integer IdEstadoRol;

    @JsonProperty("Clave")
    public String Clave;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("Telefono")
    public String Telefono;

    @JsonProperty("Email")
    public String Email;
}
