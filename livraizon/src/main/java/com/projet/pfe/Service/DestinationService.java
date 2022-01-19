package com.projet.pfe.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.projet.pfe.repository.DestinationRepository;

import com.projet.pfe.model.Destination;


import javax.transaction.Transactional;
import org.springframework.data.domain.Sort;
@Service
@Transactional
public class DestinationService {
	@Autowired
	DestinationRepository repository;
 
	public List<Destination> getAll() {
		System.out.println("Get all Destinations 11111...");
    	return repository.findAll(Sort.by("libelle").ascending());	    	
    }
	
	
	
    public Optional<Destination> findByCode(String code) {
        return repository.findByCode(code);
    }
    
    public long save(Destination destination) {
    	
        
        return repository.save(destination)
                             .getId();
    }
    public void update(long id, Destination destination) {
        Optional<Destination> dest = repository.findById(id);
        if (dest.isPresent()) {
        	Destination des = dest.get();
            des.setLibelle(destination.getLibelle());
           
            
            repository.save(des);
        }
    }
  

    public List<Destination> findByLibelle(String libelle) {
        return repository.findAllByLibelleContaining(libelle);
    }

    public void delete(long id) {
        Optional<Destination> gra = repository.findById(id);
        gra.ifPresent(repository::delete);
    }

	public Optional<Destination> findById(Long id) {
		
		return repository.findById(id);
	}
	public int max() {
		return repository.max();	
		}
		public int nbre() {
			return repository.nbre();
		}
}
