package com.projet.pfe.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projet.pfe.model.Direction;
@Repository
public interface DirectionRepository extends JpaRepository<Direction,Long> {
	Optional <Direction> findById(long id);
	List<Direction> findAllByLibelleContaining(String libelle);
	@Query(value= "SELECT count(code)FROM Direction")
	public int nbre();
	@Query (value = "SELECT max (code)FROM Direction")
	public int max();
}
