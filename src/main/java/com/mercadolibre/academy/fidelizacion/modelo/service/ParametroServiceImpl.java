package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.mercadolibre.academy.fidelizacion.modelo.dao.ParametroDao;
import com.mercadolibre.academy.fidelizacion.modelo.entity.Parametro;

public class ParametroServiceImpl implements ParametroService {

	 private static final Logger logger = Logger.getLogger(ParametroServiceImpl.class);
	 @Autowired
	 private ParametroDao parametroDao;//Implementa una especie de singleton
	  
	 public Parametro getParametroDetalle(String parametroId) {
		 logger.info("Llamada al metodo getParametroDetalle con parametro parametroId = " + parametroId);
		 System.out.println("paso por servicio");   
		 return parametroDao.getParametroDetalle(parametroId);    
	 }
	 
	 public List<Parametro> parametroFindAll() {
		 try {
			 return parametroDao.findAll();
		 } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		 }
	 }
	 
	 public void DeleteParametro(Integer id) throws Exception {
		 parametroDao.delete(parametroDao.findById(id));
	 }
	 
	 public void SaveParametroAdd(Parametro obj) { 
		 try {
			 parametroDao.save(obj);
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public void UpdateParametro(Parametro obj) {   
		 try {   
			 parametroDao.saveOrUpdate(obj);   
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public Parametro findById(Integer id) {
		 try {
			 return parametroDao.findById(id);
		  } catch (Exception e) {
			 e.printStackTrace();
			 return null;
		  }
	 }
	 
}
