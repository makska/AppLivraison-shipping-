package com.projet.pfe.Service;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projet.pfe.model.Cposte;
import com.projet.pfe.repository.CposteRepository;

@Service
@Transactional
public class CposteService {
	@Autowired
	CposteRepository repository;
	public CposteService() {
		// TODO Auto-generated constructor stub
	}

	public int nbre(int annee) {
		return repository.nbre(annee);
	}

	public void create(int annee) {
		 Cposte cpt = new Cposte();
	        cpt.setAnnee(annee);
	        cpt.setNumdepot(1);
	        cpt.setNumcollecte(1);
	        cpt.setNumenvoi(1);
	        cpt.setNumliv(1);
	        cpt.setNumreg(1);
	        cpt.setTarifCollecte(20.000);
	        repository.save(cpt);
		
	}

	public Optional<Cposte> findByAnnee(int annee) {
		// TODO Auto-generated method stub
		return repository.findByAnnee(annee);
	}

}
