package com.projet.pfe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "direction",
uniqueConstraints = { 
		@UniqueConstraint(columnNames = "code"
				+ ""),
		 
	})
public class Direction {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	@NotBlank
	@Size(max = 40)
	  private String code;
	  private String libelle;
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
	@Override
	public String toString() {
		return "Direction [id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
	}
	public Direction(long id, @NotBlank @Size(max = 40) String code, String libelle) {
		super();
		this.id = id;
		this.code = code;
		this.libelle = libelle;
	}
	public Direction() {
		super();
		// TODO Auto-generated constructor stub
	}
	  

}
