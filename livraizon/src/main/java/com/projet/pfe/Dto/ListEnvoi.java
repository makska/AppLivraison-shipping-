package com.projet.pfe.Dto;

import java.util.Date;

public class ListEnvoi {
	private long id;
	  private int numero;
		private String codeDestination;
	  private String agent;
	  private String libDestination;
	  private String nomAgent;
	  private Date dateEnvoi;
	  private Date datevol;
	  private String numvol;
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
	public String getCodeDestination() {
		return codeDestination;
	}
	public void setCodeDestination(String codeDestination) {
		this.codeDestination = codeDestination;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getLibDestination() {
		return libDestination;
	}
	public void setLibDestination(String libDestination) {
		this.libDestination = libDestination;
	}
	public String getNomAgent() {
		return nomAgent;
	}
	public void setNomAgent(String nomAgent) {
		this.nomAgent = nomAgent;
	}
	public Date getDateEnvoi() {
		return dateEnvoi;
	}
	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	public Date getDatevol() {
		return datevol;
	}
	public void setDatevol(Date datevol) {
		this.datevol = datevol;
	}
	public String getNumvol() {
		return numvol;
	}
	public void setNumvol(String numvol) {
		this.numvol = numvol;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public ListEnvoi(long id, int numero, String codeDestination, String agent, String libDestination, String nomAgent,
			Date dateEnvoi, Date datevol, String numvol, String tel, int codeBarre, String adresse) {
		super();
		this.id = id;
		this.numero = numero;
		this.codeDestination = codeDestination;
		this.agent = agent;
		this.libDestination = libDestination;
		this.nomAgent = nomAgent;
		this.dateEnvoi = dateEnvoi;
		this.datevol = datevol;
		this.numvol = numvol;
		this.tel = tel;
		this.codeBarre = codeBarre;
		this.adresse = adresse;
	}
	  
}
