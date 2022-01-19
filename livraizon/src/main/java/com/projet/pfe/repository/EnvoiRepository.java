package com.projet.pfe.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projet.pfe.Dto.DetailsEnvoi;
import com.projet.pfe.Dto.ListEnvoi;
import com.projet.pfe.Dto.ListLivraison;
import com.projet.pfe.model.Envoi;
import com.projet.pfe.model.Livraison;


public interface EnvoiRepository extends JpaRepository <Envoi, Long> {
	Optional<Envoi> findById(long id);

	List<Envoi> findAllById(long id);

	@Query(value = "SELECT new com.projet.pfe.Dto.ListEnvoi (a.id,a.numero ,b.code,c.mat, b.libelle,c.nom ,a.dateEnvoi,a.datevol,a.numvol,l.tel,l.codeBarre,l.adresse "
			+ ")  from Envoi a ,Destination b , Agent c,Lenvoi l  where a.numero=l.numero and a.agent=c.mat and b.libelle=l.destination ")
	List<ListEnvoi> listEnvoi();

	

	
	@Query(value = "SELECT new com.projet.pfe.Dto.DetailsEnvoi (a.id,a.annee,a.numero,a.dateEnvoi,c.mat,c.nom,a.numvol,a.observation,l.num,b.code,b.libelle,l.adresse,l.tel,l.designation,l.codeBarre"
					+ ")  from Envoi a ,Destination b ,Agent c , Lenvoi l where b.libelle=l.destination  "
					+ " and a.agent= c.mat and a.numero = l.numero ")
	List<DetailsEnvoi> listenvoi();
	
	

}


