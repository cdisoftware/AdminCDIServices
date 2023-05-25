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
            name = "paCRegistroTareasMod",
            procedureName = "paCRegistroTareasMod",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class CRegistroTareasModEntity {

    @Id
    @JsonProperty("IdActividad")
    public Integer IdActividad;

    @JsonProperty("Id_U")
    public Integer Id_U;

    @JsonProperty("Id_Pry")
    public Integer Id_Pry;

    @JsonProperty("IdTipoTarea")
    public Integer IdTipoTarea;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Tiempo")
    public Integer Tiempo;
}
