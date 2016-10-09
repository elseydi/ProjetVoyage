package voyage.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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
		
		Passager p1=new Passager("Dupond", "Michel");
		Passager p2=new Passager("BIDULE", "chose");
		Passager p3=new Passager("MACHIN", "Truc");
		
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
		
		// TODO Ne marche pas ?
		client1.addReservation(resa1);
		client1.addReservation(resa4);
		
		client1.setAdresse(new Adresse("RUE DU MORT", "75666", "Paris", "France"));
		client1 = clientDao.update(client1);
		
		client2.setLogin(log2);
		client2 = clientDao.update(client2);
		
		
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
		
		
		Application.close();
	}

}
