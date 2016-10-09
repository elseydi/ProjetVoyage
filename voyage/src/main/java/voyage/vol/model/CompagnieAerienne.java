package voyage.vol.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class CompagnieAerienne {
	private long id;
	private int version;
	private String nom;
	private List<CompagnieAerienneVol> vols = new ArrayList<CompagnieAerienneVol>();
	
	public CompagnieAerienne() {
		super();
	}
	
	public CompagnieAerienne(String nom) {
		this.nom = nom;
	}
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Version
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	@OneToMany(mappedBy="compagnieAerienne")
	public List<CompagnieAerienneVol> getVols() {
		return vols;
	}

	public void setVols(List<CompagnieAerienneVol> vols) {
		this.vols = vols;
	}
	
	
	
}
