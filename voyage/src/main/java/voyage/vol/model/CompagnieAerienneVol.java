package voyage.vol.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;




@Entity
@Table(name = "compagnie_aerienne_vol")
@IdClass(CompagnieAerienneVolId.class)
public class CompagnieAerienneVol {
	
	private CompagnieAerienne compagnieAerienne;
	private Vol vol;
	private String numero;
	private int version;
	
	
	public CompagnieAerienneVol() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Id
	@ManyToOne
	@JoinColumn(name = "compagnie_aerienne_id")
	public CompagnieAerienne getCompagnieAerienne() {
		return compagnieAerienne;
	}

	public void setCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
		this.compagnieAerienne = compagnieAerienne;
	}

	@Id
	@ManyToOne
	@JoinColumn(name = "vol_id")
	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	@JoinColumn(nullable=false)
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Version
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
	
	

}