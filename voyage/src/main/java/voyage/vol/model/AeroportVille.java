package voyage.vol.model;

<<<<<<< HEAD
import javax.persistence.*;

@Entity
public class AeroportVille {
	private long id;
	private int version;
	private Aeroport aeroport;
	private Ville ville;
=======

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;



@Entity
@Table(name = "aeroport_ville")
@IdClass(AeroportVilleId.class)
public class AeroportVille {
	
	private Aeroport aeroport;
	private Ville ville;
	private int version;
	
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	
	public AeroportVille() {
		super();
	}
	
	
<<<<<<< HEAD
=======
	
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public AeroportVille(Aeroport aeroport, Ville ville) {
		super();
		this.aeroport = aeroport;
		this.ville = ville;
	}
<<<<<<< HEAD
	
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
=======



	@Id
	@ManyToOne
	@JoinColumn(name = "aeroport_id")
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public Aeroport getAeroport() {
		return aeroport;
	}
	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}
	
<<<<<<< HEAD
	@ManyToOne
=======
	@Id
	@ManyToOne
	@JoinColumn(name = "ville_id")
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
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
	
	
	

>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
}
