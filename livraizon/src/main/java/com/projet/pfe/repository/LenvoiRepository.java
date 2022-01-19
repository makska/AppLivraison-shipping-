package com.projet.pfe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.pfe.model.Lenvoi;

public interface LenvoiRepository extends JpaRepository<Lenvoi, Long> {

		//List<Llivraison> findAllByDestinationContaining(int numero);

		List<Lenvoi> findAllByNumeroContaining(int numero);

}
