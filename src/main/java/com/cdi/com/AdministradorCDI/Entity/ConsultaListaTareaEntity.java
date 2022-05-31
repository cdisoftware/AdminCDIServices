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
            name = "PaConsultaListaTarea",
            procedureName = "PaConsultaListaTarea",
            resultClasses = ConsultaListaTareaEntity.class)
})
public class ConsultaListaTareaEntity {

    @Id
    @JsonProperty("IdTipoTarea")
    public Integer IdTipoTarea;

    @JsonProperty("Descripcion")
    public String Descripcion;
}
