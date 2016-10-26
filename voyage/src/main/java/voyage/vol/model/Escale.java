package voyage.vol.model;

<<<<<<< HEAD
import java.util.Date;
import javax.persistence.*;

@Entity
public class Escale {
	private long id;
	private int version;
	private Date heureDepart;
	private Date heureArrivee;
	private Aeroport aeroport;
	private Vol vol;
=======
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "Escale")
//@IdClass(EscaleId.class)
public class Escale  {
	
	private EscaleId id; //Embedded
	private int version;
	private Date heureDepart;
	private Date heureArrivee;
//	private Vol vol; //IdClass
//	private Aeroport aeroport; //IdClass
	
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	
	public Escale() {
		super();
	}
<<<<<<< HEAD
	public Escale(Date heureDepart, Date heureArrivee, Aeroport aeroport) {
		super();
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
		this.aeroport = aeroport;
	}
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
=======
	
	
	
	@EmbeddedId // Embedded
	public EscaleId getId() {
		return id;
	}
	
	public void setId(EscaleId id) {
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
		this.id = id;
	}
	
	@Version
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
<<<<<<< HEAD
=======
	@Temporal(TemporalType.TIME)
	@Column(name="heure_depart", nullable=false)
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public Date getHeureDepart() {
		return heureDepart;
	}
	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}
<<<<<<< HEAD
=======
	
	@Temporal(TemporalType.TIME)
	@Column(name="heure_arrivee", nullable=false)
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public Date getHeureArrivee() {
		return heureArrivee;
	}
	public void setHeureArrivee(Date heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
<<<<<<< HEAD
	
	@OneToOne
	public Aeroport getAeroport() {
		return aeroport;
	}
	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}
	
	@ManyToOne
	public Vol getVol() {
		return vol;
	}
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	
	
=======

	// Pour l'ID CLASS
//	@Id
//	@ManyToOne
//	@JoinColumn(name = "Vol_id", nullable=false)
//	public Vol getVol() {
//		return vol;
//	}
//
//	public void setVol(Vol vol) {
//		this.vol = vol;
//	}
//
//	@Id
//	@ManyToOne
//	@JoinColumn(name = "Aeroport_id", nullable=false)
//	public Aeroport getAeroport() {
//		return aeroport;
//	}
//
//	
//	public void setAeroport(Aeroport aeroport) {
//		this.aeroport = aeroport;
//	}
	
	
	
	
	
	
	

>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
}
