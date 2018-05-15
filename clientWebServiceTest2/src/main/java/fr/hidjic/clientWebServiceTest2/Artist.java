package fr.hidjic.clientWebServiceTest2;

public class Artist {
	
	private Integer id;
	private String name;
	private Country country;
	
	// CONSTRUCTORS
	public Artist() {
		super();
	}
	public Artist(String name) {
		super();
		this.name = name;
	}
	public Artist(String name, Country country) {
		super();
		this.name = name;
		this.country = country;
	}
	public Artist(Integer id, String name, Country country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
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
	// toString
	@Override
	public String toString() {
		return "Artist [idArtist=" + id + ", nameArtist=" + name + ", country=" + country + "]";
	}
}
