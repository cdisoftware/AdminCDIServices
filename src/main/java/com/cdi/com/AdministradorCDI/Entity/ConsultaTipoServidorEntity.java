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
            name = "PaConsultaTipoServidor",
            procedureName = "PaConsultaTipoServidor",
            resultClasses = ConsultaTipoServidorEntity.class)
})
public class ConsultaTipoServidorEntity {

    @Id
    @JsonProperty("Id_Tipo_S")
    public Integer Id_Tipo_S;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("TipoServ")
    public String TipoServ;
}
