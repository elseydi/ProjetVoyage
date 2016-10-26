package voyage.vol.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

<<<<<<< HEAD
import voyage.Application;
import voyage.vol.model.Escale;
=======

import voyage.Application;

import voyage.vol.model.Escale;
import voyage.vol.model.EscaleId;
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72

public class EscaleDaoJpa implements EscaleDao {

	@Override
<<<<<<< HEAD
	public Escale find(Long id) {
=======
	public Escale find(EscaleId id) {
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
		Escale escale = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			escale = em.find(Escale.class, id);

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
		return escale;
	}

	@Override
	public List<Escale> findAll() {
		List<Escale> escales = new ArrayList<Escale>();
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

<<<<<<< HEAD
			Query query = em.createQuery("select c from Escale c");
			escales = query.getResultList();

=======
			Query query = em.createQuery("select e from Escale e");
			escales = query.getResultList();
			
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
		return escales;
	}

	@Override
	public void create(Escale obj) {
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

<<<<<<< HEAD
=======
			// IdClass
//			obj.setVol(em.merge(obj.getVol()));
//			obj.setAeroport(em.merge(obj.getAeroport()));
			
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
=======
		
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	}

	@Override
	public Escale update(Escale obj) {
		Escale escale = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			escale = em.merge(obj);

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
		return escale;
	}

	@Override
	public void delete(Escale obj) {
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
