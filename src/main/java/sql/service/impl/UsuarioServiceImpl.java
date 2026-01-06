package sql.service.impl;

import sql.model.Usuario;
import sql.repository.UsuarioRepository;
import sql.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario getById(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void delete(Integer id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario update(Integer id, Usuario usuario) {
        return usuarioRepository.findById(id)
                .map(existing -> {
                    BeanUtils.copyProperties(usuario, existing, "idUsuario");
                    return usuarioRepository.save(existing);
                })
                .orElse(null);
    }

    @Override
    public Usuario authenticate(String perfilUsuario, String contrasena) {
        Optional<Usuario> usuario = usuarioRepository.findByPerfilUsuario(perfilUsuario);
        if (usuario.isPresent() && usuario.get().getContrasenaUsuario().equals(contrasena)) {
            return usuario.get();
        }
        return null;
    }
}
