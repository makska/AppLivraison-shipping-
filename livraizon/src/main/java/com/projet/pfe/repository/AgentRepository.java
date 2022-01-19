package com.projet.pfe.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.projet.pfe.Dto.ListAgent;
import com.projet.pfe.model.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long>{
	
	
	
	@Query(value = "SELECT count(*)  FROM Agent   WHERE cgrade  = :code")

	public int nbre(int code);
	@Query(value = "SELECT max(code) FROM Agence  where cgrade = :code")
	public int max(int code);
	 
	@Query(value = "SELECT new com.projet.pfe.Dto.ListAgent ( a.mat,a.nom,b.code,c.code,d.code, "
			+ " d.libelle,c.libelle,b.libelle)  from Agent a , Grade b , Agence c, Direction d where a.cgrade=b.code "
			+ " and a.cagence= c.code and c.codedir = d.code ")
	public   List<ListAgent> listAgent();
	
	Optional <Agent> findAllByMat(String mat);


	public List<Agent> findAllByCgrade(String code);


	public List<Agent> findAllByCagence(String code);

	List<Agent> findAllByNom(String nom);
	public Optional<Agent> findAllById(long id);

	
	
	
	
	
	
	
	
}
