package formation.ib.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import formation.ib.backend.entities.Formation;
import formation.ib.backend.services.FormationService;

@CrossOrigin
@RequestMapping("formations")
@RestController
public class FormationController {

	@Autowired
	private FormationService service;
	
	@GetMapping("")
	public List<Formation> findAll(){
		return this.service.findAll();
	}
	
	@PostMapping("")
	public Formation save(@RequestBody Formation entity) {
		return this.service.save(entity);
	}

	@GetMapping("titre/{titre}")
	public List<Formation> findByTitre(@PathVariable String titre) {
		return service.findByTitre(titre);
	}

	@GetMapping("{id}")
	public Formation findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@GetMapping("description/{description}")
	public List<Formation> totoMangeLaDescriptionALaPlageAvecTiti(@PathVariable String description) {
		return service.trouverAvecLaDescription(description);
	}
	
	
}