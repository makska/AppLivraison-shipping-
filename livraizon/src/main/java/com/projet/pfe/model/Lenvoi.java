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
@Table(name = "lenvoi")
public class Lenvoi {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int numero;
	 private int num;
	 private String destination;
	 private String adresse;
	 private String tel;
	 private String designation;
	 private int codeBarre;
	 
	@ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	  @JsonBackReference
	  private Envoi envoi;

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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
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

	public Envoi getEnvoi() {
		return envoi;
	}

	public void setEnvoi(Envoi envoi) {
		this.envoi = envoi;
	}

	@Override
	public String toString() {
		return "Lenvoi [id=" + id + ", numero=" + numero + ", num=" + num + ", destination=" + destination
				+ ", adresse=" + adresse + ", tel=" + tel + ", designation=" + designation + ", codeBarre=" + codeBarre
				+ ", envoi=" + envoi + "]";
	}

	public Lenvoi(long id, int numero, int num, String destination, String adresse, String tel, String designation,
			int codeBarre, Envoi envoi) {
		super();
		this.id = id;
		this.numero = numero;
		this.num = num;
		this.destination = destination;
		this.adresse = adresse;
		this.tel = tel;
		this.designation = designation;
		this.codeBarre = codeBarre;
		this.envoi = envoi;
	}

	public Lenvoi() {
		super();
	}
	

}
