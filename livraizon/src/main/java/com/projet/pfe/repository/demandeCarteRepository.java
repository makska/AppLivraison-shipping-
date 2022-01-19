package com.projet.pfe.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.pfe.model.demandeCarte;



@Repository
public interface demandeCarteRepository extends JpaRepository<demandeCarte, Long>{

	List<demandeCarte> findAll(Sort ascending);

}
