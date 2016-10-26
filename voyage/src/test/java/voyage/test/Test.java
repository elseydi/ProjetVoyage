package voyage.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
<<<<<<< HEAD

import voyage.*;
import voyage.model.*;
import voyage.dao.*;
import voyage.client.model.*;
import voyage.client.dao.*;
import voyage.vol.model.*;
import voyage.vol.dao.*;


public class Test {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");

	public static void main(String[] args) throws ParseException {
		// -------- CLIENT -------------
		
		ReservationDao reservationDao=new ReservationDaoJpa();
		PassagerDao passagerDao=new PassagerDaoJpa();
		
		Reservation resa1=new Reservation(sdf.parse("08/08/2016"), 15478);
		Reservation resa2=new Reservation(sdf.parse("09/08/2016"), 15479);
		Reservation resa3=new Reservation(sdf.parse("10/08/2016"), 15480);
		Reservation resa4=new Reservation(sdf.parse("11/08/2016"), 15481);
=======
import java.util.Date;

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
import voyage.vol.dao.CompagnieAerienneDao;
import voyage.vol.dao.CompagnieAerienneDaoJpa;
import voyage.vol.dao.CompagnieAerienneVolDao;
import voyage.vol.dao.CompagnieAerienneVolDaoJpa;
import voyage.vol.dao.EscaleDao;
import voyage.vol.dao.EscaleDaoJpa;
import voyage.vol.dao.VilleDao;
import voyage.vol.dao.VilleDaoJpa;
import voyage.vol.dao.VolDao;
import voyage.vol.dao.VolDaoJpa;
import voyage.vol.model.Aeroport;
import voyage.vol.model.AeroportVille;
import voyage.vol.model.CompagnieAerienne;
import voyage.vol.model.CompagnieAerienneVol;
import voyage.vol.model.Escale;
import voyage.vol.model.EscaleId;
import voyage.vol.model.Ville;
import voyage.vol.model.Vol;

public class Test {

	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat heure = new SimpleDateFormat("h:mm a");
	
	public static void main(String[] args) throws ParseException {

		// ------- CLIENT ----------
		ReservationDao reservationDao=new ReservationDaoJpa();
		PassagerDao passagerDao=new PassagerDaoJpa();
		
		Reservation resa1=new Reservation(new Date(), 15478);
		Reservation resa2=new Reservation(new Date(), 15479);
		Reservation resa3=new Reservation(new Date(), 15480);
		Reservation resa4=new Reservation(new Date(), 15481);
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
		
		Passager p1=new Passager("Dupond", "Michel");
		Passager p2=new Passager("BIDULE", "chose");
		Passager p3=new Passager("MACHIN", "Truc");
		
<<<<<<< HEAD
		passagerDao.create(p1);
		passagerDao.create(p2);
		passagerDao.create(p3);
		
		p1.setAdresse(new Adresse("1 rue de la paix", "75001", "Paris", "France"));
		p2.setAdresse(new Adresse("1 place de la bourse", "75002", "Paris", "France"));
		p3.setAdresse(new Adresse("1 deux trois soleil", "94000", "Créteil", "France"));

		
		p1=passagerDao.update(p1);
		p2=passagerDao.update(p2);
		p3=passagerDao.update(p3);
		
		resa1.setPassager(p1);
		resa2.setPassager(p2);
		resa3.setPassager(p2);
		resa4.setPassager(p3);

		
		reservationDao.create(resa1);
		reservationDao.create(resa2);
		reservationDao.create(resa3);
		reservationDao.create(resa4);
=======
		p1.setAdresse(new Adresse("1 rue de la paix", "75001", "Paris", "France"));
		p2.setAdresse(new Adresse("1 place de la bourse", "75002", "Paris", "France"));
		p3.setAdresse(new Adresse("1 deux trois soleil", "94000", "Créteil", "France"));
		
		passagerDao.create(p1);
		passagerDao.create(p2);
		passagerDao.create(p3);
		
		resa1.setPassager(p1);
		resa2.setPassager(p1);
		resa3.setPassager(p2);
		resa4.setPassager(p1);
		resa4.setPassager(p2);
		resa4.setPassager(p3);
		
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
		
		// Test Clients
		ClientDao clientDao = new ClientDaoJpa();
		
		Client client1 = new ClientPhysique("MICHELIN", "luc", "0123456789", "015478965", "luc@google.com", TitrePhysique.MR);
<<<<<<< HEAD
		Client client2 = new ClientMoral("MACHIN", "0352698745", "", "machin@lol.fr", TitreMoral.SARL, "12357879848974");
		Client client3 = new ClientEI("TRUC", "jacqueline", "456789465", "7845645", "truc.j@boite.com", TitrePhysique.MLLE);
=======
		client1.setAdresse(new Adresse("RUE DU MORT", "75666", "Paris", "France"));
		Client client2 = new ClientMoral("MACHIN", "0352698745", "", "machin@lol.fr", TitreMoral.SARL, "12357879848974");
		client2.setAdresse(new Adresse("Regzegzegze", "77000", "Melun", "France"));
		Client client3 = new ClientEI("TRUC", "jacqueline", "456789465", "7845645", "truc.j@boite.com", TitrePhysique.MLLE);
		client3.setAdresse(new Adresse("afazefafaazf", "94500", "Chamigny", "France"));
		
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
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
<<<<<<< HEAD
		
		// TODO Ne marche pas ?
		client1.addReservation(resa1);
		client1.addReservation(resa4);
		
		client1.setAdresse(new Adresse("RUE DU MORT", "75666", "Paris", "France"));
=======
//		client1.addReservation(resa1);
//		client1.addReservation(resa4);
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
		client1 = clientDao.update(client1);
		
		client2.setLogin(log2);
		client2 = clientDao.update(client2);
		
<<<<<<< HEAD
		
		resa2.setClient(client2);
		resa2 = reservationDao.update(resa2);
		
		resa3.setClient(client3);
		resa3 = reservationDao.update(resa3);
		
		
		// ---------- VOLS --------------
		VolDao volDao = new VolDaoJpa();
		CompagnieAerienneDao compagnieAerienneDao = new CompagnieAerienneDaoJpa();
		CompagnieAerienneVolDao compagnieAerienneVolDao = new CompagnieAerienneVolDaoJpa();
		EscaleDao escaleDao = new EscaleDaoJpa();
		AeroportDao aeroportDao = new AeroportDaoJpa();
		VilleDao villeDao = new VilleDaoJpa();
		AeroportVilleDao aeroportVilleDao = new AeroportVilleDaoJpa();
		
		Vol vol1 = new Vol(sdf.parse("01/02/2016"), sdf.parse("01/02/2016"), sdf2.parse("09:00"), sdf2.parse("15:30"));
		Vol vol2 = new Vol(sdf.parse("15/06/2017"), sdf.parse("16/06/2017"), sdf2.parse("21:30"), sdf2.parse("08:45"));
		Vol vol3 = new Vol(sdf.parse("20/12/2016"), sdf.parse("21/12/2016"), sdf2.parse("11:00"), sdf2.parse("09:30"));
		
		volDao.create(vol1);
		volDao.create(vol2);
		volDao.create(vol3);
		
		// Creation de Compagnie
		CompagnieAerienne comp1 = new CompagnieAerienne("AirTroll");
		CompagnieAerienne comp2 = new CompagnieAerienne("1337");
		CompagnieAerienne comp3 = new CompagnieAerienne("Quiditch AirLines");
		
		compagnieAerienneDao.create(comp1);
		compagnieAerienneDao.create(comp2);
		compagnieAerienneDao.create(comp3);
		
		compagnieAerienneVolDao.create(new CompagnieAerienneVol("AF12345", comp1, vol1));
		compagnieAerienneVolDao.create(new CompagnieAerienneVol("fg4545", comp1, vol2));
		compagnieAerienneVolDao.create(new CompagnieAerienneVol("tyh54", comp2, vol3));
		compagnieAerienneVolDao.create(new CompagnieAerienneVol("lol1337", comp3, vol3));
		
		// Creation d'Aeroport
		Aeroport aeroport1 = new Aeroport("Poissy Charles De Galle");
		Aeroport aeroport2 = new Aeroport("Aeroport International de Monquc");
		Aeroport aeroport3 = new Aeroport("Hell Terminus");
		Aeroport aeroport4 = new Aeroport("APT 4");
		Aeroport aeroport5 = new Aeroport("APT 5");
		
		aeroportDao.create(aeroport1);
		aeroportDao.create(aeroport2);
		aeroportDao.create(aeroport3);
		aeroportDao.create(aeroport4);
		aeroportDao.create(aeroport5);
		
		// Update villes des aeroports
		vol1.setAeroportDepart(aeroport1);
		vol1.setAeroportArrivee(aeroport2);
		vol2.setAeroportDepart(aeroport3);
		vol2.setAeroportArrivee(aeroport4);
		vol3.setAeroportDepart(aeroport2);
		vol3.setAeroportArrivee(aeroport3);
		
		
		
		// Creation de Villes
		Ville ville1 = new Ville("Panam");
		Ville ville2 = new Ville("DevilsLand");
		Ville ville3 = new Ville("Monquc");
		
		villeDao.create(ville1);
		villeDao.create(ville2);
		villeDao.create(ville3);
		
		aeroportVilleDao.create(new AeroportVille(aeroport1, ville1));
		aeroportVilleDao.create(new AeroportVille(aeroport2, ville2));
		aeroportVilleDao.create(new AeroportVille(aeroport3, ville3));
		aeroportVilleDao.create(new AeroportVille(aeroport4, ville3));
		aeroportVilleDao.create(new AeroportVille(aeroport5, ville3));
		
		// Creation d'escales
		Escale escale1 = new Escale(sdf2.parse("16:00"),sdf2.parse("15:00"), aeroport4);
		Escale escale2 = new Escale(sdf2.parse("00:00"),sdf2.parse("22:00"), aeroport5);
		
		escaleDao.create(escale1);
		escaleDao.create(escale2);
		
		/// TODO Ne marche pas ??
		vol3.addEscale(escale1);
		vol3 = volDao.update(vol3);
		
		escale2.setVol(vol3);
		escale2 = escaleDao.update(escale2);
		
		// Reservations
		resa1.setVol(vol1);
		resa2.setVol(vol2);
		resa3.setVol(vol3);
		resa4.setVol(vol1);
		
		resa1 = reservationDao.update(resa1);
		resa2 = reservationDao.update(resa2);
		resa3 = reservationDao.update(resa3);
		resa4 = reservationDao.update(resa4);
		
=======
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
		CompagnieAerienneDao compagnieAerienneDao = new CompagnieAerienneDaoJpa();
		CompagnieAerienneVolDao compagnieAerienneVolDao = new CompagnieAerienneVolDaoJpa();
		
		Aeroport aeroportCdg = new Aeroport();
		aeroportCdg.setNom("Charles de Gaulle");
		aeroportDao.create(aeroportCdg);
		
		aeroportCdg.setNom("Roissy Charles de Gaulle");
		aeroportCdg = aeroportDao.update(aeroportCdg);
		
		Aeroport aeroportJfk = new Aeroport();
		aeroportJfk.setNom("New York JFK");
		aeroportDao.create(aeroportJfk);
		
		Aeroport aeroportLax = new Aeroport();
		aeroportLax.setNom("LAX");
		aeroportDao.create(aeroportLax);
		
		Aeroport aeroportChicago = new Aeroport();
		aeroportChicago.setNom("Chicago O'Hare");
		aeroportDao.create(aeroportChicago);
		
		Aeroport aeroportOrly = new Aeroport();
		aeroportOrly.setNom("Aéroport d'Orly");
		aeroportDao.create(aeroportOrly);

		
		Ville paris = new Ville();
		paris.setNom("paname");
		villeDao.create(paris);

		paris.setNom("Paris");
		paris = villeDao.update(paris);
		
		Ville roissy = new Ville();
		roissy.setNom("Roissy");
		villeDao.create(roissy);
		
		Ville orly = new Ville();
		orly.setNom("Orly");
		villeDao.create(orly);
		
		Ville ny = new Ville();
		ny.setNom("New York");
		villeDao.create(ny);
		
		Ville la = new Ville();
		la.setNom("Los Angeles");
		villeDao.create(la);
		
		Ville chicago = new Ville();
		chicago.setNom("Chicago");
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
//		escale1.setAeroport(aeroportJfk);
//		escale1.setVol(vol1);
		escale1.setId(new EscaleId(aeroportJfk,vol1)); //Embedded
		escale1.setHeureDepart(heure.parse("09:30 AM"));
		escale1.setHeureArrivee(heure.parse("08:30 AM"));
		escaleDao.create(escale1);
		
		Escale escale2 = new Escale();
//		escale2.setAeroport(aeroportChicago);
//		escale2.setVol(vol1);
		escale2.setId(new EscaleId(aeroportChicago, vol1)); // Embedded
		escale2.setHeureDepart(heure.parse("12:30 AM"));
		escale2.setHeureArrivee(heure.parse("11:30 AM"));
		escaleDao.create(escale2);
		
		vol1.addEscale(escale2);
		vol1.addEscale(escale1);
		vol1.setAeroportDepart(aeroportOrly);
		vol1 = volDao.update(vol1);
		
		CompagnieAerienne compagnieAerienne1=new CompagnieAerienne();
		compagnieAerienne1.setNom("Air France");
		compagnieAerienneDao.create(compagnieAerienne1);
		
		CompagnieAerienne compagnieAerienne2=new CompagnieAerienne();
		compagnieAerienne2.setNom("Air Canada");
		compagnieAerienneDao.create(compagnieAerienne2);
		
		CompagnieAerienneVol compvol1 = new CompagnieAerienneVol();
		compvol1.setCompagnieAerienne(compagnieAerienne1);
		compvol1.setVol(vol1);
		compvol1.setNumero("lolol");
		compagnieAerienneVolDao.create(compvol1);
		
		resa1.setVol(vol1);
		resa2.setVol(vol1);
		resa3.setVol(vol1);
		resa4.setVol(vol1);
		
		reservationDao.create(resa1);
		reservationDao.create(resa2);
		reservationDao.create(resa3);
		reservationDao.create(resa4);
		
		// TEST GETTERS LIST
		client2 = clientDao.find(client2.getId());
		System.out.println(client2.getReservations());
		
		p1= passagerDao.find(p1.getId());
		System.out.println(p1.getreservations());
		
		// TEST SUPPRESSION VOL
		vol1=volDao.find(vol1.getId());
		System.out.println(vol1.getId());
//		
		for(Reservation r:vol1.getReservations())
			reservationDao.delete(r);
////		vol1.setReservations(null);
//		
		for(CompagnieAerienneVol cvol:vol1.getCompagniesAeriennes())
			compagnieAerienneVolDao.delete(cvol);
////		vol1.setCompagniesAeriennes(null);
//		
		for(Escale esc:vol1.getEscales())
			escaleDao.delete(esc);
////		vol1.setEscales(null);
//		
////		volDao.delete(vol1);
		
//		Vol volx = volDao.find(vol1.getId());
		volDao.delete(volDao.find(vol1.getId()));
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
		
		Application.close();
	}

}
