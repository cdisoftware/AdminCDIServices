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
            name = "paCUsuarioConsMod",
            procedureName = "paCUsuarioConsMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CUsuarioConsModEntity {

    @Id
    @JsonProperty("Id_U")
    public Integer Id_U;

    @JsonProperty("Cedula")
    public String Cedula;

    @JsonProperty("Usuario")
    public String Usuario;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Apellido")
    public String Apellido;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Password")
    public String Password;

    @JsonProperty("Direccion")
    public String Direccion;

    @JsonProperty("Telefono")
    public String Telefono;

    @JsonProperty("Email")
    public String Email;
}
