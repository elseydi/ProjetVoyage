package voyage.vol.model;

<<<<<<< HEAD
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
=======
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Ville {
	
	private long id;
	private String nom;
	private List<AeroportVille> aeroports = new ArrayList<AeroportVille>();
	private int version;
	

	public Ville() {
		super();
	}
	
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public Ville(String nom) {
		super();
		this.nom = nom;
	}
<<<<<<< HEAD
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
=======


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public void setId(long id) {
		this.id = id;
	}
	
<<<<<<< HEAD
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
=======
	@Column(length = 100, nullable=false)
	public String getNom() {
		return nom;
	}
	public void setNom(String name) {
		nom = name;
	}
	
	@OneToMany(mappedBy = "ville")
	public List<AeroportVille> getAeroports() {
		return aeroports;
	}
	
	@Version
	public int getVersion() {
		return version;
	}



	public void setVersion(int version) {
		this.version = version;
	}



>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public void setAeroports(List<AeroportVille> aeroports) {
		this.aeroports = aeroports;
	}
	
	
<<<<<<< HEAD
=======
	// --------- METHODES --------
	public void addAeroport(AeroportVille aeroport){
		aeroports.add(aeroport);
	}

	public void removeAeroport(AeroportVille aeroport){
		aeroports.remove(aeroport);
	}
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	
}
