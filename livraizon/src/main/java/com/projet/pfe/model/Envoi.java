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
@Table(name = "envoi")
public class Envoi {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private int annee;
	  private int numero;
	  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	  private Date dateEnvoi;
	  private String agent;
	  private String numvol;
	  private String observation;
	  private int nbrColis;
	  @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="GMT")
	  private Date datevol;
	  @JsonManagedReference
	  @JsonIgnore
	  @OneToMany(mappedBy = "envoi", fetch=FetchType.EAGER)
  @Valid
	  private List<Lenvoi> lenvois = new ArrayList<>();
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
	public Date getDateEnvoi() {
		return dateEnvoi;
	}
	public void setDateEnvoi(Date dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getNumvol() {
		return numvol;
	}
	public void setNumvol(String numvol) {
		this.numvol = numvol;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public int getNbrColis() {
		return nbrColis;
	}
	public void setNbrColis(int nbrColis) {
		this.nbrColis = nbrColis;
	}
	public Date getDatevol() {
		return datevol;
	}
	public void setDatevol(Date datevol) {
		this.datevol = datevol;
	}
	public List<Lenvoi> getLenvois() {
		return lenvois;
	}
	public void setLenvois(List<Lenvoi> lenvois) {
		this.lenvois = lenvois;
	}
	@Override
	public String toString() {
		return "Envoi [id=" + id + ", annee=" + annee + ", numero=" + numero + ", dateEnvoi=" + dateEnvoi + ", agent="
				+ agent + ", numvol=" + numvol + ", observation=" + observation + ", nbrColis=" + nbrColis
				+ ", datevol=" + datevol + "]";
	}
	public Envoi(long id, int annee, int numero, Date dateEnvoi, String agent, String numvol, String observation,
			int nbrColis, Date datevol, @Valid List<Lenvoi> lenvois) {
		super();
		this.id = id;
		this.annee = annee;
		this.numero = numero;
		this.dateEnvoi = dateEnvoi;
		this.agent = agent;
		this.numvol = numvol;
		this.observation = observation;
		this.nbrColis = nbrColis;
		this.datevol = datevol;
		this.lenvois = lenvois;
	}
	public Envoi() {
		super();
	}
	  
}
