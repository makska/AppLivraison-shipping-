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
@Table(name = "depot")
public class Depot {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private int annee;
	  private int numero;
	  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	  private Date dateDepot;
	  private String tel;
	  private String destinataire;
	  private String codeDestination;
	  private int codeBarre;
	  private String codeClient;
	  private String article;
	  private String emailClient;
	  private String emailDestinataire;
	  private String adresse;
	  private double valeurEstime;
	  private String assurance;
	  private double montant;
	  private double montantAssurance;
	  private double total;
	  private String etat;
	  private double pu;
	  @JsonManagedReference
	  @JsonIgnore
	  @OneToMany(mappedBy = "depot", fetch=FetchType.EAGER)
  @Valid
	  private List<Ldepot> ldepots = new ArrayList<>();
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
	
	public String getCodeDestination() {
		return codeDestination;
	}
	public void setCodeDestination(String codeDestination) {
		this.codeDestination = codeDestination;
	}
	
	public int getCodeBarre() {
		return codeBarre;
	}
	public void setCodeBarre(int codeBarre) {
		this.codeBarre = codeBarre;
	}
	public String getCodeClient() {
		return codeClient;
	}
	public void setCodeClient(String codeClient) {
		this.codeClient = codeClient;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getValeurEstime() {
		return valeurEstime;
	}
	public void setValeurEstime(double valeurEstime) {
		this.valeurEstime = valeurEstime;
	}
	public String getAssurance() {
		return assurance;
	}
	public void setAssurance(String assurance) {
		this.assurance = assurance;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public double getMontantAssurance() {
		return montantAssurance;
	}
	public void setMontantAssurance(double montantAssurance) {
		this.montantAssurance = montantAssurance;
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
	public double getPu() {
		return pu;
	}
	public void setPu(double pu) {
		this.pu = pu;
	}
	
	public List<Ldepot> getLdepots() {
		return ldepots;
	}
	public void setLdepots(List<Ldepot> ldepots) {
		this.ldepots = ldepots;
	}
	@Override
	public String toString() {
		return "Depot [id=" + id + ", annee=" + annee + ", numero=" + numero + ", dateDepot=" + dateDepot
				 + ", tel=" + tel + ", destinataire=" + destinataire 
				+ ", codeDestination=" + codeDestination + ", codeBarre=" + codeBarre + ", codeClient=" + codeClient
				+ ", article=" + article + ", emailClient=" + emailClient + ", emailDestinataire=" + emailDestinataire
				+ ", adresse=" + adresse + ", valeurEstime=" + valeurEstime + ", assurance=" + assurance + ", montant="
				+ montant + ", montantAssurance=" + montantAssurance + ", total=" + total + ", etat=" + etat + ", pu="
				+ pu  + ", ldepots=" + ldepots + "]";
	}
	public Depot(long id, int annee, int numero, Date dateDepot, String tel, String destinataire,
			 String codeDestination, int codeBarre, String codeClient, String article, String emailClient,
			String emailDestinataire, String adresse, double valeurEstime, String assurance, double montant,
			double montantAssurance, double total, String etat, double pu,	@Valid List<Ldepot> ldepots) {
		super();
		this.id = id;
		this.annee = annee;
		this.numero = numero;
		this.dateDepot = dateDepot;
		this.tel = tel;
		this.destinataire = destinataire;
		this.codeDestination = codeDestination;
		this.codeBarre = codeBarre;
		this.codeClient = codeClient;
		this.article = article;
		this.emailClient = emailClient;
		this.emailDestinataire = emailDestinataire;
		this.adresse = adresse;
		this.valeurEstime = valeurEstime;
		this.assurance = assurance;
		this.montant = montant;
		this.montantAssurance = montantAssurance;
		this.total = total;
		this.etat = etat;
		this.pu = pu;
		this.ldepots = ldepots;
	}
	public Depot() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
