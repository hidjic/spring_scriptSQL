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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends Personne {

	@Id
	@Column(name = "idUser")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "email", nullable = false, length = 250)
	private String email;

	@Column(length = 500)
	private String adresse;

	@Column(length = 5)
	private String codePostal;

	@Column(length = 100)
	private String ville;

	@Column
	private Integer idConseiller;

	@OneToOne
	@PrimaryKeyJoinColumn(name = "compteCourant_id")
	private CompteCourant unCC;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id", referencedColumnName = "idUser")
	private List<CompteEpargne> listCE;

	// CONSTRUCTOR
	public User() {
		super();
	}

	public User(String email, String adresse, String codePostal, String ville, int idConseiller, CompteCourant unCC,
			List<CompteEpargne> listCE) {
		super();
		this.email = email;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.idConseiller = idConseiller;
		this.unCC = unCC;
		this.listCE = listCE;
	}

	public User(Integer id, String email, String adresse, String codePostal, String ville, int idConseiller,
			CompteCourant unCC, List<CompteEpargne> listCE) {
		super();
		this.id = id;
		this.email = email;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.idConseiller = idConseiller;
		this.unCC = unCC;
		this.listCE = listCE;
	}

	// GETTERS AND SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	public CompteCourant getUnCC() {
		return unCC;
	}

	public void setUnCC(CompteCourant unCC) {
		this.unCC = unCC;
	}

	public List<CompteEpargne> getListCE() {
		return listCE;
	}

	public void setListCE(List<CompteEpargne> listCE) {
		this.listCE = listCE;
	}

	// toString
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", adresse=" + adresse + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", idConseiller=" + idConseiller + ", unCC=" + unCC + ", listCE=" + listCE + "]";
	}
}
