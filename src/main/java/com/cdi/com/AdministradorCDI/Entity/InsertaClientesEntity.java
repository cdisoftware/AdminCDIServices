
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
            name = "paInsertaClientes",
            procedureName = "paInsertaClientes")
})
public class InsertaClientesEntity {
    
     @Id
    @JsonProperty("Id_Cliente")
    public Integer Id_Cliente;
   
    @JsonProperty("Descripcion")
    public String Descripcion;
}
