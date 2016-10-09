package voyage.vol.model;

import java.util.*;
import javax.persistence.*;

@Entity
public class Aeroport {
	private long id;
	private int version;
	private String nom;
	private List<Vol> volsDepart = new ArrayList<Vol>();
	private List<Vol> volsArrives = new ArrayList<Vol>();
	private List<AeroportVille> villes = new ArrayList<AeroportVille>();
	
	public Aeroport() {
		super();
	}
	
	public Aeroport(String nom) {
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

	@OneToMany(mappedBy="aeroportDepart")
	public List<Vol> getVolsDepart() {
		return volsDepart;
	}

	public void setVolsDepart(List<Vol> volsDepart) {
		this.volsDepart = volsDepart;
	}

	@OneToMany(mappedBy="aeroportArrivee")
	public List<Vol> getVolsArrives() {
		return volsArrives;
	}

	public void setVolsArrives(List<Vol> volsArrives) {
		this.volsArrives = volsArrives;
	}

	@OneToMany(mappedBy="aeroport")
	public List<AeroportVille> getVilles() {
		return villes;
	}

	public void setVilles(List<AeroportVille> villes) {
		this.villes = villes;
	}
	
	
	
}
