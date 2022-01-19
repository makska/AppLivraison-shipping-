package com.projet.pfe.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.pfe.model.Parametre;
@Repository
public interface ParametreRepository  extends JpaRepository<Parametre, Long>{
	Optional <Parametre> findByCode(String code);
	List<Parametre> findAllByLibelleContaining(String libelle);
	
	
	 

}

