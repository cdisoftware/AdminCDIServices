
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
            name = "PaConsultaTipoBackup",
            procedureName = "PaConsultaTipoBackup",
            resultClasses = ConsultaTipoBackupEntity.class)
})
public class ConsultaTipoBackupEntity {
    @Id
    @JsonProperty("Id_Tipo_BCK")
    public Integer Id_Tipo_BCK;
    
     @JsonProperty("Descripcion")
    public String Descripcion;
}
