package sql.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Entidad JPA para la tabla tbl_ahorro.
 *
 * Columnas según el script SQL del proyecto:
 *  - idAhorro (PK)
 *  - fechaAhorro
 *  - fechaActualizaciónA
 *  - periodoTAhorro
 *  - montoAhorro
 *  - idIngresos (FK)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_ahorro")
public class Ahorro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAhorro")
    private Integer idAhorro;

    @Column(name = "fechaAhorro")
    private LocalDate fechaAhorro;

    // En MySQL el nombre de columna tiene acento.
    @Column(name = "fechaActualizaciónA")
    private LocalDate fechaActualizacionA;

    @Column(name = "periodoTAhorro", length = 50)
    private String periodoTAhorro;

    @Column(name = "montoAhorro")
    private BigDecimal montoAhorro;

    @Column(name = "idIngresos")
    private Integer idIngresos;
}
