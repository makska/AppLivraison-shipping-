package com.projet.pfe.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.pfe.model.Lcollecte;


@Repository
public interface LcollecteRepository extends JpaRepository<Lcollecte, Long>{
	

	List<Lcollecte> findAllByDesignationContaining(int numero);

	
	
	

}
