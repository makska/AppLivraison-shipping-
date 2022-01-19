package com.projet.pfe.Service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.projet.pfe.model.Parametre;
import com.projet.pfe.repository.ParametreRepository;

@Service
@Transactional
public class ParametreService {
	@Autowired
	ParametreRepository repository;
	
	public List<Parametre> getAll(){
		return repository.findAll(Sort.by("libelle").ascending());
		
	}
	 


	
	
public Optional<Parametre> findByCode(String code){
	return repository.findByCode(code);
	}

public Parametre createParametre(Parametre parametre) {	
	Parametre  par =new Parametre();
	par.setLibelle(parametre.getLibelle());;
	par.setNumc(parametre.getNumc());
	par.setNuma(parametre.getNuma());
	return repository.save(parametre);
}
 public void update(String code ,Parametre parametre) {
	 Optional<Parametre> categ= repository.findByCode(code);
	 if (categ.isPresent()) {
		 Parametre par=categ.get();
		 par.setLibelle(parametre.getLibelle());;
			par.setNumc(parametre.getNumc());
			par.setNuma(parametre.getNuma());
		 repository.save(par);
	 }
	 
 }
 public List<Parametre> findByLibelle(String libelle){
	return repository.findAllByLibelleContaining(libelle);
	 
 }
 
 public void delete(String code) {
	 Optional<Parametre> categ= repository.findByCode(code);
	 categ.ifPresent(repository::delete);
 }





public Optional<Parametre> findById(long id) {
	return repository.findById(id);
}
}
