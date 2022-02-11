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
            name = "PaConsultaDetallesServidor",
            procedureName = "PaConsultaDetallesServidor",
            resultClasses = ConsultaDetallesServidorEntity.class)
})
public class ConsultaDetallesServidorEntity {

    @Id
    @JsonProperty("Id_S")
    public Integer Id_S;

    @JsonProperty("Usuario_Ser")
    public String Usuario_Ser;

    @JsonProperty("Password")
    public String Password;

    @JsonProperty("Servidor_Aloja")
    public String Servidor_Aloja;

    @JsonProperty("NombreServidorAloja")
    public String NombreServidorAloja;

    @JsonProperty("DiscoDuro")
    public String DiscoDuro;

    @JsonProperty("RAM")
    public String RAM;

    @JsonProperty("Procesador")
    public String Procesador;
}
