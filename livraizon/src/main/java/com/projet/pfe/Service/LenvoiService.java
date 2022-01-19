package com.projet.pfe.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.projet.pfe.model.Lenvoi;
import com.projet.pfe.model.Llivraison;
import com.projet.pfe.repository.LenvoiRepository;
import com.projet.pfe.repository.LlivraisonRepository;
@Service
@Transactional
public class LenvoiService {
	@Autowired 	LenvoiRepository lenvoirepo;
	public List<Lenvoi> getAll() {
		System.out.println("Get all Lenvoiiiss...");
    	return lenvoirepo.findAll(Sort.by("numero").ascending());	    	
    }
	   
	    
	    public long save(Lenvoi lenvoi) {
	    	
	        return  lenvoirepo.save(lenvoi)
	                             .getId();
	    }
	    
	
	    public List<Lenvoi> findByNumero(int numero) {
	        return lenvoirepo.findAllByNumeroContaining(numero);
	    }

	    public void delete(long id) {
	        Optional<Lenvoi> lvr = lenvoirepo.findById(id);
	       lvr.ifPresent(lenvoirepo::delete);
	    }
		public void update(long id,Lenvoi lenvoi) {
			 Optional<Lenvoi> lenv = lenvoirepo.findById(id);
		        if (lenv.isPresent()) {
		           Lenvoi lev =lenv.get();
		           lev.setCodeBarre(lenvoi.getCodeBarre());
		            
		            lenvoirepo.save(lev);
		        }
		    }
		public Optional<Lenvoi> findById(long id) {
			// TODO Auto-generated method stub
			return lenvoirepo.findById(id);
		}

}
