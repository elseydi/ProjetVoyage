package voyage.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Ville {
	
	private long id;
	private String nomVille;
	private List<AeroportVille> aeroports = new ArrayList<AeroportVille>();
	private int version;
	

	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Ville(String nomVille) {
		super();
		this.nomVille = nomVille;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(length = 100, nullable=false)
	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String name) {
		nomVille = name;
	}
	
	@OneToMany(mappedBy = "ville")
	public List<AeroportVille> getAeroports() {
		return aeroports;
	}
	
	@Version
	public int getVersion() {
		return version;
	}



	public void setVersion(int version) {
		this.version = version;
	}



	public void setAeroports(List<AeroportVille> aeroports) {
		this.aeroports = aeroports;
	}
	
	

	
}
