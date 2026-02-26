package sql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

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

    // En el script SQL del proyecto la columna se llama `número`.
    @Column(name = "número", length = 10)
    private String numero;

    // La BD del proyecto no incluye código postal; se conserva en el modelo
    // para no romper el contrato con la app, pero NO se persiste.
    @Transient
    private String codigoPostal;

    @Column(name = "idPersona")
    private Integer idPersona;
}
