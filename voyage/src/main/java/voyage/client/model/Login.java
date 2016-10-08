package voyage.client.model;

import javax.persistence.*;

@Entity
public class Login {
	// ------------ ATTRIBUTS -------------
	private long id;
	private String login;
	private String motDePasse;
	private boolean admin;
	
	
	// ------------ CONSTRUCTEURS -------------
	public Login(){
		super();
	}
	
	public Login(String login, String motDePasse, boolean admin) {
		super();
		this.login = login;
		this.motDePasse = motDePasse;
		this.admin = admin;
	}


	// ------------ GETTERS & SETTERS -------------
	@Id
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getMotDePasse() {
		return motDePasse;
	}


	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}


	public boolean isAdmin() {
		return admin;
	}


	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
	
	
	// ------------ METHODES -------------
}
