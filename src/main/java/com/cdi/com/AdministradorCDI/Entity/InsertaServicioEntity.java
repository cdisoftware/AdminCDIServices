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
            name = "PaInsertaServicio",
            procedureName = "PaInsertaServicio",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class InsertaServicioEntity {

    @Id
    @JsonProperty("IdServicios")
    public Integer IdServicios;

    @JsonProperty("IdProyecto")
    public Integer IdProyecto;

    @JsonProperty("FechaAsignacion")
    public String FechaAsignacion;

    @JsonProperty("IdIntegrador")
    public Integer IdIntegrador;

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

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("Prioridad")
    public String Prioridad;

}
