package voyage.client.test;

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
import voyage.client.model.ClientPhysique;
import voyage.client.model.Login;
import voyage.client.model.Passager;
import voyage.client.model.TitrePhysique;
import voyage.dao.ReservationDao;
import voyage.dao.ReservationDaoJpa;
import voyage.model.Reservation;

public class Test {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public static void main(String[] args) throws ParseException {

		ReservationDao reservationDao=new ReservationDaoJpa();
		PassagerDao passagerDao=new PassagerDaoJpa();
		
		Reservation resa1=new Reservation(sdf.parse("08/08/2016"), 15478);
		Reservation resa2=new Reservation(sdf.parse("08/08/2016"), 15479);
		Reservation resa3=new Reservation(sdf.parse("08/08/2016"), 15480);
		
		Passager p1=new Passager("Dupond", "Michel");
		Passager p2=new Passager("Martin", "Marcel");
		
		passagerDao.create(p1);
		passagerDao.create(p2);
		
		p1.setAdresse(new Adresse("1 rue de la paix", "75001", "Paris", "France"));
		p2.setAdresse(new Adresse("1 place de la bourse", "75002", "Paris", "France"));
		
		p1=passagerDao.update(p1);
		p2=passagerDao.update(p2);
		
		resa1.setPassager(p1);
		resa2.setPassager(p1);
		resa3.setPassager(p2);
		
		reservationDao.create(resa1);
		reservationDao.create(resa2);
		reservationDao.create(resa3);
		
		// Test Clients
		ClientDao clientDao = new ClientDaoJpa();
		
		Client client1 = new ClientPhysique("MICHELIN", "luc", "0123456789", "015478965", "luc@google.com", TitrePhysique.MR);
		
		clientDao.create(client1);
		
		// Test Logins
		LoginDao logDao = new LoginDaoJpa();
		
		Login log1 = new Login("popol","mdp",false);
		
		logDao.create(log1);
		
		// Ajout Client reservation
		client1.setLogin(log1);
		client1.addReservation(resa1);
		client1.addReservation(resa3);
		client1.setAdresse(new Adresse("RUE DU MORT", "75666", "Paris", "France"));
		clientDao.update(client1);
		
		resa2.setClient(client1);
		reservationDao.update(resa2);
		
		Application.close();
		

	}

}
