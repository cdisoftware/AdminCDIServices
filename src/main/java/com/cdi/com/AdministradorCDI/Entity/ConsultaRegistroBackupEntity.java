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
            name = "PaConsultaRegistroBackup",
            procedureName = "PaConsultaRegistroBackup",
            resultClasses = ConsultaRegistroBackupEntity.class)
})

public class ConsultaRegistroBackupEntity {

    @Id
    @JsonProperty("Id_BCK")
    public Integer Id_BCK;

    @JsonProperty("NombreBck")
    public String NombreBck;

    @JsonProperty("Fecha")
    public String Fecha;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Observaciones")
    public String Observaciones;

    @JsonProperty("Id_U")
    public Integer Id_U;

    @JsonProperty("Nombre")
    public String Nombre;
}
