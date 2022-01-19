package com.projet.pfe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.projet.pfe.Dto.DetailsDepot;
import com.projet.pfe.Dto.ListDepot;
import com.projet.pfe.model.Depot;
import com.projet.pfe.model.Ldepot;

@Repository
public interface DepotRepository extends JpaRepository<Depot, Long>{

	
	
	List<Depot> findAllById(long id);
	
	@Query(value = "SELECT new com.projet.pfe.Dto.ListDepot (a.id,a.numero ,b.code,c.code, b.libelle,c.libelle,a.article,a.adresse ,a.total,a.dateDepot,"
			+ "a.tel,a.destinataire,d.poids,d.montant,d.designation,d.num,a.codeBarre,a.emailClient,a.emailDestinataire,a.montantAssurance,a.valeurEstime,"
			+ "t.code,t.libelle"
			+ ") from Depot a ,Destination b , Client c , Ldepot d,TypeCourrier t where a.codeDestination=b.code and a.codeClient= c.code and a.numero = d.numero  and d.typeCourrier = t.code ")
	
	public   List<ListDepot> listDepot();

	
	/*@Query(value = "SELECT new com.projet.pfe.Dto.ListDepot (a.id,a.numero ,b.code,c.code, b.libelle,c.libelle,a.article,a.adresse ,a.total,a.dateDepot,\"\r\n"
			+ "	+\"a.tel,a.destinataire,d.poids,d.montant,d.designation,d.num,a.codeBarre \"\r\n"
			+ "			+ \")  from Depot a ,Destination b , Client c , Ldepot d where a.codeDestination=b.code \"\r\n"
			+ "			+ \" and a.codeClient= c.code and a.numero = d.numero and c.code = :code")
	
	public   List<ListDepot> listDepotClient(@Param("code") int  code);
	
	@Query(value = "SELECT new com.projet.pfe.Dto.ListDepot (a.id,a.numero ,b.code,c.code, b.libelle,c.libelle,a.article,a.adresse ,a.total,a.dateDepot,\"\r\n"
			+ "	+\"a.tel,a.destinataire,d.poids,d.montant,d.designation,d.num,a.codeBarre \"\r\n"
			+ "			+ \")  from Depot a ,Destination b , Client c , Ldepot d where a.codeDestination=b.code \"\r\n"
			+ "			+ \" and a.codeClient= c.code and a.numero = d.numero and b.code = :code")
	
	public   List<ListDepot> listDepotDestination(@Param("code") int  code);

	
	@Query(value = "SELECT new com.projet.pfe.Dto.DetailsDepot (a.id,a.numero ,b.code,c.code, b.libelle,c.libelle,a.article,a.adresse ,a.total,a.dateDepot,"
	+"a.tel,a.destinataire,d.poids,d.montant,d.designation,d.num,a.codeBarre "
			+ ")  from Depot a ,Destination b , Client c , Ldepot d where a.codeDestination=b.code "
			+ " and a.codeClient= c.code and a.numero = d.numero")
	
	public   List<DetailsDepot> listDdepot();
	
	
	@Query(value = "SELECT new com.projet.pfe.Dto.DetailsDepot (a.id,a.numero ,b.code,c.code, b.libelle,c.libelle,a.article,a.adresse,a.total,a.dateDepot,"
	+"a.tel,a.destinataire,d.poids,d.montant,d.designation,d.num,a.codeBarre "
			+ ")  from Depot a ,Destination b , Client c , Ldepot d where a.codeDestination=b.code "
			+ " and a.codeClient= c.code and a.numero = d.numero and c.code = :code")
	public   List<DetailsDepot> listDdepotClient(@Param("code") int  code);
	
	@Query(value = "SELECT new com.projet.pfe.Dto.DetailsDepot (a.id,a.numero ,b.code,c.code, b.libelle,c.libelle,a.article,a.adresse,a.total,a.dateDepot,"
	+"a.tel,a.destinataire,d.poids,d.montant,d.designation,d.num ,a.codeBarre"
			+ ")  from Depot a ,Destination b , Client c , Ldepot d where a.codeDestination=b.code "
			+ " and a.codeClient= c.code and a.numero = d.numero and b.code = :code")
		public   List<DetailsDepot> listDdepotDestination(@Param("code") int  code);

	
	@Query(value = "SELECT new com.projet.pfe.Dto.DetailsDepot (a.id,a.numero ,b.code,c.code, b.libelle,c.libelle ,a.article,a.adresse ,a.total,a.dateDepot,"
			+"a.tel,a.destinataire,d.poids,d.montant,d.designation,d.num,a.codeBarre "
					+ ")  from Depot a ,Destination b , Client c , Ldepot d where a.codeDestination=b.code "
					+ " and a.codeClient= c.code and a.numero = d.numero and a.codeBarre = :code")
				public   List<DetailsDepot> listcourrier(@Param("code") String  code);
*/
	@Query(value = "SELECT new com.projet.pfe.Dto.DetailsDepot (a.id,a.numero ,b.code,c.code, b.libelle,c.libelle ,a.article,a.adresse ,a.total,a.dateDepot,"
			+"a.tel,a.destinataire,d.poids,d.montant,d.designation,d.num,a.codeBarre "
					+ ")  from Depot a ,Destination b , Client c , Ldepot d where a.codeDestination=b.code "
					+ " and a.codeClient= c.code and a.numero = d.numero and a.etat = 'I'")
				public   List<DetailsDepot> listdepot();
	List<Depot> findByCodeClient(String code);
				
}
