package com.projet.pfe.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.projet.pfe.model.TypeCourrier;
@Repository
public interface TypeCourrierRepository extends JpaRepository<TypeCourrier, Long> {
	Optional <TypeCourrier> findById(long id);
	List<TypeCourrier> findAllByLibelleContaining(String libelle);
	@Query(value= "SELECT count(code)FROM TypeCourrier")
	public int nbre();
	@Query (value = "SELECT max (code)FROM TypeCourrier")
	public int max();
}
