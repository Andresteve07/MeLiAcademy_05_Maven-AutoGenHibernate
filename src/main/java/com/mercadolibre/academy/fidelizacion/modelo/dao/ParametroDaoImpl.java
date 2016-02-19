package com.mercadolibre.academy.fidelizacion.modelo.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Parametro;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDaoImpl;

public class ParametroDaoImpl extends GenericHibernateDaoImpl<Parametro, Integer> implements ParametroDao {

	private static final Logger logger = Logger.getLogger(ParametroDaoImpl.class);

	@Autowired
	public ParametroDaoImpl(SessionFactory sessionFactory) {
		logger.info("SessionFactory en clase ParametroDaoImpl");
		super.setSessionFactory(sessionFactory);
	}

	public Parametro getParametroDetalle(String idParametro) {
		logger.info("Llamando al metodo getParametroDetalle con parametro idParametro " + idParametro);
		return (Parametro) getHibernateTemplate().get(Parametro.class, new Integer(idParametro));

	}

	@Override
	public List<Parametro> findAll() throws Exception {
		logger.info("Llamando al metodo findAll");
		return getHibernateTemplate().loadAll(Parametro.class);
	}

	@Override
	public Parametro findById(Integer id) throws Exception {
		logger.info("Llamando al metodo findById con parametro id " + id.toString());
		return (Parametro) getHibernateTemplate().get(Parametro.class, id);
	}
}
