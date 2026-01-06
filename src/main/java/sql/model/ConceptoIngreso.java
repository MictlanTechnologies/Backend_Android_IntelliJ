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
@Table(name = "tbl_conceptoingresos")
public class ConceptoIngreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConcepto")
    private Integer idConcepto;

    @Column(name = "nombreConcepto", length = 100)
    private String nombreConcepto;

    @Column(name = "descripcionConcepto")
    private String descripcionConcepto;

    @Column(name = "precioConcepto")
    private BigDecimal precioConcepto;

    @Column(name = "idIngresos")
    private Integer idIngresos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idIngresos", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Ingreso ingreso;
}
