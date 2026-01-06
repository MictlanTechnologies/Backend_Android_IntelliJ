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
@Table(name = "tbl_gastos")
public class Gasto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGastos")
    private Integer idGastos;

    @Column(name = "idUsuario", nullable = false)
    private Integer idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Usuario usuario;

    @Column(name = "idCategoria")
    private Integer idCategoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCategoria", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private CategoriaGasto categoriaGasto;

    @Column(name = "idPresupuesto")
    private Integer idPresupuesto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPresupuesto", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Presupuesto presupuesto;

    @Column(name = "descripcionGasto", nullable = false)
    private String descripcionGasto;

    @Column(name = "articuloGasto", nullable = false, length = 100)
    private String articuloGasto;

    @Column(name = "montoGasto", nullable = false)
    private BigDecimal montoGasto;

    @Column(name = "fechaGastos", nullable = false)
    private LocalDate fechaGastos;

    @Column(name = "periodoGastos", nullable = false, length = 50)
    private String periodoGastos;
}
