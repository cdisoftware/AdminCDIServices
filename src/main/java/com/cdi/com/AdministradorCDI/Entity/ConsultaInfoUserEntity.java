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
            name = "PaConsultaInfoUser",
            procedureName = "PaConsultaInfoUser",
            resultClasses = ConsultaInfoUserEntity.class)
})
public class ConsultaInfoUserEntity {

    @Id
    @JsonProperty("Id_U")
    public Integer Id_U;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Apellido")
    public String Apellido;

    @JsonProperty("Usuario")
    public String Usuario;

    @JsonProperty("Password")
    public String Password;

    @JsonProperty("UrlFoto")
    public String UrlFoto;
}
