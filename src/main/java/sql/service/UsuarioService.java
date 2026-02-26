package sql.service;

import sql.model.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> getAll();
    Usuario getById(Integer id);
    Usuario findByPerfilUsuario(String perfilUsuario);
    boolean existsByPerfilUsuario(String perfilUsuario);
    Usuario save(Usuario usuario);
    void delete(Integer id);
    Usuario update(Integer id, Usuario usuario);
}
