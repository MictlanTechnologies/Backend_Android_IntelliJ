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
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private Integer idPersona;

    @Column(name = "nombrePersona", length = 50)
    private String nombrePersona;

    @Column(name = "apellidoP", length = 50)
    private String apellidoP;

    @Column(name = "apellidoM", length = 50)
    private String apellidoM;

    // La BD del script del proyecto no incluye fecha de nacimiento; se conserva
    // para el contrato con la app pero NO se persiste.
    @Transient
    private LocalDate fechaNacimiento;

    @Column(name = "idUsuario")
    private Integer idUsuario;
}
