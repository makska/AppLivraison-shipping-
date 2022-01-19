package com.projet.pfe.Dto;

import java.util.Date;



public class ListLivraison {
	private long id;
	  private int numero;
		private String codeDestination;
	  private String agent;
	  private String libDestination;
	  private String nomAgent;
	  private Date dateLivraison;
	  private String Engin;
	  private String tel;
	  private int codeBarre;
	  private String adresse;
	  
	 
   	 
   
   	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getNomAgent() {
		return nomAgent;
	}
	public void setNomAgent(String nomAgent) {
		this.nomAgent = nomAgent;
	}
	public String getEngin() {
		return Engin;
	}
	public void setEngin(String engin) {
		Engin = engin;
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
	
	public int getCodeBarre() {
		return codeBarre;
	}
	public void setCodeBarre(int codeBarre) {
		this.codeBarre = codeBarre;
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
	public ListLivraison(long id, int numero, String codeDestination, String agent, String libDestination,
			String nomAgent, Date dateLivraison, String engin, String tel, int codeBarre,String adresse) {
		super();
		this.id = id;
		this.numero = numero;
		this.codeDestination = codeDestination;
		this.agent = agent;
		this.libDestination = libDestination;
		this.nomAgent = nomAgent;
		this.dateLivraison = dateLivraison;
		Engin = engin;
		this.tel = tel;
		this.codeBarre = codeBarre;
		this.adresse = adresse;
	}
	
	
   	
}
