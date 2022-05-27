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
    private Integer Id_U;

    @JsonProperty("Cedula")
    private String Cedula;

    @JsonProperty("Usuario")
    private String Usuario;

    @JsonProperty("Nombre")
    private String Nombre;

    @JsonProperty("Apellido")
    private String Apellido;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("Password")
    private String Password;
}
