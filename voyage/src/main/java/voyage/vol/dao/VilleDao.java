package voyage.vol.dao;

<<<<<<< HEAD
import voyage.dao.Dao;
import voyage.vol.model.Ville;

public interface VilleDao extends Dao<Ville, Long> {

=======
import java.util.List;


import voyage.vol.model.Aeroport;
import voyage.vol.model.Ville;

public interface VilleDao extends Dao <Ville, Long>{

	List<Ville> findAllByName(String name);
	
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
}
