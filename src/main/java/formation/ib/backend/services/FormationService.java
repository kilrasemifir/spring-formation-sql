package formation.ib.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.Formation;
import formation.ib.backend.repositories.FormationRepository;

@Service
public class FormationService {
	
	@Autowired
	private FormationRepository repository;

	public Formation save(Formation entity) {
		return repository.save(entity);
	}

	public List<Formation> findAll() {
		return repository.findAll();
	}

	public List<Formation> findByTitre(String titre) {
		return repository.findByTitre(titre);
	}
	
	

	public Formation findById(Long id) {
		return repository.findById(id)
				.orElseThrow( ()->new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

	/**
	 * Retourne la liste des formations ayant pour description la valeur de l'argument description.
	 * @param description
	 * @return
	 */
	public List<Formation> trouverAvecLaDescription(String description) {
		return repository.findByDescription(description);
	}
	
	
	

}
