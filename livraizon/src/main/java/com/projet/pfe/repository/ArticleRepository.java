package com.projet.pfe.repository;
import java.util.List;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.projet.pfe.Dto.ListArticle;

import com.projet.pfe.model.Article;



@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{

	

	Optional<Article> findByCode(String code);

	List<Article> findAllByLibelleContaining(String libelle);

	List<Article> findAllByCcateg(String code);

	
	
	@Query(value = "SELECT new com.projet.pfe.Dto.ListArticle (a.code,a.libelle,c.libelle,a.pa,a.pv,a.tva,a.stock)"
			+ " from Article a,  Categorie c where a.ccateg = c.code ")
	List<ListArticle> listArticle();

	@Query(value = "SELECT count(*)  FROM Article   WHERE ccateg  = :code")
	public int nbre (@Param("code") String  code);
	
	@Query(value = "SELECT max(code) FROM Article  where ccateg = :code")
	public int max(@Param("code") String  code);

	Optional<Article> findAllById(Long id);
	

} 
