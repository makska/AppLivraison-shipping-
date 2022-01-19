package com.projet.pfe.Dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DetailsLivraison {
	 private long id;
	  private int annee;
	  private int numero;
	  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	  private Date dateLivraison;
	  private String agent;
	  private String nomAgent;
	  private String Engin;
	  private String observation;
	  private int num;
	  private String codeDestination;
	  private String libDestination;
	  private String adresse;
   	  private String tel;
	  private String designation;
   	  private int codeBarre;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getDateLivraison() {
		return dateLivraison;
	}
	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getEngin() {
		return Engin;
	}
	public void setEngin(String engin) {
		Engin = engin;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getNomAgent() {
		return nomAgent;
	}
	public void setNomAgent(String nomAgent) {
		this.nomAgent = nomAgent;
	}
	public String getCodeDestination() {
		return codeDestination;
	}
	public void setCodeDestination(String codeDestination) {
		this.codeDestination = codeDestination;
	}
	public String getLibDestination() {
		return libDestination;
	}
	public void setLibDestination(String libDestination) {
		this.libDestination = libDestination;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getCodeBarre() {
		return codeBarre;
	}
	public void setCodeBarre(int codeBarre) {
		this.codeBarre = codeBarre;
	}
	
	public DetailsLivraison(long id, int annee, int numero, Date dateLivraison, String agent, String nomAgent,
			String engin, String observation, int num, String codeDestination, String libDestination, String adresse,
			String tel, String designation, int codeBarre) {
		super();
		this.id = id;
		this.annee = annee;
		this.numero = numero;
		this.dateLivraison = dateLivraison;
		this.agent = agent;
		this.nomAgent = nomAgent;
		Engin = engin;
		this.observation = observation;
		this.num = num;
		this.codeDestination = codeDestination;
		this.libDestination = libDestination;
		this.adresse = adresse;
		this.tel = tel;
		this.designation = designation;
		this.codeBarre = codeBarre;
	}
	public DetailsLivraison() {
		super();
	}
   	  
}
