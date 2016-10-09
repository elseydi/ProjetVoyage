package voyage.vol.model;

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
	
	public Escale() {
		super();
	}
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
		this.id = id;
	}
	
	@Version
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
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
	
	
}
