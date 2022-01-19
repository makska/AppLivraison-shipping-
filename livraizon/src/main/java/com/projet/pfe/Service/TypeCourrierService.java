package com.projet.pfe.Service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.projet.pfe.model.TypeCourrier;
import com.projet.pfe.repository.TypeCourrierRepository;

@Service
@Transactional
public class TypeCourrierService {
	@Autowired
	TypeCourrierRepository repository;
	public List<TypeCourrier> getAll(){
		return repository.findAll(Sort.by("libelle").ascending());
		
	}
	public int max() {
	return repository.max();	
	}
	public int nbre() {
		return repository.nbre();
	}
	
public Optional<TypeCourrier> findById(long id){
	return repository.findById(id);
	}
public long save(TypeCourrier TypeCourrier) {
	TypeCourrier cour =new TypeCourrier();
	cour.setCode(TypeCourrier.getCode());
	cour.setLibelle(TypeCourrier.getLibelle());
	return repository.save(cour).getId();
}
 public void update(long id ,TypeCourrier TypeCourrier) {
	 Optional<TypeCourrier> typ= repository.findById(id);
	 if (typ.isPresent()) {
		 TypeCourrier cour=typ.get();
		 cour.setLibelle(TypeCourrier.getLibelle());
		 repository.save(cour);
	 }
	 
 }
 public List<TypeCourrier> findByLibelle(String libelle){
	return repository.findAllByLibelleContaining(libelle);
	 
 }
 
 public void delete(long id) {
	 Optional<TypeCourrier> des= repository.findById(id);
	des.ifPresent(repository::delete);
 }

}
