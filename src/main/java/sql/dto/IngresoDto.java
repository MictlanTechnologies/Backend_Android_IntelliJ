package sql.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * DTO alineado a la app Android y a la tabla tbl_ingresos.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IngresoDto {
    private Integer idIngresos;
    private Integer idUsuario;
    private BigDecimal montoIngreso;
    private String periodicidadIngreso;
    private LocalDate fechaIngresos;
    private String descripcionIngreso;
}
