package com.projet.pfe.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projet.pfe.model.Cposte;
@Repository
public interface CposteRepository extends JpaRepository<Cposte, Long>{
	Optional<Cposte> findByAnnee(int annee);
	@Query(value = "SELECT count(*) FROM Cposte  where annee  = :annee")
	public int nbre(@Param("annee") int annee);
	

}
