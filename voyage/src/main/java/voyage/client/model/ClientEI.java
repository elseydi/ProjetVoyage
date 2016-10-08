package voyage.client.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="ClientEI")
public class ClientEI extends Client{
	// ------------ ATTRIBUTS -------------
	private TitrePhysique titre;
	private String prenom;
	
	// ------------ CONSTRUCTEURS -------------
	public ClientEI() {
		super();
	}
	
	public ClientEI(String nom, String prenom, String numeroTel, String numeroFax, String email, TitrePhysique titre) {
		super(nom, numeroTel, numeroFax, email);
		this.titre = titre;
		this.prenom = prenom;
	}
	
	// ------------ GETTERS & SETTERS -------------
	public TitrePhysique getTitre() {
		return titre;
	}
	
	public void setTitre(TitrePhysique titre) {
		this.titre = titre;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	// ------------ METHODES -------------
}