package com.projet.pfe.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.projet.pfe.model.Ldepot;
import com.projet.pfe.model.Llivraison;
import com.projet.pfe.repository.LlivraisonRepository;

@Service
@Transactional
public class LlivraisonService {
	@Autowired 	LlivraisonRepository llivrrepo;
	public List<Llivraison> getAll() {
		System.out.println("Get all Ldepots 11111...");
    	return llivrrepo.findAll(Sort.by("numero").ascending());	    	
    }
	   
	    
	    public long save(Llivraison llivraison) {
	    	
	        return  llivrrepo.save(llivraison)
	                             .getId();
	    }
	    
	
	    public List<Llivraison> findByNumero(int numero) {
	        return llivrrepo.findAllByNumeroContaining(numero);
	    }

	    public void delete(long id) {
	        Optional<Llivraison> lvr = llivrrepo.findById(id);
	       lvr.ifPresent(llivrrepo::delete);
	    }
		public void update(long id,Llivraison llivraison) {
			 Optional<Llivraison> llivr = llivrrepo.findById(id);
		        if (llivr.isPresent()) {
		           Llivraison lvr =llivr.get();
		          
		            
		            lvr.setNumero(llivraison.getNumero());
		          
		           lvr.setCodeBarre(llivraison.getCodeBarre());
		            
		            llivrrepo.save(lvr);
		        }
		    }
		public Optional<Llivraison> findById(long id) {
			// TODO Auto-generated method stub
			return llivrrepo.findById(id);
		}

}
