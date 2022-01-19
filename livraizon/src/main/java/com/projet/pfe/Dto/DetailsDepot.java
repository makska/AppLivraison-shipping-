package com.projet.pfe.Dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DetailsDepot {
	
    private long id;
	private int numero;
	private String codeDestination;
	private String codeClient;
	private String libDestination;
	private String libClient;
	private String article;
	 private String adresse;
	private double total;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	private Date dateDepot;
	private String tel;
	private String destinataire;
	private double poids;
	private double montant;
	private String designation;
	  private int num;
	  private int codeBarre;
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
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getDateDepot() {
		return dateDepot;
	}
	public void setDateDepot(Date dateDepot) {
		this.dateDepot = dateDepot;
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
	
	public int getCodeBarre() {
		return codeBarre;
	}
	public void setCodeBarre(int codeBarre) {
		this.codeBarre = codeBarre;
	}
	
	public DetailsDepot(long id, int numero, String codeDestination, String codeClient, String libDestination,
			String libClient, String article, String adresse, double total, Date dateDepot, String tel,
			String destinataire,  double poids, double montant, String designation, int num, int codeBarre) {
		super();
		this.id = id;
		this.numero = numero;
		this.codeDestination = codeDestination;
		this.codeClient = codeClient;
		this.libDestination = libDestination;
		this.libClient = libClient;
		this.article = article;
		this.adresse = adresse;
		this.total = total;
		this.dateDepot = dateDepot;
		this.tel = tel;
		this.destinataire = destinataire;
		this.poids = poids;
		this.montant = montant;
		this.designation = designation;
		this.num = num;
		this.codeBarre = codeBarre;
	}
	public DetailsDepot() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DetailsDepot [id=" + id + ", numero=" + numero + ", codeDestination=" + codeDestination
				+ ", codeClient=" + codeClient + ", libDestination=" + libDestination + ", libClient=" + libClient
				+ ", article=" + article + ", adresse=" + adresse + ", total=" + total + ", dateDepot=" + dateDepot
				+", tel=" + tel + ", destinataire=" + destinataire 
				+ ", poids=" + poids + ", montant=" + montant + ", designation=" + designation + ", num=" + num
				+ ", codeBarre=" + codeBarre + "]";
	}
	
	
	
}
