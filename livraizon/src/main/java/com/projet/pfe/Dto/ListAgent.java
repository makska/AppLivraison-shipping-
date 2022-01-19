package com.projet.pfe.Dto;

public class ListAgent {
	
	  private String mat;
	  private String nom;
	  private String cgrade;
	  private String cagence;
	  private String cdir;
	  private String libdir;
	  private String libagence;
	  private String libgrade;
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCgrade() {
		return cgrade;
	}
	public void setCgrade(String cgrade) {
		this.cgrade = cgrade;
	}
	public String getCagence() {
		return cagence;
	}
	public void setCagence(String cagence) {
		this.cagence = cagence;
	}
	public String getCdir() {
		return cdir;
	}
	public void setCdir(String cdir) {
		this.cdir = cdir;
	}
	public String getLibdir() {
		return libdir;
	}
	public void setLibdir(String libdir) {
		this.libdir = libdir;
	}
	public String getLibagence() {
		return libagence;
	}
	public void setLibagence(String libagence) {
		this.libagence = libagence;
	}
	public String getLibgrade() {
		return libgrade;
	}
	public void setLibgrade(String libgrade) {
		this.libgrade = libgrade;
	}
	public ListAgent(String mat, String nom, String cgrade, String cagence, String cdir, String libdir,
			String libagence, String libgrade) {
		super();
		this.mat = mat;
		this.nom = nom;
		this.cgrade = cgrade;
		this.cagence = cagence;
		this.cdir = cdir;
		this.libdir = libdir;
		this.libagence = libagence;
		this.libgrade = libgrade;
	}
	public ListAgent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ListAgent [mat=" + mat + ", nom=" + nom + ", cgrade=" + cgrade + ", cagence=" + cagence + ", cdir="
				+ cdir + ", libdir=" + libdir + ", libagence=" + libagence + ", libgrade=" + libgrade + "]";
	}
	 
	
	
	
	

}
