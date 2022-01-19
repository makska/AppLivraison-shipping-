package com.projet.pfe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.pfe.model.Reglement;

@Repository
public interface ReglementRepository  extends JpaRepository<Reglement, Long> {

	List<Reglement> findAll();



}



