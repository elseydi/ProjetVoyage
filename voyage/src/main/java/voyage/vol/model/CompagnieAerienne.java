package voyage.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CompagnieAerienne {

	private long idCompagnieArienne;
	private String nom;
	private List<CompagnieAerienneVol> compagnieAerienneVols = new ArrayList<CompagnieAerienneVol>();
	
	public CompagnieAerienne() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getIdCompagnieArienne() {
		return idCompagnieArienne;
	}

	public void setIdCompagnieArienne(long idCompagnieArienne) {
		this.idCompagnieArienne = idCompagnieArienne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@OneToMany(mappedBy = "compagnieAerienne")
	public List<CompagnieAerienneVol> getCompagnieAerienneVols() {
		return compagnieAerienneVols;
	}

	public void setCompagnieAerienneVols(List<CompagnieAerienneVol> compagnieAerienneVols) {
		this.compagnieAerienneVols = compagnieAerienneVols;
	}
	
	
	
	
	
}
