package sql.repository;

import sql.model.FuenteIngreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuenteIngresoRepository extends JpaRepository<FuenteIngreso, Integer> {
}
