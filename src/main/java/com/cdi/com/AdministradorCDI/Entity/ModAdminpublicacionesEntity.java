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
            name = "PacModAdminpublicaciones",
            procedureName = "PacModAdminpublicaciones",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class ModAdminpublicacionesEntity {

    @Id
    @JsonProperty("IdPublicacion")
    public Integer IdPublicacion;

    @JsonProperty("Tipo")
    public Integer Tipo;

    @JsonProperty("Ip")
    public String Ip;

    @JsonProperty("Nombre")
    public String Nombre;

    @JsonProperty("Descripcion")
    public String Descripcion;

    @JsonProperty("Estado")
    public Integer Estado;

    @JsonProperty("Ambiente")
    public Integer Ambiente;

}
