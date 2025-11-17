package sql.service;

import sql.model.Persona;

import java.util.List;

public interface PersonaService {
    List<Persona> getAll();
    Persona getById(Integer id);
    Persona save(Persona persona);
    void delete(Integer id);
    Persona update(Integer id, Persona persona);
}
