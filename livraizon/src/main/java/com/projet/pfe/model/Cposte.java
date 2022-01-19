package com.projet.pfe.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cposte")
public class Cposte {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
		private int annee;
		private int numcollecte;
		private int numdepot;
		private double tarifCollecte;
		private int numreg;
		private int numfact;
		private int numenvoi;
		private int numliv;
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
		public int getNumcollecte() {
			return numcollecte;
		}
		public void setNumcollecte(int numcollecte) {
			this.numcollecte = numcollecte;
		}
		public int getNumdepot() {
			return numdepot;
		}
		public void setNumdepot(int numdepot) {
			this.numdepot = numdepot;
		}
		public double getTarifCollecte() {
			return tarifCollecte;
		}
		public void setTarifCollecte(double tarifCollecte) {
			this.tarifCollecte = tarifCollecte;
		}
		public int getNumreg() {
			return numreg;
		}
		public void setNumreg(int numreg) {
			this.numreg = numreg;
		}
		public int getNumfact() {
			return numfact;
		}
		public void setNumfact(int numfact) {
			this.numfact = numfact;
		}
		public int getNumenvoi() {
			return numenvoi;
		}
		public void setNumenvoi(int numenvoi) {
			this.numenvoi = numenvoi;
		}
		public int getNumliv() {
			return numliv;
		}
		public void setNumliv(int numliv) {
			this.numliv = numliv;
		}
		public Cposte(long id, int annee, int numcollecte, int numdepot, double tarifCollecte, int numreg, int numfact,
				int numenvoi, int numliv) {
			super();
			this.id = id;
			this.annee = annee;
			this.numcollecte = numcollecte;
			this.numdepot = numdepot;
			this.tarifCollecte = tarifCollecte;
			this.numreg = numreg;
			this.numfact = numfact;
			this.numenvoi = numenvoi;
			this.numliv = numliv;
		}
		public Cposte() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Cposte [id=" + id + ", annee=" + annee + ", numcollecte=" + numcollecte + ", numdepot=" + numdepot
					+ ", tarifCollecte=" + tarifCollecte + ", numreg=" + numreg + ", numfact=" + numfact + ", numenvoi="
					+ numenvoi + ", numliv=" + numliv + "]";
		}
		
		
}
