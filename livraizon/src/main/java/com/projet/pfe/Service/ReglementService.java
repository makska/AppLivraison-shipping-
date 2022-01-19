package com.projet.pfe.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.pfe.domaine.Message;
import com.projet.pfe.model.Carte;
import com.projet.pfe.model.Cposte;
import com.projet.pfe.model.Reglement;
import com.projet.pfe.repository.CarteRepository;
import com.projet.pfe.repository.CposteRepository;
import com.projet.pfe.repository.ReglementRepository;
@Service
public class ReglementService {
	@Autowired
	ReglementRepository payRepo;
	@Autowired
	CposteRepository crepository;
	@Autowired
	CarteRepository carterep;
	public List<Reglement> getAll() {
		// TODO Auto-generated method stub
		return payRepo.findAll();
	}
	public Message save(Reglement reglement) {
		payRepo.save(reglement);
		Optional<Carte> CarteInfoo = carterep.findByNumCarte(reglement.getNumCarte());
     	if (CarteInfoo.isPresent()) {
	    	Carte carte = CarteInfoo.get();
	           carte.setSolde(carte.getSolde() - reglement.getMontant());
	         carte = carterep.save(carte);
     	}
	
		return new Message("Votre reglement est enregistrée");
		
		
		
	}

	

}

