package voyage.vol.model;

import javax.persistence.*;

@Entity
public class CompagnieAerienneVol {
	private String numero;
	private int version;
	private CompagnieAerienne compagnieAerienne;
	private Vol vol;
	
	
	public CompagnieAerienneVol() {
		super();
	}
	public CompagnieAerienneVol(String numero) {
		this.numero = numero;
	}
	
	public CompagnieAerienneVol(String numero, CompagnieAerienne compagnieAerienne, Vol vol) {
		this.numero = numero;
		this.compagnieAerienne = compagnieAerienne;
		this.vol = vol;
	}
	
	@Id
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
	
	@ManyToOne
	public CompagnieAerienne getCompagnieAerienne() {
		return compagnieAerienne;
	}
	
	public void setCompagnieAerienne(CompagnieAerienne compagnieAerienne) {
		this.compagnieAerienne = compagnieAerienne;
	}
	
	@ManyToOne
	public Vol getVol() {
		return vol;
	}
	
	public void setVol(Vol vol) {
		this.vol = vol;
	}
	
	
}
