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
            name = "PaConsAdminPublicaciones",
            procedureName = "PaConsAdminPublicaciones",
            resultClasses = ConsAdminPublicacionesEntity.class)
})
public class ConsAdminPublicacionesEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;

    @JsonProperty("IdTipoPublicacion")
    public Integer IdTipoPublicacion;

    @JsonProperty("TipoPubli")
    public String TipoPubli;

    @JsonProperty("IpPublicacion")
    public String IpPublicacion;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Estado")
    public String Estado;

    @JsonProperty("DescripcionEstado")
    public String DescripcionEstado;
    
    @JsonProperty("Ambiente")
    public String Ambiente;
    
    @JsonProperty("DescripcionAmbiente")
    public String DescripcionAmbiente;
}
