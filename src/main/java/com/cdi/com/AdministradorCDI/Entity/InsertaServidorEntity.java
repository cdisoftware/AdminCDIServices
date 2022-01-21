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
    public Integer Id_S;

    @JsonProperty("Ip_S")
    public String Ip_S;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("SO")
    public String SO;

    @JsonProperty("Software")
    public String Software;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Id_Tipo_S")
    public Integer Id_Tipo_S;

    @JsonProperty("Observacion")
    public String Observacion;

    @JsonProperty("Usuario_Ser")
    public String Usuario_Ser;

    @JsonProperty("Password")
    public String Password;

    @JsonProperty("Servicio_Aloja")
    public Integer Servicio_Aloja;

    @JsonProperty("Id_U")
    public Integer Id_U;

    @JsonProperty("Fecha_Ult_Mod")
    public String Fecha_Ult_Mod;

}
