package fr.test2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCountry")
	private Integer id;
	
	@Column(name = "nameCountry")
	private String name;
	
	// CONSTRUCOR
	public Country() {
		super();
	}
	public Country(String name) {
		super();
		this.name = name;
	}
	public Country(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	// GETTERS AND SETTERS
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// toString
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + "]";
	}	
}
