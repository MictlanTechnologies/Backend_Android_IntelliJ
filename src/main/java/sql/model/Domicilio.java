package sql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_domicilio")
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDomicilio")
    private Integer idDomicilio;

    @Column(name = "ciudad", length = 50)
    private String ciudad;

    @Column(name = "calle", length = 100)
    private String calle;

    @Column(name = "colonia", length = 100)
    private String colonia;

    @Column(name = "numero", length = 10)
    private String numero;

    @Column(name = "codigoPostal", length = 10)
    private String codigoPostal;

    @Column(name = "idPersona")
    private Integer idPersona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPersona", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Persona persona;
}
