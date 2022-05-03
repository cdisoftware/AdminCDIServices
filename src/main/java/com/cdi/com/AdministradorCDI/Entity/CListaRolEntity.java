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
            name = "paCListaRol",
            procedureName = "paCListaRol",
            resultClasses = CListaRolEntity.class)
})
public class CListaRolEntity {

    @Id
    @JsonProperty("IdRol")
    public Integer IdRol;

    @JsonProperty("NombreRol")
    public String NombreRol;

    @JsonProperty("Estado")
    public Integer Estado;
}
