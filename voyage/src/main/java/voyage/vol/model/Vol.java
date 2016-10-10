package voyage.vol.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import voyage.model.Reservation;



@Entity
public class Vol {
	
	private int id;
	private Date dateDepart;
	private Date dateArrivee;
	private Date heureDepart;
	private Date heureArrivee;
	private int version;
	private Aeroport aeroportDepart;
	private Aeroport aeroportArrivee;
	private List<Escale> escales = new ArrayList<Escale>();
	private List<Reservation> reservations = new ArrayList<Reservation>();
	
	public Vol() {
		super();
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	
	

	@ManyToOne
	@JoinColumn(name = "id_aeroport_arrivee")
	public Aeroport getAeroportArrivee() {
		return aeroportArrivee;
	}


	public void setAeroportArrivee(Aeroport aeroportArrivee) {
		this.aeroportArrivee = aeroportArrivee;
	}

	@ManyToOne
	@JoinColumn(name = "id_aeroport_depart")
	public Aeroport getAeroportDepart() {
		return aeroportDepart;
	}


	public void setAeroportDepart(Aeroport aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}

	@Temporal(TemporalType.DATE)
	public Date getDateDepart() {
		return dateDepart;
	}


	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	

	


	@Temporal(TemporalType.DATE)
	public Date getDateArrivee() {
		return dateArrivee;
	}


	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}


	@Temporal(TemporalType.TIME)
	public Date getHeureDepart() {
		return heureDepart;
	}


	public void setHeureDepart(Date heureDepart) {
		this.heureDepart = heureDepart;
	}


	@Temporal(TemporalType.TIME)
	public Date getHeureArrivee() {
		return heureArrivee;
	}


	public void setHeureArrivee(Date heureArrivee) {
		this.heureArrivee = heureArrivee;
	}


	@Version
	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	@OneToMany(mappedBy = "vol")
	public List<Escale> getEscales() {
		return escales;
	}


	public void setEscales(List<Escale> escales) {
		this.escales = escales;
	}
	
	
	public void addEscale(Escale escale) {
		this.escales.add(escale);
	}

	public void removeEscale(Escale escale) {
		this.escales.remove(escale);
	}


	@OneToMany(mappedBy = "vol")
	public List<Reservation> getReservations() {
		return reservations;
	}


	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	

	
	
}