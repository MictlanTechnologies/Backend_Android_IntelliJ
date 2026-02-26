package sql.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Request body para el endpoint /economix/api/usuarios/login.
 *
 * Se mantiene igual al LoginRequest de la app Android para que Retrofit
 * pueda serializar/deserializar sin ajustes.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    private String perfilUsuario;
    private String contrasenaUsuario;
}
