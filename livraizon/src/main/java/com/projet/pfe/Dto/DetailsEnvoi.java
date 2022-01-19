package com.projet.pfe.Dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DetailsEnvoi {
	 private long id;
	  private int annee;
	  private int numero;
	  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	  private Date dateEnvoi;
	  private String agent;
	  private String nomAgent;
	  private String numvol;
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
	public Date getDateEnvoi() {
		return dateEnvoi;
	}
	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
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
	public String getNumvol() {
		return numvol;
	}
	public void setNumvol(String numvol) {
		this.numvol = numvol;
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
	public DetailsEnvoi(long id, int annee, int numero, Date dateEnvoi, String agent, String nomAgent,
			String numvol, String observation, int num, String codeDestination, String libDestination, String adresse,
			String tel, String designation, int codeBarre) {
		super();
		this.id = id;
		this.annee = annee;
		this.numero = numero;
		this.dateEnvoi = dateEnvoi;
		this.agent = agent;
		this.nomAgent = nomAgent;
		this.numvol = numvol;
		this.observation = observation;
		this.num = num;
		this.codeDestination = codeDestination;
		this.libDestination = libDestination;
		this.adresse = adresse;
		this.tel = tel;
		this.designation = designation;
		this.codeBarre = codeBarre;
	}
	public DetailsEnvoi() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ListDetailsEnvoi [id=" + id + ", annee=" + annee + ", numero=" + numero + ", dateEnvoi=" + dateEnvoi
				+ ", agent=" + agent + ", nomAgent=" + nomAgent + ", numvol=" + numvol + ", observation=" + observation
				+ ", num=" + num + ", codeDestination=" + codeDestination + ", libDestination=" + libDestination
				+ ", adresse=" + adresse + ", tel=" + tel + ", designation=" + designation + ", codeBarre=" + codeBarre
				+ "]";
	}
  	  
}
