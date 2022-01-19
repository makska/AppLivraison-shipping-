package com.projet.pfe.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.projet.pfe.model.Destination;


@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {
	Optional<Destination> findByCode(String code);
	List<Destination> findAllByLibelleContaining(String libelle);

	List<Destination> findAllByCode(String code);
	
	@Query(value= "SELECT count(code)FROM Destination")
	public int nbre();
	@Query (value = "SELECT max (code)FROM Destination")
	public int max();
	

}
