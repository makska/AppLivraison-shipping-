package com.projet.pfe.Dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DetailsCollecte {
	private long id;
	private int numero;
	private String codeDestination;
	private String codeClient;
	private String libDestination;
	private String libClient;
	private double total;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	private Date dateCollecte;
	private String matAgent;
	private String tel;
	private String destinataire;
	private double poids;
	private double montant;
	private String designation;
	  private int num;
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
	public String getCodeClient() {
		return codeClient;
	}
	public void setCodeClient(String codeClient) {
		this.codeClient = codeClient;
	}
	public String getLibDestination() {
		return libDestination;
	}
	public void setLibDestination(String libDestination) {
		this.libDestination = libDestination;
	}
	public String getLibClient() {
		return libClient;
	}
	public void setLibClient(String libClient) {
		this.libClient = libClient;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getDateCollecte() {
		return dateCollecte;
	}
	public void setDateCollecte(Date dateCollecte) {
		this.dateCollecte = dateCollecte;
	}
	public String getMatAgent() {
		return matAgent;
	}
	public void setMatAgent(String matAgent) {
		this.matAgent = matAgent;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}
	
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "DetailsCollecte [id=" + id + ", numero=" + numero + ", codeDestination=" + codeDestination
				+ ", codeClient=" + codeClient + ", libDestination=" + libDestination + ", libClient=" + libClient
				+ ", total=" + total + ", dateCollecte=" + dateCollecte + ", matAgent=" + matAgent + ", tel=" + tel
				+ ", destinataire=" + destinataire +  ", poids=" + poids + ", montant=" + montant
				+ ", designation=" + designation + ", num=" + num + "]";
	}
	public DetailsCollecte(long id, int numero, String codeDestination, String codeClient, String libDestination,
			String libClient, double total, Date dateCollecte, String matAgent, String tel, String destinataire,
			 double poids, double montant, String designation, int num) {
		super();
		this.id = id;
		this.numero = numero;
		this.codeDestination = codeDestination;
		this.codeClient = codeClient;
		this.libDestination = libDestination;
		this.libClient = libClient;
		this.total = total;
		this.dateCollecte = dateCollecte;
		this.matAgent = matAgent;
		this.tel = tel;
		this.destinataire = destinataire;
		
		this.poids = poids;
		this.montant = montant;
		this.designation = designation;
		this.num = num;
	}
	public DetailsCollecte() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	  

}
