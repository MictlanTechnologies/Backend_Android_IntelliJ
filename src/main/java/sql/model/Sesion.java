package sql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tbl_sesion")
public class Sesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSesion")
    private Long idSesion;

    @Column(name = "idUsuario", nullable = false)
    private Integer idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUsuario", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Usuario usuario;

    @Column(name = "token", nullable = false, length = 64)
    private String token;

    @Column(name = "ipOrigen", length = 45)
    private String ipOrigen;

    @Column(name = "dispositivo", length = 120)
    private String dispositivo;

    @Column(name = "fechaInicio", nullable = false)
    private LocalDateTime fechaInicio;

    @Column(name = "fechaUltimoAcceso")
    private LocalDateTime fechaUltimoAcceso;

    @Column(name = "vigente", nullable = false)
    private Boolean vigente;
}
