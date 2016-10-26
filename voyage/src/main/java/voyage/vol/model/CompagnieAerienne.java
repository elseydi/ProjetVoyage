package voyage.vol.model;

<<<<<<< HEAD
import javax.persistence.*;
import java.util.*;

@Entity
public class CompagnieAerienne {
	private long id;
	private int version;
=======
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="compagnie_aerienne")
public class CompagnieAerienne {

	private long id;
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	private String nom;
	private List<CompagnieAerienneVol> vols = new ArrayList<CompagnieAerienneVol>();
	
	public CompagnieAerienne() {
		super();
	}
<<<<<<< HEAD
	
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
=======

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(length=100, nullable = false)
	public String getNom() {
		return nom;
	}

>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public void setNom(String nom) {
		this.nom = nom;
	}

<<<<<<< HEAD
	@OneToMany(mappedBy="compagnieAerienne")
=======
	@OneToMany(mappedBy = "compagnieAerienne")
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public List<CompagnieAerienneVol> getVols() {
		return vols;
	}

	public void setVols(List<CompagnieAerienneVol> vols) {
		this.vols = vols;
	}
	
	
<<<<<<< HEAD
=======
	public void addVol(CompagnieAerienneVol vol){
		vols.add(vol);
	}
	
	public void removeVol(CompagnieAerienneVol vol){
		vols.remove(vol);
	}
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	
}
