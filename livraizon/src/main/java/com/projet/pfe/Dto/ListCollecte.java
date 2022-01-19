package com.projet.pfe.Dto;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
public class ListCollecte {
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
	  private String nomAgent;
	  private String tel;
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
	public String getNomAgent() {
		return nomAgent;
	}
	public void setNomAgent(String nomAgent) {
		this.nomAgent = nomAgent;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public ListCollecte(long id, int numero, String codeDestination, String codeClient, String libDestination,
			String libClient, double total, Date dateCollecte, String matAgent, String nomAgent, String tel) {
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
		this.nomAgent = nomAgent;
		this.tel = tel;
	}
	
	
}
