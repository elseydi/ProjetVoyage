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
import voyage.vol.model.Aeroport;

public class AeroportDaoJpa implements AeroportDao {
=======

import voyage.Application;
import voyage.vol.model.*;

public class AeroportDaoJpa implements AeroportDao{
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72

	@Override
	public Aeroport find(Long id) {
		Aeroport aeroport = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			aeroport = em.find(Aeroport.class, id);
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
		return aeroport;
	}

	@Override
	public List<Aeroport> findAll() {
		List<Aeroport> aeroports = new ArrayList<Aeroport>();
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

<<<<<<< HEAD
			Query query = em.createQuery("select c from Aeroport c");
			aeroports = query.getResultList();

=======
			Query query = em.createQuery("select a from Aeroport a");
			aeroports = query.getResultList();
			
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
		return aeroports;
	}

	@Override
	public void create(Aeroport obj) {
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
	public Aeroport update(Aeroport obj) {
		Aeroport aeroport = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			aeroport = em.merge(obj);
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
		return aeroport;
	}

	@Override
	public void delete(Aeroport obj) {
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
	public List<Aeroport> findAllByName(String name) {
		List<Aeroport> aeroports = new ArrayList<Aeroport>();
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			Query query = em.createQuery("select a from Aeroport a where c.nomAeroport = :monNomAeroport");
			query.setParameter("monNomAeroport", name);
			aeroports = query.getResultList();
			
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
		return aeroports;
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	}

}
