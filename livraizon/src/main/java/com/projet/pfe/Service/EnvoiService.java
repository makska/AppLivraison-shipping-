package com.projet.pfe.Service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.projet.pfe.Dto.DetailsEnvoi;
import com.projet.pfe.Dto.ListEnvoi;
import com.projet.pfe.model.Cposte;
import com.projet.pfe.model.Envoi;
import com.projet.pfe.model.Lenvoi;
import com.projet.pfe.repository.CposteRepository;
import com.projet.pfe.repository.EnvoiRepository;
import com.projet.pfe.repository.LenvoiRepository;

@Service
@Transactional
public class EnvoiService {
	@Autowired EnvoiRepository envoirepo;
	@Autowired LenvoiRepository lenvoirepo;
	@Autowired CposteRepository  crepository;
	public List<ListEnvoi> getAll() {
		System.out.println("Get all Envoissss...");
    	return envoirepo.listEnvoi();	    	
    }
	  
	    
	  public void  save(@Valid @RequestBody Envoi Envoi) {
		  System.out.println("save lenvoi");
		   List<Lenvoi> lenvois = Envoi.getLenvois();
		   System.out.println(Envoi);
		   for (Lenvoi lenvoi : lenvois) {
		    	 System.out.println(Envoi.getNumero());
		    	 lenvoi.setNumero(Envoi.getNumero());
	           
	           
	           System.out.println(" save data ligne");
	           lenvoirepo.save(lenvoi);
		       }
		   Optional<Cposte> CompteurInfo = crepository.findByAnnee(Envoi.getAnnee());
	     	if (CompteurInfo.isPresent()) {
		    	Cposte compteur = CompteurInfo.get();
		           compteur.setNumliv(compteur.getNumfact()+1);
		         compteur =   crepository.save(compteur);
	     	}
	     	 
	     	
		   	
		   envoirepo.save(Envoi);
	    }
	   
	  
	
	 

	    public void delete(long id) {
	        Optional<Envoi> dep = envoirepo.findById(id);
	       dep.ifPresent(envoirepo::delete);
	    }
		public Optional<Envoi> findById(long id) {
			// TODO Auto-generated method stub
			return envoirepo.findById(id);
		}
	
		public List<DetailsEnvoi> listEnvoi() {
		
			return envoirepo.listenvoi();
		}

		
		
	



}
