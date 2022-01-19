package com.projet.pfe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "categorie")

public class Categorie {
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(long id, String code, String libelle, String fileName) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.fileName = fileName;
	}
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private String code;
	  private String libelle;
	  private String fileName;
	  
	 
	  public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
		
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", code=" + code + ", libelle=" + libelle + ", fileName=" + fileName + "]";
	}
	  
}
