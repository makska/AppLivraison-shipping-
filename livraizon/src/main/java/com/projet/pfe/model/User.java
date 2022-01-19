package com.projet.pfe.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "utilisateur",
uniqueConstraints = { 
		@UniqueConstraint(columnNames = "username"
				+ ""),
		@UniqueConstraint(columnNames = "email") 
	})
public class User {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
		  @NotBlank
		@Size(max = 40)
	  private String username;
	  @NotBlank
	  @Size(max = 60)
	  @Email
	  private String email;
	  private String mat;
	  private String nom;
	  private String password;
	  private boolean isActive;
	  private String role;
	  private String fileName;
	  private String code;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public User(long id, @NotBlank @Size(max = 40) String username, @NotBlank @Size(max = 60) @Email String email,
			String mat, String nom, String password, boolean isActive, String role, String fileName, String code) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.mat = mat;
		this.nom = nom;
		this.password = password;
		this.isActive = isActive;
		this.role = role;
		this.fileName = fileName;
		this.code = code;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", mat=" + mat + ", nom=" + nom
				+ ", password=" + password + ", isActive=" + isActive + ", role=" + role + ", fileName=" + fileName
				+ ", code=" + code + "]";
	}
	
	
}
