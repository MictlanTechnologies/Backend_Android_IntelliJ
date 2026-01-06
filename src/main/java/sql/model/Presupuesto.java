package sql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_presupuesto")
public class Presupuesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPresupuesto")
    private Integer idPresupuesto;

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

    @Column(name = "categoria", length = 40)
    private String categoria;

    @Column(name = "montoMaximo", nullable = false)
    private BigDecimal montoMaximo;

    @Column(name = "montoGastado", nullable = false)
    private BigDecimal montoGastado;

    @Column(name = "mes", nullable = false)
    private Integer mes;

    @Column(name = "anio", nullable = false)
    private Integer anio;
}
