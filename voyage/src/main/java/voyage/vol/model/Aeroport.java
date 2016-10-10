package voyage.vol.model;

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
		// TODO Auto-generated constructor stub
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

	@Column(length = 100)
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
	
	
	@OneToMany(mappedBy = "aeroport")
	public List<Escale> getEscales() {
		return escales;
	}


	public void setEscales(List<Escale> escales) {
		this.escales = escales;
	}
	
}