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
            name = "paInsertaUsuario",
            procedureName = "paInsertaUsuario",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class InsertaUsuarioEntity {

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

    @JsonProperty("Cedula")
    public String Cedula;
}
