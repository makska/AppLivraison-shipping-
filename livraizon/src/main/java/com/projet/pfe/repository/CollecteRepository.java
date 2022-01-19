package com.projet.pfe.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.projet.pfe.Dto.DetailsCollecte;
import com.projet.pfe.Dto.ListCollecte;
import com.projet.pfe.model.Collecte;
import com.projet.pfe.model.Depot;
public interface CollecteRepository extends JpaRepository<Collecte, Long>{
	@Query(value = "SELECT new com.projet.pfe.Dto.ListCollecte (a.id,a.numero ,b.code,c.code, b.libelle,c.libelle ,a.total,a.dateCollecte,d.mat,d.nom,a.tel"
			+ ")  from Collecte a ,Destination b , Client c, Agent d where a.codeDestination=b.code and a.matAgent=d.mat "
			+ " and a.codeClient= c.code")
	
	public   List<ListCollecte> listcollecte();
	
	@Query(value = "SELECT new com.projet.pfe.Dto.ListCollecte (a.id,a.numero ,b.code,c.code, b.libelle,c.libelle ,a.total,a.dateCollecte,d.mat,d.nom,a.tel "
			+ ")  from Collecte a ,Destination b , Client c , Agent d where a.codeDestination=b.code and a.matAgent=d.mat "
			+ " and a.codeClient= c.code and c.code = :code")
	
	public   List<ListCollecte> listCollecteClient(@Param("code") int  code);
	
	@Query(value = "SELECT new com.projet.pfe.Dto.ListCollecte (a.id,a.numero ,b.code,c.code, b.libelle,c.libelle ,a.total,a.dateCollecte,d.mat,d.nom,a.tel "
			+ ")  from Collecte a ,Destination b , Client c   , Agent d  where a.codeDestination=b.code and a.matAgent=d.mat "
			+ " and a.codeClient= c.code and b.code = :code")
	
	public   List<ListCollecte> listCollecteDestination(@Param("code") int  code);

	
	@Query(value = "SELECT new com.projet.pfe.Dto.DetailsCollecte (a.id,a.numero ,b.code,c.code, b.libelle,c.libelle ,a.total,a.dateCollecte,"
	+"a.matAgent,a.tel,a.destinataire,d.poids,d.montant,d.designation,d.num "
			+ ")  from Collecte a ,Destination b , Client c , Lcollecte d where a.codeDestination=b.code "
			+ " and a.codeClient= c.code and a.numero = d.numero")
	
	public   List<DetailsCollecte> listCollecte();
	
	
	@Query(value = "SELECT new com.projet.pfe.Dto.DetailsCollecte (a.id,a.numero ,b.code,c.code, b.libelle,c.libelle ,a.total,a.dateCollecte,"
	+"a.matAgent,a.tel,a.destinataire,d.poids,d.montant,d.designation,d.num "
			+ ")  from Collecte a ,Destination b , Client c , Lcollecte d where a.codeDestination=b.code "
			+ " and a.codeClient= c.code and a.numero = d.numero and c.code = :code")
	public   List<DetailsCollecte> listCcollecteClient(@Param("code") int  code);
	
	@Query(value = "SELECT new com.projet.pfe.Dto.DetailsCollecte (a.id,a.numero ,b.code,c.code, b.libelle,c.libelle ,a.total,a.dateCollecte,"
	+"a.matAgent,a.tel,a.destinataire,d.poids,d.montant,d.designation,d.num "
			+ ")  from Collecte a ,Destination b , Client c , Lcollecte d where a.codeDestination=b.code "
			+ " and a.codeClient= c.code and a.numero = d.numero and b.code = :code")
		public   List<DetailsCollecte> listCcollecteDestination(@Param("code") int  code);
	
	/*public List<Collecte> findAllById(long id);
	@Query(value = "SELECT new com.projet.pfe.Dto.ListCollecte (a.id,a.numero ,b.code,c.code, b.libelle ,c.libelle ,d.poids,a.chauffeur,a.tel,a.destinataire "
			+ ")  from Collecte a ,Destination b , Client c, Lcollecte d where a.codeDestination=b.code "
			+ " and a.codeClient= c.code and a.numero = d.numero ")
	public   List<ListCollecte> listCollecte();*/


}