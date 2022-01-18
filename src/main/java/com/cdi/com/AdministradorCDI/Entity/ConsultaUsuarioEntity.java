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
            name = "PaConsultaUsuario",
            procedureName = "PaConsultaUsuario",
            resultClasses = ConsultaUsuarioEntity.class)
})
public class ConsultaUsuarioEntity {

    @Id
    @JsonProperty("Id_U")
    private Integer Id_U;

    @JsonProperty("Nombre")
    private String Nombre;

    @JsonProperty("Apellido")
    private String Apellido;

    @JsonProperty("Usuario")
    private String Usuario;

    @JsonProperty("Password")
    private String Password;

    @JsonProperty("Cedula")
    private String Cedula;

}
