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
import voyage.vol.model.Vol;

public class VolDaoJpa implements VolDao {
=======

import voyage.Application;
import voyage.vol.model.*;

public class VolDaoJpa implements VolDao{
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72

	@Override
	public Vol find(Long id) {
		Vol vol = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

<<<<<<< HEAD
			vol = em.find(Vol.class, id);

=======
			//vol = em.find(Vol.class, id);
			Query query = em.createQuery("select distinct v from Vol v where v.id=:idVol");
			query.setParameter("idVol", id);
			vol = (Vol) query.getSingleResult();
			
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
		return vol;
	}

	@Override
	public List<Vol> findAll() {
		List<Vol> vols = new ArrayList<Vol>();
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

<<<<<<< HEAD
			Query query = em.createQuery("select c from Vol c");
			vols = query.getResultList();

=======
			Query query = em.createQuery("select v from Vol v");
			vols = query.getResultList();
			
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
		return vols;
	}

	@Override
	public void create(Vol obj) {
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
	public Vol update(Vol obj) {
		Vol vol = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			vol = em.merge(obj);
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
		return vol;
	}

	@Override
	public void delete(Vol obj) {
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
