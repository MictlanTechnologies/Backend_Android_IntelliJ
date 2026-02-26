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
public class ContactoDto {
    private Integer idContactos;
    private String numCelular;
    @JsonAlias({"Correo"})
    private String correoAlterno;
    private Integer idPersona;
}
