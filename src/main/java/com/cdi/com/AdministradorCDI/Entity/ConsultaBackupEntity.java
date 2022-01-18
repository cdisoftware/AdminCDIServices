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
            name = "PaConsultaBackup",
            procedureName = "PaConsultaBackup",
            resultClasses = ConsultaBackupEntity.class)
})
public class ConsultaBackupEntity {

    @Id
    @JsonProperty("Id_B")
    private Integer Id_B;

    @JsonProperty("Nombre")
    private String Nombre;

    @JsonProperty("NombreProyecto")
    private String NombreProyecto;

    @JsonProperty("Ambiente")
    private String Ambiente;

    @JsonProperty("Periodicidad")
    private String Periodicidad;

    @JsonProperty("IpServidor")
    private String IpServidor;

    @JsonProperty("Descripcion")
    private String Descripcion;

    @JsonProperty("UsuarioModifi")
    private String UsuarioModifi;

    @JsonProperty("Fecha_Ult_Mod")
    private String Fecha_Ult_Mod;

}
