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
            name = "paInsertaServidor",
            procedureName = "paInsertaServidor")
})
public class InsertaServidorEntity {

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

    @JsonProperty("Id_Tipo_S")
    private Integer Id_Tipo_S;

    @JsonProperty("Observacion")
    private String Observacion;

    @JsonProperty("Usuario_Ser")
    private String Usuario_Ser;

    @JsonProperty("Password")
    private String Password;

    @JsonProperty("Servicio_Aloja")
    private Integer Servicio_Aloja;

    @JsonProperty("Id_U")
    private Integer Id_U;

    @JsonProperty("Fecha_Ult_Mod")
    private String Fecha_Ult_Mod;

}
