package fr.test2.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "artist")
public class Artist {
	
	@Id
	@Column(name = "idArtist")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nameArtist", nullable = false, length = 50)
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "country_id", referencedColumnName = "idCountry")
	private Country country;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "artist_id", referencedColumnName = "idArtist")
	private List<Album> listAlbum;
	
	// CONSTRUCTORS
	public Artist() {
		super();
	}
	public Artist(String name) {
		super();
		this.name = name;
	}
	public Artist(String name, Country country, List<Album> listAlbum) {
		super();
		this.name = name;
		this.country = country;
		this.listAlbum = listAlbum;
	}
	public Artist(Integer id, String name, Country country, List<Album> listAlbum) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.listAlbum = listAlbum;
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
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}	
	public List<Album> getListAlbum() {
		return listAlbum;
	}
	public void setListAlbum(List<Album> listAlbum) {
		this.listAlbum = listAlbum;
	}
	
	// toString
	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + ", country=" + country + ", listAlbum=" + listAlbum + "]";
	}



}
