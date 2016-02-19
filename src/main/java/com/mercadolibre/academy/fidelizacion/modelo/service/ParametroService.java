package com.mercadolibre.academy.fidelizacion.modelo.service;

import java.util.List;

import com.mercadolibre.academy.fidelizacion.modelo.entity.Parametro;

public interface ParametroService {
	public List<Parametro> parametroFindAll();
	public Parametro getParametroDetalle(String idParametro);  
	public void UpdateParametro(Parametro obj);
	public Parametro findById(Integer id);
}
