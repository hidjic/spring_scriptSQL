package fr.test2.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "album")
public class Album {
	
	@Id
	@Column(name = "idAlbum")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nameAlbum", nullable = false, length = 250)
	private String name;
	
	// CONSTRUCTOR
	public Album() {
		super();
	}
	public Album(String name) {
		super();
		this.name = name;
	}
	public Album(Integer id, String name) {
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
		return "Album [id=" + id + ", name=" + name + "]";
	}
}
