package com.projet.pfe.Service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projet.pfe.Dto.ListAgence;
import com.projet.pfe.model.Agence;
import com.projet.pfe.repository.AgenceRepository;
@Service
@Transactional
public class AgenceService {
	@Autowired
	AgenceRepository repository;
	public List<ListAgence> getAll(){
		return repository.listAgence();
		
	}
	public Optional<Agence> findByCode(String code) {
        return repository.findByCode(code);
    }
	public int max(String code) {
	return repository.max(code);	
	}
	public int nbre(String code) {
		
		return repository.nbre(code);
	}
	
public Optional<Agence> findById(long id){
	return repository.findById(id);
	}
public long save(Agence agence) {
	/*Agence agen =new Agence();
	agen.setCode(agence.getCode());
	agen.setLibelle(agence.getLibelle());
	agen.setCodedir(agence.getCodedir());*/
	return repository.save(agence).getId();
}
 public void update(String code ,Agence agence) {
	 Optional<Agence> age= repository.findByCode(code);
	 if (age.isPresent()) {
		 Agence agen=age.get();
		 agen.setLibelle(agence.getLibelle());
		 agen.setCode(agence.getCode());
		 agen.setCodedir(agence.getCodedir());
		 agen.setLibdir(agence.getLibdir());
		 repository.save(agen);
	 }
	 
 }
 public List<Agence> findByLibelle(String libelle){
	return repository.findAllByLibelleContaining(libelle);
	 
 }
 
 public void delete(String code) {
	 Optional<Agence> age= repository.findByCode(code);
	age.ifPresent(repository::delete);
 }
 public List<Agence> findByCodedir(String code) {
     return repository.findAllByCodedir(code);
 }

}
