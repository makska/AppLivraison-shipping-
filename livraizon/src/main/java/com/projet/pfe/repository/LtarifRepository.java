package com.projet.pfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.projet.pfe.model.Ltarif;


@Repository
public interface LtarifRepository extends JpaRepository<Ltarif,Long> {
	@Query(value = "SELECT max(code) FROM Ltarif")
	int max();
	@Query(value = "SELECT count(code) FROM Ltarif")
	int nbre();
	
	

}
