package sql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_ingresos")
public class Ingreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idIngresos")
    private Integer idIngresos;

    @Column(name = "idUsuario", nullable = false)
    private Integer idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Usuario usuario;

    @Column(name = "idFuente")
    private Integer idFuente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idFuente", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private FuenteIngreso fuenteIngreso;

    @Column(name = "montoIngreso", nullable = false)
    private BigDecimal montoIngreso;

    @Column(name = "periodicidadIngreso", length = 50)
    private String periodicidadIngreso;

    @Column(name = "fechaIngresos", nullable = false)
    private LocalDate fechaIngresos;

    @Column(name = "descripcionIngreso")
    private String descripcionIngreso;
}
