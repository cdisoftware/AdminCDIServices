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
            name = "paInsertaBackup",
            procedureName = "paInsertaBackup",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class InsertaBackupEntity {

    @Id
    @JsonProperty("Id_B")
    public Integer Id_B;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Id_PRY")
    public Integer Id_PRY;

    @JsonProperty("Ambiente")
    public String Ambiente;

    @JsonProperty("Periodicidad")
    public String Periodicidad;

    @JsonProperty("Id_Servidor")
    public Integer Id_Servidor;

    @JsonProperty("Id_Tipo_BCK")
    public Integer Id_Tipo_BCK;

    @JsonProperty("Id_Usuario")
    public Integer Id_Usuario;

    @JsonProperty("Fecha_Ult_Mod")
    public String Fecha_Ult_Mod;
}
