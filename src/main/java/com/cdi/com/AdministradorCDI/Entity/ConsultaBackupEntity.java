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
    public Integer Id_B;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Id_PRY")
    public Integer Id_PRY;

    @JsonProperty("NombreProyecto")
    public String NombreProyecto;

    @JsonProperty("Ambiente")
    public String Ambiente;

    @JsonProperty("Periodicidad")
    public String Periodicidad;

    @JsonProperty("Id_Servidor")
    public Integer Id_Servidor;

    @JsonProperty("IpServidor")
    public String IpServidor;

    @JsonProperty("Id_Tipo_BCK")
    public Integer Id_Tipo_BCK;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Id_Usuario")
    public Integer Id_Usuario;

    @JsonProperty("UsuarioModifi")
    public String UsuarioModifi;

    @JsonProperty("Fecha_Ult_Mod")
    public String Fecha_Ult_Mod;

}
