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
@Table(name = "tbl_ahorro")
public class Ahorro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAhorro")
    private Integer idAhorro;

    @Column(name = "idUsuario", nullable = false)
    private Integer idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Usuario usuario;

    @Column(name = "nombreObjetivo", nullable = false, length = 100)
    private String nombreObjetivo;

    @Column(name = "descripcionObjetivo")
    private String descripcionObjetivo;

    @Column(name = "meta", nullable = false)
    private BigDecimal meta;

    @Column(name = "montoAhorrado", nullable = false)
    private BigDecimal montoAhorrado;

    @Column(name = "fechaLimite")
    private LocalDate fechaLimite;
}
