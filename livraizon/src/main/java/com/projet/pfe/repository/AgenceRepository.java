package com.projet.pfe.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projet.pfe.Dto.ListAgence;
import com.projet.pfe.model.Agence;

@Repository
public interface AgenceRepository extends JpaRepository <Agence,Long> {
	Optional <Agence> findById(long id);
	Optional<Agence> findByCode(String code); 
	List<Agence> findAllByCodedir(String code);
	List<Agence> findAllByLibelleContaining(String libelle);
	@Query(value = "SELECT new com.projet.pfe.Dto.ListAgence (a.code,a.libelle,b.libelle,b.code)  from Agence a ,Direction b "
			+ "where a.codedir = b.code ")
	public   List<ListAgence> listAgence();
	List<Agence> findByCodedir(String code);

	
	@Query(value= "SELECT count(*)FROM Agence where codedir = :code")
	public int nbre(String code);
	@Query (value = "SELECT max (code)FROM Agence where codedir = :code")
	public int max(String code);
	
	

}
