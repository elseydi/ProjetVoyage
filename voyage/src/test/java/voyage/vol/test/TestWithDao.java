package voyage.vol.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import voyage.Application;
import voyage.vol.dao.AeroportDao;
import voyage.vol.dao.AeroportDaoJpa;
import voyage.vol.dao.AeroportVilleDao;
import voyage.vol.dao.AeroportVilleDaoJpa;
import voyage.vol.dao.EscaleDao;
import voyage.vol.dao.EscaleDaoJpa;
import voyage.vol.dao.VilleDao;
import voyage.vol.dao.VilleDaoJpa;
import voyage.vol.dao.VolDao;
import voyage.vol.dao.VolDaoJpa;
import voyage.vol.model.Aeroport;
import voyage.vol.model.AeroportVille;
import voyage.vol.model.Escale;
import voyage.vol.model.Ville;
import voyage.vol.model.Vol;

public class TestWithDao {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat heure = new SimpleDateFormat("h:mm a");

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		AeroportDao aeroportDao = new AeroportDaoJpa();
		VilleDao villeDao = new VilleDaoJpa();
		VolDao volDao = new VolDaoJpa();
		EscaleDao escaleDao =new EscaleDaoJpa();
		AeroportVilleDao aeroportVilleDao = new AeroportVilleDaoJpa();
		
		Aeroport aeroportCdg = new Aeroport();
		aeroportCdg.setNomAeroport("Charles de Gaulle");
		aeroportDao.create(aeroportCdg);
		
		aeroportCdg.setNomAeroport("Roissy Charles de Gaulle");
		aeroportCdg = aeroportDao.update(aeroportCdg);
		
		Aeroport aeroportJfk = new Aeroport();
		aeroportJfk.setNomAeroport("New York JFK");
		aeroportDao.create(aeroportJfk);
		
		Aeroport aeroportLax = new Aeroport();
		aeroportLax.setNomAeroport("LAX");
		aeroportDao.create(aeroportLax);
		
		Aeroport aeroportChicago = new Aeroport();
		aeroportChicago.setNomAeroport("Chicago O'Hare");
		aeroportDao.create(aeroportChicago);
		
		Aeroport aeroportOrly = new Aeroport();
		aeroportOrly.setNomAeroport("A�roport d'Orly");
		aeroportDao.create(aeroportOrly);

		
		Ville paris = new Ville();
		paris.setNomVille("paname");
		villeDao.create(paris);

		paris.setNomVille("Paris");
		paris = villeDao.update(paris);
		
		Ville roissy = new Ville();
		roissy.setNomVille("Roissy");
		villeDao.create(roissy);
		
		Ville orly = new Ville();
		orly.setNomVille("Orly");
		villeDao.create(orly);
		
		Ville ny = new Ville();
		ny.setNomVille("New York");
		villeDao.create(ny);
		
		Ville la = new Ville();
		la.setNomVille("Los Angeles");
		villeDao.create(la);
		
		Ville chicago = new Ville();
		chicago.setNomVille("Chicago");
		villeDao.create(chicago);
		
		AeroportVille av1 = new AeroportVille();
		av1.setAeroport(aeroportCdg);
		av1.setVille(roissy);
		aeroportVilleDao.create(av1);
		
		AeroportVille av2 = new AeroportVille();
		av2.setAeroport(aeroportChicago);
		av2.setVille(chicago);
		aeroportVilleDao.create(av2);
		
		AeroportVille av3 = new AeroportVille();
		av3.setAeroport(aeroportCdg);
		av3.setVille(paris);
		aeroportVilleDao.create(av3);
		
		AeroportVille av4 = new AeroportVille();
		av4.setAeroport(aeroportJfk);
		av4.setVille(ny);
		aeroportVilleDao.create(av4);
		
		AeroportVille av5 = new AeroportVille();
		av5.setAeroport(aeroportLax);
		av5.setVille(la);
		aeroportVilleDao.create(av5);
		
		AeroportVille av6 = new AeroportVille();
		av6.setAeroport(aeroportOrly);
		av6.setVille(paris);
		aeroportVilleDao.create(av6);
		
	
		
		
		
		Vol vol1 = new Vol();
		vol1.setAeroportDepart(aeroportCdg);
		vol1.setAeroportArrivee(aeroportLax);
		vol1.setDateDepart(sdf.parse("10/10/2016"));
		vol1.setDateArrivee(sdf.parse("11/10/2016"));
		vol1.setHeureDepart(heure.parse("11:30 PM"));
		vol1.setHeureArrivee(heure.parse("01:30 PM"));
		volDao.create(vol1);
		
		Escale escale1 = new Escale();
		escale1.setAeroport(aeroportJfk);
		escale1.setVol(vol1);
		escale1.setHeureDepartEscale(heure.parse("09:30 AM"));
		escale1.setHeureArriveeEscale(heure.parse("08:30 AM"));
		escaleDao.create(escale1);
		
		Escale escale2 = new Escale();
		escale2.setAeroport(aeroportChicago);
		escale2.setVol(vol1);
		escale2.setHeureDepartEscale(heure.parse("12:30 AM"));
		escale2.setHeureArriveeEscale(heure.parse("11:30 AM"));
		escaleDao.create(escale2);
		
		vol1.addEscale(escale2);
		vol1.addEscale(escale1);
		vol1.setAeroportDepart(aeroportOrly);
		vol1 = volDao.update(vol1);
		
		
		
		
		
		Application.close();
	}

}
