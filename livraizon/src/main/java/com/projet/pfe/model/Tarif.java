package com.projet.pfe.model;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "tarif")
public class Tarif {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
	 private String code;
	 private String codedes;
	 private String typecourrier;
	 
	 @JsonManagedReference
	  @JsonIgnore
	  @OneToMany(mappedBy = "tarif", fetch=FetchType.EAGER)
   @Valid
	  private List<Ltarif> ltarifs = new ArrayList<>();

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

	public String getCodedes() {
		return codedes;
	}

	public void setCodedes(String codedes) {
		this.codedes = codedes;
	}

	public String getTypecourrier() {
		return typecourrier;
	}

	public void setTypecourrier(String typecourrier) {
		this.typecourrier = typecourrier;
	}

	public List<Ltarif> getLtarifs() {
		return ltarifs;
	}

	public void setLtarifs(List<Ltarif> ltarifs) {
		this.ltarifs = ltarifs;
	}

	@Override
	public String toString() {
		return "Tarif [id=" + id + ", code=" + code + ", codedes=" + codedes + ", typecourrier=" + typecourrier
				+ ", ltarifs=" + ltarifs + "]";
	}

	public Tarif(long id, String code, String codedes, String typecourrier, @Valid List<Ltarif> ltarifs) {
		super();
		this.id = id;
		this.code = code;
		this.codedes = codedes;
		this.typecourrier = typecourrier;
		this.ltarifs = ltarifs;
	}

	public Tarif() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
