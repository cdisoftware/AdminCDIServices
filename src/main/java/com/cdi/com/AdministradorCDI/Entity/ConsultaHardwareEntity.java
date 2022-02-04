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
            name = "PaConsultaHardware",
            procedureName = "PaConsultaHardware",
            resultClasses = ConsultaHardwareEntity.class)
})
public class ConsultaHardwareEntity {

    @Id
    @JsonProperty("Id")
    public Integer Id;
    
    @JsonProperty("IdentificadorServidor")
    public Integer IdentificadorServidor;

    @JsonProperty("NombreServidor")
    public String NombreServidor;

    @JsonProperty("DiscoDuro")
    public String DiscoDuro;

    @JsonProperty("RAM")
    public String RAM;

    @JsonProperty("Procesador")
    public String Procesador;
}
