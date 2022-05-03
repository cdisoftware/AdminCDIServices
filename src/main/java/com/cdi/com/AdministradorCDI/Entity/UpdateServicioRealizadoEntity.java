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
            name = "PaUpdateServicioRealizado",
            procedureName = "PaUpdateServicioRealizado")
})
public class UpdateServicioRealizadoEntity {

    @Id
    @JsonProperty("IdServicios")
    public Integer IdServicios;

    @JsonProperty("IdProyecto")
    public Integer IdProyecto;

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
