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
@Table(name = "tbl_contactos")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContactos")
    private Integer idContactos;

    @Column(name = "numCelular", length = 20)
    private String numCelular;

    @Column(name = "correoAlterno", length = 100)
    private String correoAlterno;

    @Column(name = "idPersona")
    private Integer idPersona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPersona", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Persona persona;
}
