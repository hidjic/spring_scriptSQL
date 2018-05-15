package fr.hidjic.proxiTest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compteEpargne")
public class CompteEpargne extends Compte {
	
	@Id
	@Column(name = "idCompteCourant")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private Float taux;

	// CONSTRUCTOR
	public CompteEpargne() {
		super();
	}
	public CompteEpargne(Float taux) {
		super();
		this.taux = taux;
	}
	public CompteEpargne(Integer id, Float taux) {
		super();
		this.id = id;
		this.taux = taux;
	}

	// GETTER AND SETTER
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getTaux() {
		return taux;
	}
	public void setTaux(Float taux) {
		this.taux = taux;
	}
	
	// toString
	@Override
	public String toString() {
		return "CompteEpargne [id=" + id + ", taux=" + taux + "]";
	}
}
