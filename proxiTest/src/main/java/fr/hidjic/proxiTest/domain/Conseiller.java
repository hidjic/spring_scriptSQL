package fr.hidjic.proxiTest.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "conseiller")
public class Conseiller extends Personne{
	
	@Id
	@Column(name = "idConseiller")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String login;
	
	@Column
	private String pwd;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "conseiller_id", referencedColumnName = "idConseiller")
	private List<User> listU;
	
	// CONSTRUCTOR
	public Conseiller() {
		super();
	}
	public Conseiller(String login, String pwd, List<User> listU) {
		super();
		this.login = login;
		this.pwd = pwd;
		this.listU = listU;
	}
	public Conseiller(Integer id, String login, String pwd, List<User> listU) {
		super();
		this.id = id;
		this.login = login;
		this.pwd = pwd;
		this.listU = listU;
	}
	
	// GETTERS AND SETTERS
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public List<User> getListU() {
		return listU;
	}
	public void setListU(List<User> listU) {
		this.listU = listU;
	}
	
	// toString
	@Override
	public String toString() {
		return "Conseiller [id=" + id + ", login=" + login + ", pwd=" + pwd + ", listU=" + listU + "]";
	}	
}
