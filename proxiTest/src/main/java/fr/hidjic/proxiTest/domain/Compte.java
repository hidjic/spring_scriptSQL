package fr.hidjic.proxiTest.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Compte {
	
	@Column
	private String numCompte;
	
	@Column
	private Float solde;
	
	@Column
	private String dateCreation;
	
	@Column(columnDefinition = "boolean default false")
	private Integer isActive;
	
	// CONSTRUCTOR
	public Compte() {
		super();
	}
	public Compte(String numCompte, Float solde, String dateCreation, Integer isActive) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.isActive = isActive;
	}
	
	// GETTERS AND SETTERS
	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	public Float getSolde() {
		return solde;
	}
	public void setSolde(Float solde) {
		this.solde = solde;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Integer getIsActive() {
		return isActive;
	}
	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}
	
	// toString
	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", solde=" + solde + ", dateCreation=" + dateCreation
				+ ", isActive=" + isActive + "]";
	}
}
