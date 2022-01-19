package com.projet.pfe.Service;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.projet.pfe.model.Ldepot;

import com.projet.pfe.repository.LdepotRepository;

@Service
@Transactional

public class LdepotService {

	@Autowired 	LdepotRepository ldepotrepo;
	
	public List<Ldepot> getAll() {
		System.out.println("Get all Ldepots 11111...");
    	return ldepotrepo.findAll(Sort.by("numero").ascending());	    	
    }
	    public long save(Ldepot ldepot) {	
	        return  ldepotrepo.save(ldepot)
	                             .getId();
	    }
	    public List<Ldepot> findByNumero(int numero) {
	        return ldepotrepo.findAllByDesignationContaining(numero);
	    }

	    public void delete(long id) {
	        Optional<Ldepot> dep = ldepotrepo.findById(id);
	       dep.ifPresent(ldepotrepo::delete);
	    }
		public void update(long id, Ldepot ldepot) {
			 Optional<Ldepot> ldepo = ldepotrepo.findById(id);
		        if (ldepo.isPresent()) {
		           Ldepot ldep =ldepo.get();
		           ldep.setNumero(ldepot.getNumero());
		           ldep.setNum(ldepot.getNum());
		           ldep.setDesignation(ldepot.getDesignation());
		           ldep.setMontant(ldepot.getMontant());
		           ldep.setPoids(ldepot.getPoids());
		           ldep.setTypeCourrier(ldepot.getTypeCourrier());
		            ldepotrepo.save(ldep);
		        }
		    }
		public Optional<Ldepot> findById(long id) {
			// TODO Auto-generated method stub
			return ldepotrepo.findById(id);
		}

}
