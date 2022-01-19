package com.projet.pfe.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name = "lcollecte")
public class Lcollecte {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	  private int annee;
	  private int num;
	  private int numero;
 
	  private double poids;
	
	  private double montant;
	  private String typeCourrier;
	  private String designation;
	  private double montantAssurence;
	  @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	  @JsonBackReference
	  private Collecte collecte;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
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
	public String getTypeCourrier() {
		return typeCourrier;
	}
	public void setTypeCourrier(String typeCourrier) {
		this.typeCourrier = typeCourrier;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getMontantAssurence() {
		return montantAssurence;
	}
	public void setMontantAssurence(double montantAssurence) {
		this.montantAssurence = montantAssurence;
	}
	public Collecte getCollecte() {
		return collecte;
	}
	public void setCollecte(Collecte collecte) {
		this.collecte = collecte;
	}
	@Override
	public String toString() {
		return "Lcollecte [id=" + id + ", annee=" + annee + ", num=" + num + ", numero=" + numero + ", poids=" + poids
				+ ", montant=" + montant + ", typeCourrier=" + typeCourrier + ", designation=" + designation
				+ ", montantAssurence=" + montantAssurence + ", collecte=" + collecte + "]";
	}
	public Lcollecte(long id, int annee, int num, int numero, double poids, double montant, String typeCourrier,
			String designation, double montantAssurence, Collecte collecte) {
		super();
		this.id = id;
		this.annee = annee;
		this.num = num;
		this.numero = numero;
		this.poids = poids;
		this.montant = montant;
		this.typeCourrier = typeCourrier;
		this.designation = designation;
		this.montantAssurence = montantAssurence;
		this.collecte = collecte;
	}
	public Lcollecte() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
