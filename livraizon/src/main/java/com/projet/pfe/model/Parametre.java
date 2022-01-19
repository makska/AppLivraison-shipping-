package com.projet.pfe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "parametre")

public class Parametre {

	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	 private String code;
	 private int numa;
	  private String libelle;
	  private int numc;
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
	public int getNuma() {
		return numa;
	}
	public void setNuma(int numa) {
		this.numa = numa;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getNumc() {
		return numc;
	}
	public void setNumc(int numc) {
		this.numc = numc;
	}
	@Override
	public String toString() {
		return "Parametre [id=" + id + ", code=" + code + ", numa=" + numa + ", libelle=" + libelle + ", numc=" + numc
				+ "]";
	}
	public Parametre(long id, String code, int numa, String libelle, int numc) {
		super();
		this.id = id;
		this.code = code;
		this.numa = numa;
		this.libelle = libelle;
		this.numc = numc;
	}
	public Parametre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
