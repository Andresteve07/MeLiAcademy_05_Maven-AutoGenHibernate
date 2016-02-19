// default package
// Generated 19-feb-2016 10:42:59 by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class DetalleCompra.
 * @see .DetalleCompra
 * @author Hibernate Tools
 */
public class DetalleCompraHome {

	private static final Log log = LogFactory.getLog(DetalleCompraHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(DetalleCompra transientInstance) {
		log.debug("persisting DetalleCompra instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(DetalleCompra instance) {
		log.debug("attaching dirty DetalleCompra instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DetalleCompra instance) {
		log.debug("attaching clean DetalleCompra instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(DetalleCompra persistentInstance) {
		log.debug("deleting DetalleCompra instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DetalleCompra merge(DetalleCompra detachedInstance) {
		log.debug("merging DetalleCompra instance");
		try {
			DetalleCompra result = (DetalleCompra) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DetalleCompra findById(java.lang.Integer id) {
		log.debug("getting DetalleCompra instance with id: " + id);
		try {
			DetalleCompra instance = (DetalleCompra) sessionFactory.getCurrentSession().get("DetalleCompra", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DetalleCompra instance) {
		log.debug("finding DetalleCompra instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("DetalleCompra")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
