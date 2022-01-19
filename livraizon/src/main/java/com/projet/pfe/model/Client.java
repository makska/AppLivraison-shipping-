package com.projet.pfe.model;
import javax.persistence.Entity;
import javax.persistence.UniqueConstraint;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "client"
)
public class Client {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	  private String code;
	  private String libelle;
	  private String adresse;
	  private String tel;
	  private String email;
	  private String login;
	  private String pwd;
	  private String fileName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Client(long id, String code, String libelle, String adresse, String tel, String email, String login,
			String pwd, String fileName) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
		this.login = login;
		this.pwd = pwd;
		this.fileName = fileName;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", code=" + code + ", libelle=" + libelle + ", adresse=" + adresse + ", tel=" + tel
				+ ", email=" + email + ", login=" + login + ", pwd=" + pwd + ", fileName=" + fileName + "]";
	}
	
}
