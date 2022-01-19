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
@Table(name = "livraison")
public class Livraison {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private int annee;
	  private int numero;
	  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	  private Date dateLivraison;
	  private String agent;
	  private String Engin;
	  private String observation;
	  private int nbrColis;
	  @JsonManagedReference
	  @JsonIgnore
	  @OneToMany(mappedBy = "livraison", fetch=FetchType.EAGER)
  @Valid
	  private List<Llivraison> llivraisons = new ArrayList<>();
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
	public Date getDateLivraison() {
		return dateLivraison;
	}
	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getEngin() {
		return Engin;
	}
	public void setEngin(String engin) {
		Engin = engin;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public List<Llivraison> getLlivraisons() {
		return llivraisons;
	}
	public void setLlivraisons(List<Llivraison> llivraisons) {
		this.llivraisons = llivraisons;
	}
	
	public int getNbrColis() {
		return nbrColis;
	}
	public void setNbrColis(int nbrColis) {
		this.nbrColis = nbrColis;
	}
	@Override
	public String toString() {
		return "Livraison [id=" + id + ", annee=" + annee + ", numero=" + numero + ", dateLivraison=" + dateLivraison
				+ ", agent=" + agent + ", Engin=" + Engin + ", observation=" + observation + ", nbrColis=" + nbrColis
				+ ", llivraisons=" + llivraisons + "]";
	}
	
	public Livraison(long id, int annee, int numero, Date dateLivraison, String agent, String engin, String observation,
			int nbrColis, @Valid List<Llivraison> llivraisons) {
		super();
		this.id = id;
		this.annee = annee;
		this.numero = numero;
		this.dateLivraison = dateLivraison;
		this.agent = agent;
		Engin = engin;
		this.observation = observation;
		this.nbrColis = nbrColis;
		this.llivraisons = llivraisons;
	}
	public Livraison() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
