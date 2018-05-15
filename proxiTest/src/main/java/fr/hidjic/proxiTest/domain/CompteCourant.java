package fr.hidjic.proxiTest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compteCourant")
public class CompteCourant extends Compte {
	
	@Id
	@Column(name = "idCompteCourant")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private Float decouvert;

	// CONSTRUCTOR
	public CompteCourant() {
		super();
	}
	public CompteCourant(Float decouvert) {
		super();
		this.decouvert = decouvert;
	}
	public CompteCourant(Integer id, Float decouvert) {
		super();
		this.id = id;
		this.decouvert = decouvert;
	}

	// GETTER AND SETTER
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Float getDecouvert() {
		return decouvert;
	}
	public void setDecouvert(Float decouvert) {
		this.decouvert = decouvert;
	}

	// toString
	@Override
	public String toString() {
		return "CompteCourant [id=" + id + ", decouvert=" + decouvert + "]";
	}
}
