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
            name = "paInsertaProyecto",
            procedureName = "paInsertaProyecto")
})
public class InsertaProyectoEntity {

    @Id
    @JsonProperty("Id_PRY")
    private Integer Id_PRY;

    @JsonProperty("Nombre")
    private String Nombre;

    @JsonProperty("Id_Cliente")
    private Integer Id_Cliente;
}
