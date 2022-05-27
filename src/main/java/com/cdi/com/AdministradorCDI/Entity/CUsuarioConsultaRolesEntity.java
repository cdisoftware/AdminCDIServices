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
            name = "paCUsuarioConsultaRoles",
            procedureName = "paCUsuarioConsultaRoles",
            resultClasses = CUsuarioConsultaRolesEntity.class)
})
public class CUsuarioConsultaRolesEntity {

    @Id
    @JsonProperty("IdModulo")
    public Integer IdModulo;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Apellido")
    public String Apellido;

    @JsonProperty("Usuario")
    public String Usuario;

    @JsonProperty("IdUsuarioC")
    public Integer IdUsuarioC;

    @JsonProperty("NombreModulo")
    public String NombreModulo;

    @JsonProperty("Path")
    public String Path;

    @JsonProperty("Padre")
    public Integer Padre;

    @JsonProperty("NombrePadre")
    public String NombrePadre;

}
