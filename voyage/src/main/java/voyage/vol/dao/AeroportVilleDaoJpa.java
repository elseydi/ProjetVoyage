package voyage.vol.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

<<<<<<< HEAD
import voyage.Application;
import voyage.vol.model.AeroportVille;
=======

import voyage.Application;
import voyage.vol.model.AeroportVille;
import voyage.vol.model.AeroportVilleId;


>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72

public class AeroportVilleDaoJpa implements AeroportVilleDao {

	@Override
<<<<<<< HEAD
	public AeroportVille find(Long id) {
		AeroportVille aeroportVille = null;
=======
	public  AeroportVille find(AeroportVilleId id) {
		 AeroportVille  aeroportVille = null;
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

<<<<<<< HEAD
			aeroportVille = em.find(AeroportVille.class, id);
=======
			 aeroportVille = em.find( AeroportVille.class, id);
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
<<<<<<< HEAD
		return aeroportVille;
=======
		return  aeroportVille;
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	}

	@Override
	public List<AeroportVille> findAll() {
<<<<<<< HEAD
		List<AeroportVille> aeroportVilles = new ArrayList<AeroportVille>();
=======
		List<AeroportVille>  aeroportVilles = new ArrayList<AeroportVille>();
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

<<<<<<< HEAD
			Query query = em.createQuery("select c from AeroportVille c");
			aeroportVilles = query.getResultList();

=======
			Query query = em.createQuery("select av from  AeroportVille av");
			aeroportVilles = query.getResultList();
			
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
<<<<<<< HEAD
		return aeroportVilles;
=======
		return  aeroportVilles;
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	}

	@Override
	public void create(AeroportVille obj) {
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

<<<<<<< HEAD
=======
			obj.setAeroport(em.merge(obj.getAeroport()));
			obj.setVille(em.merge(obj.getVille()));
			
			
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
			em.persist(obj);

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
<<<<<<< HEAD
	}

	@Override
	public AeroportVille update(AeroportVille obj) {
		AeroportVille aeroportVille = null;
=======
		
	}

	@Override
	public  AeroportVille update(AeroportVille obj) {
		AeroportVille  aeroportVille = null;
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			aeroportVille = em.merge(obj);

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return aeroportVille;
	}

	@Override
	public void delete(AeroportVille obj) {
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

<<<<<<< HEAD
			em.remove(obj);
=======
			em.remove(em.merge(obj));
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
<<<<<<< HEAD
=======
		
	
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72

}
