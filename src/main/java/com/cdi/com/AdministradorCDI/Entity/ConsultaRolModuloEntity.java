package com.cdi.com.AdministradorCDI.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "PaConsultaRolModulo",
            procedureName = "PaConsultaRolModulo",
            resultClasses = ConsultaRolModuloEntity.class)
})
public class ConsultaRolModuloEntity {

    @Id
    @JsonProperty("IdModulo")
    public Integer IdModulo;

    @JsonProperty("Padre")
    public Integer Padre;

    @JsonProperty("ModuloPadre")
    public String ModuloPadre;

    @JsonProperty("NombreModulo")
    public String NombreModulo;

    @JsonProperty("IdRol")
    public Integer IdRol;

    @JsonProperty("NombreRol")
    public String NombreRol;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("EstadoPermiso")
    public Integer EstadoPermiso;

    @JsonProperty("PermisoRol")
    public Integer PermisoRol;

    @JsonProperty("Path")
    public String Path;

    @JsonProperty("Cons")
    public Integer Cons;

}
