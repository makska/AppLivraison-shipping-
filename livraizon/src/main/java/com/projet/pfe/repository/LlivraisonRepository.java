package com.projet.pfe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.projet.pfe.model.Llivraison;
@Repository
public interface LlivraisonRepository extends JpaRepository<Llivraison, Long> {

	//List<Llivraison> findAllByDestinationContaining(int numero);

	List<Llivraison> findAllByNumeroContaining(int numero);


}
