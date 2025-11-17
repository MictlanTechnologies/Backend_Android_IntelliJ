package sql.service;

import sql.model.Sesion;

import java.util.List;

public interface SesionService {
    List<Sesion> getAll();
    Sesion getById(Long id);
    Sesion save(Sesion sesion);
    void delete(Long id);
    Sesion update(Long id, Sesion sesion);
}
