package com.projet.pfe.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.projet.pfe.model.demandeCarte;

import com.projet.pfe.repository.demandeCarteRepository;

@Service
@Transactional
public class demandeCarteService {
	@Autowired
	demandeCarteRepository repository;
	public List<demandeCarte> getAll(){
		return repository.findAll(Sort.by("designation").ascending());
		
	}
	
	
public Optional<demandeCarte> findById(long id){
	return repository.findById(id);
	}
public long save(demandeCarte carte) {
	
    
    return repository.save(carte)
                         .getId();
}

 public void update(long id ,demandeCarte demande) {
	 Optional<demandeCarte> dir= repository.findById(id);
	 if (dir.isPresent()) {
		 demandeCarte dire=dir.get();
		 dire.setDesignation(demande.getDesignation());
		 dire.setTel(demande.getTel());
		 dire.setAdresse(demande.getAdresse());
		 dire. setCodeClient(demande. getCodeClient());
		 repository.save(dire);
	 }}
 public void delete(long id) {
	 Optional<demandeCarte> dir= repository.findById(id);
	dir.ifPresent(repository::delete);
 }
 public void updateaccepter(long id, demandeCarte demandecompte) {
     Optional<demandeCarte> dc = repository.findById(id);
     
     if (dc.isPresent()) {
         demandeCarte demandecomptes = dc.get();
         
         demandecomptes.setAccepter(demandecompte.isAccepter());
       
    
         
        
       repository.save(demandecomptes);
     }
 }
}


