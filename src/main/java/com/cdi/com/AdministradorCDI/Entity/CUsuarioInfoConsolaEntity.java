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
            name = "paCUsuarioInfoConsola",
            procedureName = "paCUsuarioInfoConsola",
            resultClasses = CUsuarioInfoConsolaEntity.class)
})
public class CUsuarioInfoConsolaEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("Password")
    public String Password;

    @JsonProperty("Cedula")
    public String Cedula;

    @JsonProperty("Id_U")
    public Integer Id_U;

    @JsonProperty("Usuario")
    public String Usuario;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Apellido")
    public String Apellido;

    @JsonProperty("IdRol")
    public Integer IdRol;

    @JsonProperty("UrlFoto")
    public String UrlFoto;

}
