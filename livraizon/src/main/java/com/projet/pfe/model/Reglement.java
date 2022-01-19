package com.projet.pfe.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name = "reglement")
public class Reglement {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	
	
	private String numCarte;
	private String password;
	private String ccsv;
	private double montant;
	
	public long getId() {
		return id;
	}

	public String getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(String numCarte) {
		this.numCarte = numCarte;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCcsv() {
		return ccsv;
	}

	public void setCcsv(String ccsv) {
		this.ccsv = ccsv;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Reglement(long id, String numCarte, String password, String ccsv, double montant) {
		super();
		this.id = id;
		this.numCarte = numCarte;
		this.password = password;
		this.ccsv = ccsv;
		this.montant = montant;
	}

	public Reglement() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Reglement [id=" + id + ", numCarte=" + numCarte + ", password=" + password + ", ccsv=" + ccsv
				+ ", montant=" + montant + "]";
	}
	
}
