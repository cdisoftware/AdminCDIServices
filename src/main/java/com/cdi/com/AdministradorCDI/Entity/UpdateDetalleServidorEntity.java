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
            name = "PaUpdateDetalleServidor",
            procedureName = "PaUpdateDetalleServidor",
            parameters = {
                @StoredProcedureParameter(name = "Respuesta",
                        mode = ParameterMode.OUT,
                        type = String.class)
            })
})
public class UpdateDetalleServidorEntity {

    @Id
    @JsonProperty("Id_S")
    public Integer Id_S;

    @JsonProperty("DiscoDuro")
    public String DiscoDuro;

    @JsonProperty("RAM")
    public String RAM;

    @JsonProperty("Procesador")
    public String Procesador;

    @JsonProperty("Usuario_Ser")
    public String Usuario_Ser;

    @JsonProperty("Password")
    public String Password;

    @JsonProperty("Servidor_Aloja")
    public Integer Servidor_Aloja;

    @JsonProperty("Id_U")
    public Integer Id_U;

    @JsonProperty("Fecha_Ult_Mod")
    public String Fecha_Ult_Mod;

}
