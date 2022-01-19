package com.projet.pfe.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.projet.pfe.repository.CposteRepository;
import com.projet.pfe.repository.LivraisonRepository;
import com.projet.pfe.repository.LlivraisonRepository;
import com.projet.pfe.model.Llivraison;
import com.projet.pfe.Dto.DetailsLivraison;
import com.projet.pfe.Dto.ListLivraison;
import com.projet.pfe.model.Cposte;
import com.projet.pfe.model.Ldepot;
import com.projet.pfe.model.Livraison;
import javax.transaction.Transactional;
import javax.validation.Valid;

@Service
@Transactional
public class LivraisonService {
	@Autowired LivraisonRepository livraisonrepo;
	@Autowired LlivraisonRepository llivraisonrepo;
	@Autowired CposteRepository  crepository;
	public List<ListLivraison> getAll() {
		System.out.println("Get all Depots 11111...");
    	return livraisonrepo.listLivraison();	    	
    }
	  
	    
	  public void  save(@Valid @RequestBody Livraison Livraison) {
		  System.out.println("save llivraison");
		   List<Llivraison> llivraisons = Livraison.getLlivraisons();
		   System.out.println(Livraison);
		   for (Llivraison llivraison : llivraisons) {
		    	 System.out.println(Livraison.getNumero());
		    	 llivraison.setNumero(Livraison.getNumero());
	           
	           
	           System.out.println(" save data ligne");
	           llivraisonrepo.save(llivraison);
		       }
		   Optional<Cposte> CompteurInfo = crepository.findByAnnee(Livraison.getAnnee());
	     	if (CompteurInfo.isPresent()) {
		    	Cposte compteur = CompteurInfo.get();
		           compteur.setNumliv(compteur.getNumliv()+1);
		         compteur =   crepository.save(compteur);
	     	}
	     	 
	     	
		   	
		   livraisonrepo.save(Livraison);
	    }
	   
	  
	
	 

	    public void delete(long id) {
	        Optional<Livraison> dep = livraisonrepo.findById(id);
	       dep.ifPresent(livraisonrepo::delete);
	    }
		public Optional<Livraison> findById(long id) {
			// TODO Auto-generated method stub
			return livraisonrepo.findById(id);
		}
	
		public List<DetailsLivraison> listLivraison() {
		
			return livraisonrepo.listlivraison();
		}

		
		
	



}
