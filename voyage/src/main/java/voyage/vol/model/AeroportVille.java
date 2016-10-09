package voyage.vol.model;

import javax.persistence.*;

@Entity
public class AeroportVille {
	private long id;
	private int version;
	private Aeroport aeroport;
	private Ville ville;
	
	public AeroportVille() {
		super();
	}
	
	
	public AeroportVille(Aeroport aeroport, Ville ville) {
		super();
		this.aeroport = aeroport;
		this.ville = ville;
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
	
	@ManyToOne
	public Aeroport getAeroport() {
		return aeroport;
	}
	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}
	
	@ManyToOne
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	
}
