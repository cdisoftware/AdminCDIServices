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
            name = "paInsertaHardwareServ",
            procedureName = "paInsertaHardwareServ",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class InsertaHardwareServEntity {

    @Id
    @JsonProperty("Id_S")
    public Integer Id_S;

    @JsonProperty("DiscoDuro")
    public String DiscoDuro;

    @JsonProperty("RAM")
    public String RAM;

    @JsonProperty("Procesador")
    public String Procesador;

}
