package formation.ib.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.ib.backend.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long>{

	public List<Formation> findByTitre(String titre);
	public List<Formation> findByDescription(String description);
}
