package com.projet.pfe.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projet.pfe.model.Ldepot;
@Repository


public interface LdepotRepository extends JpaRepository<Ldepot, Long> {

	

	List<Ldepot> findAllByDesignationContaining(int numero);
   /* @Modifying
    @Query("delete from Ldepot a where a.numero = :numero")
	void deleligne(@Param ("numero") int numero);*/
	
    
    


	List<Ldepot> findLdepotByNumero(int numero);
    
	



	

}
