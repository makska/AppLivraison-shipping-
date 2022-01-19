package com.projet.pfe.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "collecte")
public class Collecte {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private int annee;
	  private int numero;
	  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	  private Date dateCollecte;
	  private String matAgent;
	  private String tel;
	  private String destinataire;
	 // private String nom;
	  private String adresse;
	  private String codeDestination;
	 
	  private String codeClient;
	  private String emailClient;
	  private String emailDestinataire;
	 
	  private double montant;
	  private double pu;
	  private double tarifCollecte;
	  private double total;
	  private String etat;
	 
	
	  @JsonManagedReference
	  @JsonIgnore
	  @OneToMany(mappedBy = "collecte", fetch=FetchType.EAGER)
    @Valid
	  private List<Lcollecte> lcollectes = new ArrayList<>();


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


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
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


	public String getEmailClient() {
		return emailClient;
	}


	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}


	public String getEmailDestinataire() {
		return emailDestinataire;
	}


	public void setEmailDestinataire(String emailDestinataire) {
		this.emailDestinataire = emailDestinataire;
	}


	public double getMontant() {
		return montant;
	}


	public void setMontant(double montant) {
		this.montant = montant;
	}


	public double getPu() {
		return pu;
	}


	public void setPu(double pu) {
		this.pu = pu;
	}


	public double getTarifCollecte() {
		return tarifCollecte;
	}


	public void setTarifCollecte(double tarifCollecte) {
		this.tarifCollecte = tarifCollecte;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public List<Lcollecte> getLcollectes() {
		return lcollectes;
	}


	public void setLcollectes(List<Lcollecte> lcollectes) {
		this.lcollectes = lcollectes;
	}


	public Collecte(long id, int annee, int numero, Date dateCollecte, String matAgent, String tel, String destinataire,
			String adresse, String codeDestination, String codeClient, String emailClient, String emailDestinataire,
			double montant, double pu, double tarifCollecte, double total, String etat,
			@Valid List<Lcollecte> lcollectes) {
		super();
		this.id = id;
		this.annee = annee;
		this.numero = numero;
		this.dateCollecte = dateCollecte;
		this.matAgent = matAgent;
		this.tel = tel;
		this.destinataire = destinataire;
		this.adresse = adresse;
		this.codeDestination = codeDestination;
		this.codeClient = codeClient;
		this.emailClient = emailClient;
		this.emailDestinataire = emailDestinataire;
		this.montant = montant;
		this.pu = pu;
		this.tarifCollecte = tarifCollecte;
		this.total = total;
		this.etat = etat;
		this.lcollectes = lcollectes;
	}


	public Collecte() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Collecte [id=" + id + ", annee=" + annee + ", numero=" + numero + ", dateCollecte=" + dateCollecte
				+ ", matAgent=" + matAgent + ", tel=" + tel + ", destinataire=" + destinataire + ", adresse=" + adresse
				+ ", codeDestination=" + codeDestination + ", codeClient=" + codeClient + ", emailClient=" + emailClient
				+ ", emailDestinataire=" + emailDestinataire + ", montant=" + montant + ", pu=" + pu
				+ ", tarifCollecte=" + tarifCollecte + ", total=" + total + ", etat=" + etat + ", lcollectes="
				+ lcollectes + "]";
	}
	
}
