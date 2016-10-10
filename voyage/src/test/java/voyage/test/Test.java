package voyage.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import voyage.Application;
import voyage.client.dao.ClientDao;
import voyage.client.dao.ClientDaoJpa;
import voyage.client.dao.LoginDao;
import voyage.client.dao.LoginDaoJpa;
import voyage.client.dao.PassagerDao;
import voyage.client.dao.PassagerDaoJpa;
import voyage.client.model.Adresse;
import voyage.client.model.Client;
import voyage.client.model.ClientEI;
import voyage.client.model.ClientMoral;
import voyage.client.model.ClientPhysique;
import voyage.client.model.Login;
import voyage.client.model.Passager;
import voyage.client.model.TitreMoral;
import voyage.client.model.TitrePhysique;
import voyage.dao.ReservationDao;
import voyage.dao.ReservationDaoJpa;
import voyage.model.Reservation;
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

public class Test {

	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat heure = new SimpleDateFormat("h:mm a");
	
	public static void main(String[] args) throws ParseException {

		// ------- CLIENT ----------
		ReservationDao reservationDao=new ReservationDaoJpa();
		PassagerDao passagerDao=new PassagerDaoJpa();
		
		Reservation resa1=new Reservation(sdf.parse("08/08/2016"), 15478);
		Reservation resa2=new Reservation(sdf.parse("09/08/2016"), 15479);
		Reservation resa3=new Reservation(sdf.parse("10/08/2016"), 15480);
		Reservation resa4=new Reservation(sdf.parse("11/08/2016"), 15481);
		
		Passager p1=new Passager("Dupond", "Michel");
		Passager p2=new Passager("BIDULE", "chose");
		Passager p3=new Passager("MACHIN", "Truc");
		
		passagerDao.create(p1);
		passagerDao.create(p2);
		passagerDao.create(p3);
		
		p1.setAdresse(new Adresse("1 rue de la paix", "75001", "Paris", "France"));
		p2.setAdresse(new Adresse("1 place de la bourse", "75002", "Paris", "France"));
		p3.setAdresse(new Adresse("1 deux trois soleil", "94000", "Cr�teil", "France"));

		
		p1=passagerDao.update(p1);
		p2=passagerDao.update(p2);
		p3=passagerDao.update(p3);
		
		resa1.setPassager(p1);
		resa2.setPassager(p1);
		resa3.setPassager(p2);
		resa4.setPassager(p1);
		resa4.setPassager(p2);
		resa4.setPassager(p3);
		
		
		// Test Clients
		ClientDao clientDao = new ClientDaoJpa();
		
		Client client1 = new ClientPhysique("MICHELIN", "luc", "0123456789", "015478965", "luc@google.com", TitrePhysique.MR);
		Client client2 = new ClientMoral("MACHIN", "0352698745", "", "machin@lol.fr", TitreMoral.SARL, "12357879848974");
		Client client3 = new ClientEI("TRUC", "jacqueline", "456789465", "7845645", "truc.j@boite.com", TitrePhysique.MLLE);
		clientDao.create(client1);
		clientDao.create(client2);
		clientDao.create(client3);
		
		// Test Logins
		LoginDao logDao = new LoginDaoJpa();
		
		Login log1 = new Login("popol","mdp",false);
		Login log2 = new Login("loul","lel",true);
		
		logDao.create(log1);
		logDao.create(log2);
		
		// Ajouts sur Clients
		client1.setLogin(log1);
//		client1.addReservation(resa1);
//		client1.addReservation(resa4);
		client1.setAdresse(new Adresse("RUE DU MORT", "75666", "Paris", "France"));
		client1 = clientDao.update(client1);
		
		client2.setLogin(log2);
		client2 = clientDao.update(client2);
		
		resa1.setClient(client1);
		resa2.setClient(client2);
		resa3.setClient(client3);
		resa4.setClient(client2);

		// --------- VOL ---------

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
		
		
		resa1.setVol(vol1);
		resa2.setVol(vol1);
		resa3.setVol(vol1);
		resa4.setVol(vol1);
		
		reservationDao.create(resa1);
		reservationDao.create(resa2);
		reservationDao.create(resa3);
		reservationDao.create(resa4);
		
		
		Application.close();
	}

}