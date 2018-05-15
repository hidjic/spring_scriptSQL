package fr.hidjic.clientWebServiceTest2;

public class Country {
	
	private Integer id;
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
