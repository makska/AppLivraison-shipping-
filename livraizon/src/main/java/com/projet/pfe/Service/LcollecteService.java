package com.projet.pfe.Service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.projet.pfe.model.Lcollecte;
import com.projet.pfe.model.Ldepot;
import com.projet.pfe.repository.LcollecteRepository;
import com.projet.pfe.repository.LdepotRepository;
@Service
@Transactional

public class LcollecteService {
	@Autowired LcollecteRepository lcollecterepo;
	@Autowired LdepotRepository ldepotrepo;
	public List<Lcollecte> getAll() {
		System.out.println("Get all Lcollectes 11111...");
    	return lcollecterepo.findAll(Sort.by("numero").ascending());	    	
    }
	   
	    
	 public void  save(@Valid @RequestBody Lcollecte lcollecte) {
	    	Ldepot ldepot = new Ldepot();
	    	ldepot.setDesignation(lcollecte.getDesignation());
	    	ldepot.setMontant(lcollecte.getMontant());
	    	ldepot.setMontantAssurence(lcollecte.getMontantAssurence());
	    	ldepot.setNum(lcollecte.getNum());
	    	ldepot.setNumero(lcollecte.getNumero());
	    	ldepot.setPoids(lcollecte.getPoids());
	    	ldepot.setTypeCourrier(lcollecte.getTypeCourrier());
	    	ldepotrepo.save(ldepot);
	    	System.out.println("Getmayyyyyyyyyyyyyyyysssssaaaaaaaa...");
	      lcollecterepo.save(lcollecte);	    }
	    
	
	  
	    public void delete(long id) {
	        Optional<Lcollecte> col = lcollecterepo.findById(id);
	       col.ifPresent(lcollecterepo::delete);
	    }
		public void update(long id, Lcollecte lcollecte) {
			 Optional<Lcollecte> lcollec = lcollecterepo.findById(id);
		        if (lcollec.isPresent()) {
		           Lcollecte lcol =lcollec.get();
		           lcol.setNumero(lcol.getNumero()); 
		           lcol.setDesignation(lcol.getDesignation());
		           lcol.setPoids(lcol.getPoids());
		           lcol.setAnnee(lcol.getAnnee());
		            lcollecterepo.save(lcol);
		        }
		    }
		public Optional<Lcollecte> findById(long id) {
			// TODO Auto-generated method stub
			return lcollecterepo.findById(id);
		}
		public List<Lcollecte> findByNumero(int numero) {
	        return lcollecterepo.findAllByDesignationContaining(numero);
	    }
		  
}
