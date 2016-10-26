package voyage.vol.model;

<<<<<<< HEAD
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
=======
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import voyage.model.Reservation;




@Entity
public class Aeroport {

	private long id;
	private String nom;
	private List<AeroportVille> villes = new ArrayList<AeroportVille>();
	private List<Vol> volDeparts = new ArrayList<Vol>();
	private List<Vol> volArrivees = new ArrayList<Vol>();
	private List<Escale> escales = new ArrayList<Escale>();
	

	private int version;
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	
	public Aeroport() {
		super();
	}
<<<<<<< HEAD
=======

>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	
	public Aeroport(String nom) {
		super();
		this.nom = nom;
	}

<<<<<<< HEAD
	@Id
	@GeneratedValue
=======

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public long getId() {
		return id;
	}

<<<<<<< HEAD
=======
	
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
	
=======
	@Column(length = 100, nullable=false)
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public String getNom() {
		return nom;
	}

<<<<<<< HEAD
=======
	
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public void setNom(String nom) {
		this.nom = nom;
	}

<<<<<<< HEAD
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
=======
	@OneToMany(mappedBy = "aeroportArrivee")
	public List<Vol> getVolArrivees() {
		return volArrivees;
	}


	public void setVolArrivees(List<Vol> volArrivees) {
		this.volArrivees = volArrivees;
	}


	@OneToMany(mappedBy = "aeroportDepart")
	public List<Vol> getVolDeparts() {
		return volDeparts;
	}


	public void setVolDeparts(List<Vol> volDeparts) {
		this.volDeparts = volDeparts;
	}


	@OneToMany(mappedBy = "aeroport")
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public List<AeroportVille> getVilles() {
		return villes;
	}

	public void setVilles(List<AeroportVille> villes) {
		this.villes = villes;
	}
<<<<<<< HEAD
	
	
	
=======

	@Version
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
	@OneToMany (mappedBy = "id.aeroport") //IdClass
	public List<Escale> getEscales() {
		return escales;
	}


	public void setEscales(List<Escale> escales) {
		this.escales = escales;
	}
	
	
	// ------- METHODES ---------
	public void addVille(AeroportVille ville){
		villes.add(ville);
	}
	
	public void removeVille(AeroportVille ville){
		villes.remove(ville);
	}
	
	public void addVolDepart(Vol vol){
		volDeparts.add(vol);
	}
	
	public void removeVolDepart(Vol vol){
		volDeparts.remove(vol);
	}
	
	public void addVolArrivee(Vol vol){
		volArrivees.add(vol);
	}
	
	public void removeVolArrivee(Vol vol){
		volArrivees.remove(vol);
	}
	
	public void addEscale(Escale escale){
		escales.add(escale);
	}
	
	public void removeEscale(Escale escale){
		escales.remove(escale);
	}
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
}
