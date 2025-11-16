package sql.repository;

import sql.model.Ahorro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AhorroRepository extends JpaRepository<Ahorro, Integer> {
}
