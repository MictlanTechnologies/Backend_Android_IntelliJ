package sql.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * DTO alineado a la app Android (AhorroDto del frontend) y a la tabla tbl_ahorro.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AhorroDto {
    private Integer idAhorro;
    private Integer idIngresos;
    private BigDecimal montoAhorro;
    private String periodoTAhorro;
    private LocalDate fechaAhorro;

    // En la BD el nombre puede venir con acento (fechaActualizaciónA).
    @JsonAlias({"fechaActualizaciónA"})
    private LocalDate fechaActualizacionA;
}
