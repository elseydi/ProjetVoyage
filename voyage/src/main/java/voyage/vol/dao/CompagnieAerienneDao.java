package voyage.vol.dao;

<<<<<<< HEAD
import voyage.dao.Dao;
import voyage.vol.model.CompagnieAerienne;

public interface CompagnieAerienneDao extends Dao<CompagnieAerienne, Long> {

=======
import java.util.List;



import voyage.vol.model.CompagnieAerienne;


public interface CompagnieAerienneDao extends Dao <CompagnieAerienne, Long>{

	List<CompagnieAerienne> findAllByName(String name);
	
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
}
