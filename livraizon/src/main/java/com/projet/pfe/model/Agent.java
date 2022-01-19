package com.projet.pfe.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "agent")
public class Agent {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private String mat;
	  private String nom;
	  private String cgrade;
	  private String cagence;
	  private String pwd;
	  private String email;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCgrade() {
		return cgrade;
	}
	public void setCgrade(String cgrade) {
		this.cgrade = cgrade;
	}
	public String getCagence() {
		return cagence;
	}
	public void setCagence(String cagence) {
		this.cagence = cagence;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Agent(long id, String mat, String nom, String cgrade, String cagence, String pwd, String email) {
		super();
		this.id = id;
		this.mat = mat;
		this.nom = nom;
		this.cgrade = cgrade;
		this.cagence = cagence;
		this.pwd = pwd;
		this.email = email;
	}
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	
}
