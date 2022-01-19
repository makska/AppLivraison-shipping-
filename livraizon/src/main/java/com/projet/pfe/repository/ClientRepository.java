package com.projet.pfe.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.projet.pfe.model.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
Optional<Client> findById(long id);
	List<Client> findAllByLibelleContaining(String libelle);
	List<Client> findAllByEmail(String email);
	
	

}
