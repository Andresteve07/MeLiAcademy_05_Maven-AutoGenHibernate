package com.mercadolibre.academy.fidelizacion.misc;
import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.cfg.Configuration;
import com.mercadolibre.academy.fidelizacion.modelo.dao.ParametroDao;
import com.mercadolibre.academy.fidelizacion.modelo.dao.ParametroDaoImpl;
import com.mercadolibre.academy.fidelizacion.modelo.entity.Parametro;

import org.junit.Test;
import org.apache.log4j.Logger;


public class Test2 {
	
	private static final Logger logger = Logger.getRootLogger();
	private ParametroDao paramDao = new ParametroDaoImpl(new Configuration().configure().buildSessionFactory());
	
	
	@Test
	public void test() throws Exception{
		List<Parametro> parametros = paramDao.findAll();
		for (Parametro parametro : parametros){
			logger.info(parametro.getDescripcion()+ " : " + parametro.getValor());
		}
		assertTrue(true);
	}
	
}
