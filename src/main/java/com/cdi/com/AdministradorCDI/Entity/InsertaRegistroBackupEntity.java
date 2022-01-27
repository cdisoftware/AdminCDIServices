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
            name = "PaInsertaRegistroBackup",
            procedureName = "PaInsertaRegistroBackup",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})

public class InsertaRegistroBackupEntity {

    @Id
    @JsonProperty("Id_BCK")
    public Integer Id_BCK;

    @JsonProperty("Fecha")
    public String Fecha;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Observaciones")
    public String Observaciones;

    @JsonProperty("Id_U")
    public Integer Id_U;
}
