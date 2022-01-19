package com.projet.pfe.repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projet.pfe.Dto.DetailsLivraison;
import com.projet.pfe.Dto.ListLivraison;
import com.projet.pfe.model.Livraison;



@Repository
public interface LivraisonRepository extends JpaRepository<Livraison, Long> {

	Optional<Livraison> findById(long id);

	List<Livraison> findAllById(long id);

	@Query(value = "SELECT new com.projet.pfe.Dto.ListLivraison (a.id,a.numero ,b.code,c.mat, b.libelle,c.nom ,a.dateLivraison,a.Engin,l.tel,l.codeBarre,l.adresse "
			+ ")  from Livraison a ,Destination b , Agent c,Llivraison l  where a.numero=l.numero and a.agent=c.mat and b.libelle=l.destination ")
	List<ListLivraison> listLivraison();
	
	@Query(value = "SELECT new com.projet.pfe.Dto.DetailsLivraison (a.id,a.annee,a.numero,a.dateLivraison,c.mat,c.nom,a.Engin,a.observation,l.num,b.code,b.libelle,l.adresse,l.tel,l.designation,l.codeBarre"
					+ ")  from Livraison a ,Destination b ,Agent c , Llivraison l where b.libelle=l.destination  "
					+ " and a.agent= c.mat and a.numero = l.numero ")
	List<DetailsLivraison> listlivraison();
	
	

}
