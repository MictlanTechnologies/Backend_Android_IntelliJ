package sql.service;

import sql.model.ConceptoIngreso;

import java.util.List;

public interface ConceptoIngresoService {
    List<ConceptoIngreso> getAll();
    ConceptoIngreso getById(Integer id);
    ConceptoIngreso save(ConceptoIngreso conceptoIngreso);
    void delete(Integer id);
    ConceptoIngreso update(Integer id, ConceptoIngreso conceptoIngreso);
}
