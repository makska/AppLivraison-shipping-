package com.projet.pfe.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "demandecollecte")
public class demandeCarte {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	  private String codeClient;
	  private String designation;
	  private String adresse ;
	  private int tel ;  
	  private boolean accepter ;
	  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	  private Date dateDemande;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodeClient() {
		return codeClient;
	}
	public void setCodeClient(String codeClient) {
		this.codeClient = codeClient;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public boolean isAccepter() {
		return accepter;
	}
	public void setAccepter(boolean accepter) {
		this.accepter = accepter;
	}
	public Date getDateDemande() {
		return dateDemande;
	}
	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}
	@Override
	public String toString() {
		return "demandeCarte [id=" + id + ", codeClient=" + codeClient + ", designation=" + designation + ", adresse="
				+ adresse + ", tel=" + tel + ", accepter=" + accepter + ", dateDemande=" + dateDemande + "]";
	}
	public demandeCarte(long id, String codeClient, String designation, String adresse, int tel, boolean accepter,
			Date dateDemande) {
		super();
		this.id = id;
		this.codeClient = codeClient;
		this.designation = designation;
		this.adresse = adresse;
		this.tel = tel;
		this.accepter = accepter;
		this.dateDemande = dateDemande;
	}
	public demandeCarte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
