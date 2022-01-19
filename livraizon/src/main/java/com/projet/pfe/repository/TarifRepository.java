package com.projet.pfe.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projet.pfe.Dto.ListTarif;
import com.projet.pfe.model.Tarif;


@Repository
public interface TarifRepository extends JpaRepository<Tarif,Long> {

	

	Optional<Tarif> findByCode(String code);

	List<Tarif> findAllByCode(String code);
	@Query(value = "SELECT count(code) FROM Tarif")
	public int nbre();

	@Query(value = "SELECT max(code) FROM Tarif")
	public int max();
	
	@Query(value = "SELECT new com.projet.pfe.Dto.ListTarif (a.code ,b.code,c.code, b.libelle ,c.libelle ,d.deb,d.fin,d.montant "
			+ ")  from Tarif a ,TypeCourrier b , Destination c, Ltarif d where a.typecourrier=b.code "
			+ " and a.codedes= c.code and a.code = d.code ")
	public   List<ListTarif> listTarif();
	@Query(value = "SELECT count(*) from Tarif   where codedes = :codes and typecourrier = :typec")
	public int nbrTarif(@Param("codes") String  codes,@Param("typec") String  typec);
	
	@Query(value = "SELECT b.montant  from Tarif a  , Ltarif b where a.code=b.code "
			+ " and a.codedes= :cd and a.typecourrier= :tc and (:p >= b.deb and :p <= b.fin) ")
		public  double mtarif(@Param("p") double p,@Param("tc") String tc,@Param("cd") String cd);
	@Query(value = "SELECT count(*) from Tarif a  , Ltarif b where a.code=b.code "
			+ " and a.codedes= :cd and a.typecourrier= :tc and (:p >= b.deb and :p <= b.fin) ")
		public  int countTarif(@Param("p") double p,@Param("tc") String tc,@Param("cd") String cd);
	
	
	List<Tarif> findAllByTypecourrier(String code);


	List<Tarif> findAllByCodedes(String code);
	
	
	

}
