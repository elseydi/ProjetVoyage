package voyage.vol.model;

<<<<<<< HEAD
import java.util.*;
import javax.persistence.*;

import voyage.model.Reservation;

@Entity
public class Vol {
	// --------- ATTRIBUTS -------------
	private long id;
	private int version;
=======
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import voyage.model.Reservation;



@Entity
public class Vol {
	
	private Long id;
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	private Date dateDepart;
	private Date dateArrivee;
	private Date heureDepart;
	private Date heureArrivee;
<<<<<<< HEAD
	private Aeroport aeroportDepart;
	private Aeroport aeroportArrivee;
	private List<Escale> escales = new ArrayList<Escale>();
	private List<CompagnieAerienneVol> compagniesAeriennes = new ArrayList<CompagnieAerienneVol>();
	private List<Reservation> reservations = new ArrayList<Reservation>();
	
	// --------- CONSTRUCTEURS -------------
			
	public Vol() {
		super();
	}
	
	public Vol(Date dateDepart, Date dateArrivee, Date heureDepart, Date heureArrivee) {
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.heureDepart = heureDepart;
		this.heureArrivee = heureArrivee;
	}
	
	public Vol(Date dateDepart, Date dateArrivee, Date heureDepart, Date heureArrivee, Aeroport aeroportDepart,
			Aeroport aeroportArrivee) {
		this(dateDepart, dateArrivee, heureDepart, heureArrivee);
		this.aeroportDepart = aeroportDepart;
		this.aeroportArrivee = aeroportArrivee;
	}


	// --------- GETTERS & SETTERS -------------
	
	@Id
	@GeneratedValue
	public long getId() {
=======
	private int version;
	private Aeroport aeroportDepart;
	private Aeroport aeroportArrivee;
	private List<Escale> escales = new ArrayList<Escale>();
	private List<Reservation> reservations = new ArrayList<Reservation>();
	private List<CompagnieAerienneVol> compagniesAeriennes = new ArrayList<CompagnieAerienneVol>();
	public Vol() {
		super();
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
		return id;
	}


<<<<<<< HEAD
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
	
=======
	public void setId(Long id) {
		this.id = id;
	}
	

	@ManyToOne
	@JoinColumn(name = "aeroport_arrivee_id", nullable=false)
	public Aeroport getAeroportArrivee() {
		return aeroportArrivee;
	}


	public void setAeroportArrivee(Aeroport aeroportArrivee) {
		this.aeroportArrivee = aeroportArrivee;
	}

	@ManyToOne
	@JoinColumn(name = "aeroport_depart_id", nullable=false)
	public Aeroport getAeroportDepart() {
		return aeroportDepart;
	}


	public void setAeroportDepart(Aeroport aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="date_depart", nullable=false)
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public Date getDateDepart() {
		return dateDepart;
	}


	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}


<<<<<<< HEAD
=======
	@Temporal(TemporalType.DATE)
	@Column(name="date_arrivee", nullable=false)
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public Date getDateArrivee() {
		return dateArrivee;
	}


	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
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
	public Aeroport getAeroportDepart() {
		return aeroportDepart;
	}


	public void setAeroportDepart(Aeroport aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}

	@OneToOne
	public Aeroport getAeroportArrivee() {
		return aeroportArrivee;
	}


	public void setAeroportArrivee(Aeroport aeroportArrivee) {
		this.aeroportArrivee = aeroportArrivee;
	}

	@OneToMany(mappedBy="vol")
=======

	@Version
	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	@OneToMany (fetch = FetchType.EAGER, mappedBy = "id.vol") // IdClass
	// Embedded Id
//	@JoinColumns({ @JoinColumn(referencedColumnName = "vol", name = "escale_vol"),
//		@JoinColumn(referencedColumnName = "aeroport", name = "escale_aeroport") }) 
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	public List<Escale> getEscales() {
		return escales;
	}


	public void setEscales(List<Escale> escales) {
		this.escales = escales;
	}
<<<<<<< HEAD

	@OneToMany(mappedBy="vol")
	public List<CompagnieAerienneVol> getCompagniesAeriennesVols() {
=======
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "vol")
	public List<Reservation> getReservations() {
		return reservations;
	}


	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy="vol")
	public List<CompagnieAerienneVol> getCompagniesAeriennes() {
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
		return compagniesAeriennes;
	}


<<<<<<< HEAD
	public void setCompagniesAeriennesVols(List<CompagnieAerienneVol> compagniesAeriennes) {
=======
	public void setCompagniesAeriennes(List<CompagnieAerienneVol> compagniesAeriennes) {
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
		this.compagniesAeriennes = compagniesAeriennes;
	}


<<<<<<< HEAD
	@OneToMany(mappedBy="vol")
	public List<Reservation> getReservations() {
		return reservations;
	}


	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	
	// --------- METHODES -------------
	
	public void addEscale(Escale escale){
		escales.add(escale);
	}
	
	public void removeEscale(Escale escale){
		escales.remove(escale);
=======
	// -------- METHODES ------------
	public void addEscale(Escale escale) {
		this.escales.add(escale);
	}

	public void removeEscale(Escale escale) {
		this.escales.remove(escale);
	}
	
	public void addReservation(Reservation reservation){
		reservations.add(reservation);
	}
	
	public void removeReservation(Reservation reservation){
		reservations.remove(reservation);
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	}
	
}
