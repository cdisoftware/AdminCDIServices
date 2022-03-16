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
            name = "PaConsultaDesarollosPendientes",
            procedureName = "PaConsultaDesarollosPendientes",
            resultClasses = ConsultaDesarollosPendientesEntity.class)
})
public class ConsultaDesarollosPendientesEntity {

    @Id
    @JsonProperty("IdServicios")
    public Integer IdServicios;

    @JsonProperty("Prioridad")
    public String Prioridad;

    @JsonProperty("StoredProcedures")
    public String StoredProcedures;

    @JsonProperty("IdProyecto")
    public Integer IdProyecto;

    @JsonProperty("NombreProyecto")
    public String NombreProyecto;

    @JsonProperty("FechaAsignacion")
    public String FechaAsignacion;

    @JsonProperty("TipoServicio")
    public String TipoServicio;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("Observaciones")
    public String Observaciones;

}
