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
@Table(name = "tbl_conceptogastos")
public class ConceptoGasto {
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

    @Column(name = "idGastos")
    private Integer idGastos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idGastos", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Gasto gasto;
}
