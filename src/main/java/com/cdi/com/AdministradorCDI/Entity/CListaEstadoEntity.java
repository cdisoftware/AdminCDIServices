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
            name = "paCListaEstado",
            procedureName = "paCListaEstado",
            resultClasses = CListaEstadoEntity.class)
})
public class CListaEstadoEntity {

    @Id
    @JsonProperty("Codigo")
    public Integer Codigo;

    @JsonProperty("Descripcion")
    public String Descripcion;
}
