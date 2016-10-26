package voyage.vol.dao;

<<<<<<< HEAD
=======

>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

<<<<<<< HEAD
import voyage.Application;
import voyage.vol.model.Ville;

public class VilleDaoJpa implements VilleDao {
=======

import voyage.Application;
import voyage.vol.model.*;

public class VilleDaoJpa implements VilleDao{
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72

	@Override
	public Ville find(Long id) {
		Ville ville = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			ville = em.find(Ville.class, id);
<<<<<<< HEAD

=======
			
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
		return ville;
	}

	@Override
	public List<Ville> findAll() {
		List<Ville> villes = new ArrayList<Ville>();
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

<<<<<<< HEAD
			Query query = em.createQuery("select c from Ville c");
			villes = query.getResultList();

=======
			Query query = em.createQuery("select v from Ville v");
			villes = query.getResultList();
			
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
		return villes;
	}

	@Override
	public void create(Ville obj) {
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			em.persist(obj);
<<<<<<< HEAD

=======
			
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
=======
		
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	}

	@Override
	public Ville update(Ville obj) {
		Ville ville = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			ville = em.merge(obj);
<<<<<<< HEAD

=======
			
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
		return ville;
	}

	@Override
	public void delete(Ville obj) {
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

	@Override
	public List<Ville> findAllByName(String name) {
		List<Ville> villes = new ArrayList<Ville>();
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			Query query = em.createQuery("select v from Ville v where c.nomVille = :monNomVille");
			query.setParameter("monNomVille", name);
			villes = query.getResultList();
			
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
=======
		return villes;
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	}

}
