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
            name = "paInsertaBackup",
            procedureName = "paInsertaBackup")
})
public class InsertaBackupEntity {

    @Id
    @JsonProperty("Id_B")
    private Integer Id_B;

    @JsonProperty("Nombre")
    private String Nombre;

    @JsonProperty("Id_PRY")
    private Integer Id_PRY;

    @JsonProperty("Ambiente")
    private String Ambiente;

    @JsonProperty("Periodicidad")
    private String Periodicidad;

    @JsonProperty("Id_Servidor")
    private Integer Id_Servidor;

    @JsonProperty("Id_Tipo_BCK")
    private Integer Id_Tipo_BCK;

    @JsonProperty("Id_Usuario")
    private Integer Id_Usuario;

    @JsonProperty("Fecha_Ult_Mod")
    private String Fecha_Ult_Mod;
}
