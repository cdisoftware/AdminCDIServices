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
            name = "PaModImg",
            procedureName = "PaModImg")
})
public class ModImgEntity {

    @Id
    @JsonProperty("Id_U")
    public Integer Id_U;

    @JsonProperty("UrlFoto")
    public String UrlFoto;

}
