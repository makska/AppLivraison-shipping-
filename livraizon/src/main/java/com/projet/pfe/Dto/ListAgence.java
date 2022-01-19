package com.projet.pfe.Dto;

public class ListAgence {
	private String code;
	  private String codedir;
	  private String libdir;
	  private String libelle;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodedir() {
		return codedir;
	}
	public void setCodedir(String codedir) {
		this.codedir = codedir;
	}
	public String getLibdir() {
		return libdir;
	}
	public void setLibdir(String libdir) {
		this.libdir = libdir;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public ListAgence(String code, String codedir, String libdir, String libelle) {
		super();
		this.code = code;
		this.codedir = codedir;
		this.libdir = libdir;
		this.libelle = libelle;
	}
	
	  

}
