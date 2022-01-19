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
@Table(name = "ldepot")
public class Ldepot {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	 // private int annee;
	  private int num;
	  private int numero;
   
	  private double poids;
	
	  private double montant;
	  private String typeCourrier;
	  private String designation;
	  private double montantAssurence;
	  @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	  @JsonBackReference
	  private Depot depot;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	/*
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}*/
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
	public Depot getDepot() {
		return depot;
	}
	public void setDepot(Depot depot) {
		this.depot = depot;
	}
	@Override
	public String toString() {
		return "Ldepot [id=" + id +  ", num=" + num + ", numero=" + numero + ", poids=" + poids
				+ ", montant=" + montant + ", typeCourrier=" + typeCourrier + ", designation=" + designation
				+ ", montantAssurence=" + montantAssurence + ", depot=" + depot + "]";
	}
	public Ldepot(long id,int num, int numero, double poids, double montant, String typeCourrier,
			String designation, double montantAssurence, Depot depot) {
		super();
		this.id = id;
		
		this.num = num;
		this.numero = numero;
		this.poids = poids;
		this.montant = montant;
		this.typeCourrier = typeCourrier;
		this.designation = designation;
		this.montantAssurence = montantAssurence;
		this.depot = depot;
	}
	public Ldepot() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	  
	
}
