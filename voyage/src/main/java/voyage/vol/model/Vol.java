package voyage.vol.model;

import java.util.*;
import javax.persistence.*;

import voyage.model.Reservation;

@Entity
public class Vol {
	// --------- ATTRIBUTS -------------
	private long id;
	private int version;
	private Date dateDepart;
	private Date dateArrivee;
	private Date heureDepart;
	private Date heureArrivee;
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
	
	public Date getDateDepart() {
		return dateDepart;
	}


	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}


	public Date getDateArrivee() {
		return dateArrivee;
	}


	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}


	public Date getHeureDepart() {
		return heureDepart;
	}


	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}


	public Date getHeureArrivee() {
		return heureArrivee;
	}


	public void setHeureArrivee(Date heureArrivee) {
		this.heureArrivee = heureArrivee;
	}

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
	public List<Escale> getEscales() {
		return escales;
	}


	public void setEscales(List<Escale> escales) {
		this.escales = escales;
	}

	@OneToMany(mappedBy="vol")
	public List<CompagnieAerienneVol> getCompagniesAeriennesVols() {
		return compagniesAeriennes;
	}


	public void setCompagniesAeriennesVols(List<CompagnieAerienneVol> compagniesAeriennes) {
		this.compagniesAeriennes = compagniesAeriennes;
	}


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
	}
	
}
