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
            name = "paCRegistroTareas",
            procedureName = "paCRegistroTareas",
            resultClasses = CRegistroTareasEntity.class)
})
public class CRegistroTareasEntity {

    @Id
    @JsonProperty("IdActividad")
    public Integer IdActividad;

    @JsonProperty("Id_U")
    public Integer Id_U;

    @JsonProperty("Usuario")
    public String Usuario;

    @JsonProperty("FechaRegistro")
    public String FechaRegistro;

    @JsonProperty("Id_Pry")
    public Integer Id_Pry;

    @JsonProperty("Proyecto")
    public String Proyecto;

    @JsonProperty("IdTipoTarea")
    public Integer IdTipoTarea;

    @JsonProperty("TipoTarea")
    public String TipoTarea;

    @JsonProperty("DescripcionTarea")
    public String DescripcionTarea;

    @JsonProperty("Tiempo")
    public Integer Tiempo;
}
