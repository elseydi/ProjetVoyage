package voyage.vol.model;

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
	private String nomAeroport;
	private List<AeroportVille> villes = new ArrayList<AeroportVille>();
	private List<Vol> voldeparts = new ArrayList<Vol>();
	private List<Vol> volarrivees = new ArrayList<Vol>();
	private List<Escale> escales = new ArrayList<Escale>();
	

	private int version;
	
	public Aeroport() {
		super();
	}

	
	public Aeroport(String nomAeroport) {
		super();
		this.nomAeroport = nomAeroport;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	
	public void setId(long id) {
		this.id = id;
	}

	@Column(length = 100, nullable=false)
	public String getNomAeroport() {
		return nomAeroport;
	}

	
	public void setNomAeroport(String nomAeroport) {
		this.nomAeroport = nomAeroport;
	}

	@OneToMany(mappedBy = "aeroportArrivee")
	public List<Vol> getVolarrivees() {
		return volarrivees;
	}


	public void setVolarrivees(List<Vol> volarrivees) {
		this.volarrivees = volarrivees;
	}


	@OneToMany(mappedBy = "aeroportDepart")
	public List<Vol> getVoldeparts() {
		return voldeparts;
	}


	public void setVoldeparts(List<Vol> voldeparts) {
		this.voldeparts = voldeparts;
	}


	@OneToMany(mappedBy = "aeroport")
	public List<AeroportVille> getVilles() {
		return villes;
	}

	public void setVilles(List<AeroportVille> villes) {
		this.villes = villes;
	}

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
		voldeparts.add(vol);
	}
	
	public void removeVolDepart(Vol vol){
		voldeparts.remove(vol);
	}
	
	public void addVolArrivee(Vol vol){
		volarrivees.add(vol);
	}
	
	public void removeVolArrivee(Vol vol){
		volarrivees.remove(vol);
	}
	
	public void addEscale(Escale escale){
		escales.add(escale);
	}
	
	public void removeEscale(Escale escale){
		escales.remove(escale);
	}
}
