package voyage.vol.model;

import java.util.*;
import javax.persistence.*;

@Entity
public class Ville {
	private long id;
	private int version;
	private String nom;
	private List<AeroportVille> aeroports = new ArrayList<AeroportVille>();
	
	public Ville() {
		super();
	}
	public Ville(String nom) {
		super();
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
	
	@OneToMany(mappedBy="ville")
	public List<AeroportVille> getAeroports() {
		return aeroports;
	}
	public void setAeroports(List<AeroportVille> aeroports) {
		this.aeroports = aeroports;
	}
	
	
	
}
