package voyage.vol.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
@IdClass(EscaleId.class)
public class Escale  {
	
	//private EscaleId escaleId;
	private int version;
	private Date heureDepartEscale;
	private Date heureArriveeEscale;
	private Vol vol;
	private Aeroport aeroport;
	
	
	public Escale() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
//	@EmbeddedId
//	public EscaleId getEscaleId() {
//		return escaleId;
//	}
//	public void setEscaleId(EscaleId escaleId) {
//		this.escaleId = escaleId;
//	}
	
	@Version
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	@Temporal(TemporalType.TIME)
	public Date getHeureDepartEscale() {
		return heureDepartEscale;
	}
	public void setHeureDepartEscale(Date heureDepartEscale) {
		this.heureDepartEscale = heureDepartEscale;
	}
	
	@Temporal(TemporalType.TIME)
	public Date getHeureArriveeEscale() {
		return heureArriveeEscale;
	}
	public void setHeureArriveeEscale(Date heureArriveeEscale) {
		this.heureArriveeEscale = heureArriveeEscale;
	}

	@Id
	@ManyToOne
	@JoinColumn(name = "Vol_id")
	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	@Id
	@ManyToOne
	@JoinColumn(name = "Aeroport_id")
	public Aeroport getAeroport() {
		return aeroport;
	}

	
	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}
	
	
	
	
	
	
	

}
