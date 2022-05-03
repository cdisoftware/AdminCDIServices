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
            name = "paCListaFiltros",
            procedureName = "paCListaFiltros",
            resultClasses = CListaFiltrosEntity.class)
})
public class CListaFiltrosEntity {

    @Id
    @JsonProperty("ID")
    public Integer ID;

    @JsonProperty("RESULTADO")
    public String RESULTADO;
}
