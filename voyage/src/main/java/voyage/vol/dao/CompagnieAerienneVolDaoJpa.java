package voyage.vol.dao;
<<<<<<< HEAD

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import voyage.Application;
import voyage.vol.model.CompagnieAerienneVol;

public class CompagnieAerienneVolDaoJpa implements CompagnieAerienneVolDao {

	@Override
	public CompagnieAerienneVol find(String id) {
		CompagnieAerienneVol compagnieAerienneVol = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
=======
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import voyage.Application;
import voyage.vol.model.CompagnieAerienneVol;
import voyage.vol.model.CompagnieAerienneVolId;
import voyage.vol.model.Vol;

public class CompagnieAerienneVolDaoJpa implements CompagnieAerienneVolDao {
	
	@Override
	public CompagnieAerienneVol find(CompagnieAerienneVolId id){
		
		CompagnieAerienneVol compagnieAerienneVol=null;
		EntityManager em=null;
		EntityTransaction tx=null;
		try{
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();
<<<<<<< HEAD

			compagnieAerienneVol = em.find(CompagnieAerienneVol.class, id);

			tx.commit();
=======
			compagnieAerienneVol = em.find(CompagnieAerienneVol.class, id);
			
			
			tx.commit();
			
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
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
		return compagnieAerienneVol;
	}

=======
		return  compagnieAerienneVol;
	}
	
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
	@Override
	public List<CompagnieAerienneVol> findAll() {
		List<CompagnieAerienneVol> compagnieAerienneVols = new ArrayList<CompagnieAerienneVol>();
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

<<<<<<< HEAD
			Query query = em.createQuery("select c from CompagnieAerienneVol c");
			compagnieAerienneVols = query.getResultList();

=======
			Query query = em.createQuery("select ca from CompagnieAerienneVol ca");
			compagnieAerienneVols = query.getResultList();
			
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
		return compagnieAerienneVols;
	}
<<<<<<< HEAD

	@Override
	public void create(CompagnieAerienneVol obj) {
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			em.persist(obj);

			tx.commit();
=======
	
	@Override
		public void create(CompagnieAerienneVol obj) {
				CompagnieAerienneVol compagnieAerienneVol = null;
				EntityManager em = null;
				EntityTransaction tx = null;
				try {
					em = Application.getInstance().getEmf().createEntityManager();
					tx = em.getTransaction();

					tx.begin();
			
			Vol vol = em.merge(obj.getVol());
			obj.setVol(vol);
			obj.setCompagnieAerienne(em.merge(obj.getCompagnieAerienne()));
			
			
			em.persist(obj);
			
			tx.commit();
			
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
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
=======
		
			}
>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72

	@Override
	public CompagnieAerienneVol update(CompagnieAerienneVol obj) {
		CompagnieAerienneVol compagnieAerienneVol = null;
		EntityManager em = null;
		EntityTransaction tx = null;
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			compagnieAerienneVol = em.merge(obj);
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
		return compagnieAerienneVol;
	}

	@Override
	public void delete(CompagnieAerienneVol obj) {
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
<<<<<<< HEAD
	}

}
=======
		}
	}


>>>>>>> fce536c217eef67091b2c7025b3def78c1b5ad72
