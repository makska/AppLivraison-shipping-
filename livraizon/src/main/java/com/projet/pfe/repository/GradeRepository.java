package com.projet.pfe.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.projet.pfe.model.Grade;
@Repository
public interface GradeRepository extends JpaRepository<Grade, Long>{

	Optional<Grade> findByCode(String code);
	List<Grade> findAllByLibelleContaining(String libelle);

	List<Grade> findAllByCode(String code);
	@Query(value= "SELECT count(code)FROM Grade")
	public int nbre();
	@Query (value = "SELECT max (code)FROM Grade")
	public int max();

}

