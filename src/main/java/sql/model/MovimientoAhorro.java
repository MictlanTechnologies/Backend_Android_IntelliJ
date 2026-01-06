package sql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_movimiento_ahorro")
public class MovimientoAhorro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMovimiento")
    private Integer idMovimiento;

    @Column(name = "idAhorro", nullable = false)
    private Integer idAhorro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAhorro", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Ahorro ahorro;

    @Column(name = "idUsuario", nullable = false)
    private Integer idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Usuario usuario;

    @Column(name = "tipoMovimiento", nullable = false, length = 10)
    private String tipoMovimiento;

    @Column(name = "monto", nullable = false)
    private BigDecimal monto;

    @Column(name = "fechaMovimiento", nullable = false)
    private LocalDateTime fechaMovimiento;

    @Column(name = "nota", length = 150)
    private String nota;
}
