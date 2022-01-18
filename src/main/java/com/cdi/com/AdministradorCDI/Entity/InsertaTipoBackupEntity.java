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
            name = "paInsertaTipoBackup",
            procedureName = "paInsertaTipoBackup")
})
public class InsertaTipoBackupEntity {

    @Id
    @JsonProperty("Id_Tipo_BCK")
    private Integer Id_Tipo_BCK;

    @JsonProperty("Descripcion")
    private String Descripcion;
}
