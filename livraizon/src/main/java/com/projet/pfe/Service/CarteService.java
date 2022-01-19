package com.projet.pfe.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.pfe.model.Carte;
import com.projet.pfe.model.Grade;
import com.projet.pfe.repository.CarteRepository;
@Service 
public class CarteService {
	@Autowired
	CarteRepository carterepo;

	public List<Carte> getAll() {
		// TODO Auto-generated method stub
		return carterepo.findAll();
	}

	public Optional<Carte> findByNumCarte(String numCarte) {
		// TODO Auto-generated method stub
		return carterepo.findByNumCarte(numCarte);
	}

	 public long save(Carte carte) {
	    	
	        
	        return carterepo.save(carte)
	                             .getId();
	    }
}


