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
            name = "PaConsultaGrilaProyecBck",
            procedureName = "PaConsultaGrilaProyecBck",
            resultClasses = ConsultaGrilaProyecBckEntity.class)
})
public class ConsultaGrilaProyecBckEntity {

    @Id
    @JsonProperty("Id_B")
    public Integer Id_B;

    @JsonProperty("NomCliente")
    public String NomCliente;
    
    @JsonProperty("IdentificadorProyecto")
    public Integer IdentificadorProyecto;

    @JsonProperty("NombreProyecto")
    public String NombreProyecto;

    @JsonProperty("Id_Cliente")
    public Integer Id_Cliente;

    @JsonProperty("BackupAsociado")
    public String BackupAsociado;

}
