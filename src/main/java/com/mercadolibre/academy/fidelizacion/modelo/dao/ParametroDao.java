package com.mercadolibre.academy.fidelizacion.modelo.dao;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Parametro;
import com.mercadolibre.academy.fidelizacion.modelo.generic.GenericHibernateDao;

public interface ParametroDao extends GenericHibernateDao<Parametro, Integer> {
	public Parametro getParametroDetalle(String idParametro);
}

