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
            name = "paConsultaServidores",
            procedureName = "paConsultaServidores",
            resultClasses = ConsultaServidoresEntity.class)
})
public class ConsultaServidoresEntity {

    @Id
    @JsonProperty("Id_S")
    private Integer Id_S;

    @JsonProperty("Ip_S")
    private String Ip_S;

    @JsonProperty("Nombre")
    private String Nombre;

    @JsonProperty("SO")
    private String SO;

    @JsonProperty("Software")
    private String Software;

    @JsonProperty("Estado")
    private Integer Estado;

    @JsonProperty("TipoServidor")
    private String TipoServidor;

    @JsonProperty("Observacion")
    private String Observacion;

    @JsonProperty("Usuario_Ser")
    private String Usuario_Ser;

    @JsonProperty("Password")
    private String Password;

    @JsonProperty("Servidor_Aloja")
    private Integer Servidor_Aloja;

    @JsonProperty("Usuario")
    private String Usuario;

    @JsonProperty("Fecha_Ult_Mod")
    private String Fecha_Ult_Mod;
}
