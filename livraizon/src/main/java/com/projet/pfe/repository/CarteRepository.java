package com.projet.pfe.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.pfe.model.Carte;

@Repository
public interface CarteRepository extends JpaRepository<Carte, Long> {

	
	

		Optional<Carte> findByNumCarte(String numCarte);

		
	}


