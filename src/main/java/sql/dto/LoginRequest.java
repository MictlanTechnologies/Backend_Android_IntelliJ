package sql.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String perfilUsuario;
    private String contrasenaUsuario;
}
