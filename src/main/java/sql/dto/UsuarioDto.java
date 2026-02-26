package sql.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO mínimo de Usuario para la app Android.
 *
 * Nota: la BD tiene la columna "contraseñaUsuario" (con ñ),
 * pero la app manda/recibe "contrasenaUsuario". Con @JsonAlias
 * aceptamos ambas variantes en JSON.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
    private Integer idUsuario;
    private String perfilUsuario;

    @JsonAlias({"contraseñaUsuario"})
    private String contrasenaUsuario;
}
