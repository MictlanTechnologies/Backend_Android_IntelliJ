package sql.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DomicilioDto {
    private Integer idDomicilio;
    private String ciudad;
    private String calle;
    private String colonia;

    @JsonAlias({"número"})
    private String numero;
    private String codigoPostal;
    private Integer idPersona;
}
