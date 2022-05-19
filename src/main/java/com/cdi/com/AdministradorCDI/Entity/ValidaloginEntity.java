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
            name = "PaValidalogin",
            procedureName = "PaValidalogin",
            resultClasses = ValidaloginEntity.class)
})

public class ValidaloginEntity {

    @Id
    @JsonProperty("Id_U")
    public Integer Id_U;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Apellido")
    public String Apellido;

    @JsonProperty("Usuario")
    public String Usuario;

    @JsonProperty("Password")
    public String Password;

    @JsonProperty("Cedula")
    public String Cedula;

    @JsonProperty("UserAdmin")
    public Integer UserAdmin;

    @JsonProperty("UrlFoto")
    public String UrlFoto;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("FechaMod")
    public String FechaMod;

    @JsonProperty("RESPUESTA")
    public String RESPUESTA;
}
