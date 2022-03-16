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
            name = "PaConsultaServicios",
            procedureName = "PaConsultaServicios",
            resultClasses = ConsultaServiciosEntity.class)
})
public class ConsultaServiciosEntity {

    @Id
    @JsonProperty("IdServicios")
    public Integer IdServicios;

    @JsonProperty("Prioridad")
    public String Prioridad;

    @JsonProperty("IdProyecto")
    public Integer IdProyecto;

    @JsonProperty("NombreProyecto")
    public String NombreProyecto;

    @JsonProperty("FechaAsignacion")
    public String FechaAsignacion;

    @JsonProperty("IdIntegrador")
    public Integer IdIntegrador;

    @JsonProperty("NombreIntegrador")
    public String NombreIntegrador;

    @JsonProperty("StoredProcedures")
    public String StoredProcedures;

    @JsonProperty("EXEC_SP")
    public String EXEC_SP;

    @JsonProperty("TipoServicio")
    public String TipoServicio;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("IdUsuarioAsigna")
    public Integer IdUsuarioAsigna;

    @JsonProperty("NombreUsuarioAsigna")
    public String NombreUsuarioAsigna;

    @JsonProperty("FechaSolucion")
    public String FechaSolucion;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("DatosServicio")
    public String DatosServicio;

    @JsonProperty("Observaciones")
    public String Observaciones;

    @JsonProperty("ConsumeServicio")
    public String ConsumeServicio;

    @JsonProperty("UrlServicio")
    public String UrlServicio;

}
