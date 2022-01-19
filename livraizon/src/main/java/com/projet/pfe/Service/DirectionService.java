package com.projet.pfe.Service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.projet.pfe.model.Direction;

import com.projet.pfe.repository.DirectionRepository;


@Service
@Transactional
public class DirectionService {
	@Autowired
	DirectionRepository repository;
	public List<Direction> getAll(){
		return repository.findAll(Sort.by("libelle").ascending());
		
	}
	public int max() {
	return repository.max();	
	}
	public int nbre() {
		return repository.nbre();
	}
	
public Optional<Direction> findById(long id){
	return repository.findById(id);
	}
public long save(Direction direction) {
	Direction dire =new Direction();
	dire.setCode(direction.getCode());
	dire.setLibelle(direction.getLibelle());
	return repository.save(dire).getId();
}
 public void update(long id ,Direction direction) {
	 Optional<Direction> dir= repository.findById(id);
	 if (dir.isPresent()) {
		 Direction dire=dir.get();
		 dire.setLibelle(direction.getLibelle());
		 repository.save(dire);
	 }
	 
 }
 public List<Direction> findByLibelle(String libelle){
	return repository.findAllByLibelleContaining(libelle);
	 
 }
 
 public void delete(long id) {
	 Optional<Direction> dir= repository.findById(id);
	dir.ifPresent(repository::delete);
 }

}
