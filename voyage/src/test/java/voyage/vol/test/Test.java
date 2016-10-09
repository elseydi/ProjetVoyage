package voyage.vol.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import voyage.Application;
import voyage.vol.model.*;
import voyage.vol.dao.*;

public class Test {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
	public static void main(String[] args) throws ParseException {
		// Creation de vols
		Vol vol1 = new Vol(sdf.parse("01/02/2016"), sdf.parse("01/02/2016"), sdf2.parse("09:00"), sdf2.parse("15:30"));
		Vol vol2 = new Vol(sdf.parse("15/06/2017"), sdf.parse("16/06/2017"), sdf2.parse("21:30"), sdf2.parse("08:45"));
		Vol vol3 = new Vol(sdf.parse("20/12/2016"), sdf.parse("21/12/2016"), sdf2.parse("11:00"), sdf2.parse("09:30"));
		

		// Creation de Compagnie
		CompagnieAerienne comp1 = new CompagnieAerienne("AirTroll");
		CompagnieAerienne comp2 = new CompagnieAerienne("1337");
		CompagnieAerienne comp3 = new CompagnieAerienne("Quiditch AirLines");
		
		// Creation d'Aeroport
		Aeroport aeroport1 = new Aeroport("Poissy Charles De Galle");
		Aeroport aeroport2 = new Aeroport("Aeroport International de Monquc");
		Aeroport aeroport3 = new Aeroport("Hell Terminus");
		Aeroport aeroport4 = new Aeroport("APT 4");
		Aeroport aeroport5 = new Aeroport("APT 5");
		
		// Creation de Villes
		Ville ville1 = new Ville("Panam");
		Ville ville2 = new Ville("DevilsLand");
		Ville ville3 = new Ville("Monquc");
		
		// Creation d'escales
		Escale escale1 = new Escale(sdf2.parse("16:00"),sdf2.parse("15:00"), aeroport4);
		Escale escale2 = new Escale(sdf2.parse("00:00"),sdf2.parse("22:00"), aeroport5);
		
		//Persistance
		VolDao volDao = new VolDaoJpa();
		CompagnieAerienneDao compagnieAerienneDao = new CompagnieAerienneDaoJpa();
		CompagnieAerienneVolDao compagnieAerienneVolDao = new CompagnieAerienneVolDaoJpa();
		EscaleDao escaleDao = new EscaleDaoJpa();
		AeroportDao aeroportDao = new AeroportDaoJpa();
		VilleDao villeDao = new VilleDaoJpa();
		AeroportVilleDao aeroportVilleDao = new AeroportVilleDaoJpa();
		
		volDao.create(vol1);
		volDao.create(vol2);
		volDao.create(vol3);
		
		compagnieAerienneDao.create(comp1);
		compagnieAerienneDao.create(comp2);
		compagnieAerienneDao.create(comp3);
		
		compagnieAerienneVolDao.create(new CompagnieAerienneVol("AF12345", comp1, vol1));
		compagnieAerienneVolDao.create(new CompagnieAerienneVol("fg4545", comp1, vol2));
		compagnieAerienneVolDao.create(new CompagnieAerienneVol("tyh54", comp2, vol3));
		compagnieAerienneVolDao.create(new CompagnieAerienneVol("lol1337", comp3, vol3));
		
		aeroportDao.create(aeroport1);
		aeroportDao.create(aeroport2);
		aeroportDao.create(aeroport3);
		aeroportDao.create(aeroport4);
		aeroportDao.create(aeroport5);
		
		escaleDao.create(escale1);
		escaleDao.create(escale2);
		
		
		
		villeDao.create(ville1);
		villeDao.create(ville2);
		villeDao.create(ville3);
		
		aeroportVilleDao.create(new AeroportVille(aeroport1, ville1));
		aeroportVilleDao.create(new AeroportVille(aeroport2, ville2));
		aeroportVilleDao.create(new AeroportVille(aeroport3, ville3));
		aeroportVilleDao.create(new AeroportVille(aeroport4, ville3));
		aeroportVilleDao.create(new AeroportVille(aeroport5, ville3));
		
		Application.close();
	}
	
}
