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
            name = "paInsertaHardwareServ",
            procedureName = "paInsertaHardwareServ")
})
public class InsertaHardwareServEntity {

    @Id
    @JsonProperty("Id_S")
    private Integer Id_S;

    @JsonProperty("DiscoDuro")
    private String DiscoDuro;

    @JsonProperty("RAM")
    private String RAM;

    @JsonProperty("Procesador")
    private String Procesador;

}
