package com.mercadolibre.academy.fidelizacion.modelo.entity;

// default package
// Generated 19-feb-2016 10:42:58 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * Puntos generated by hbm2java
 */
public class Puntos implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3490599688136119921L;
	private Integer idPuntos;
	private Cliente cliente;
	private int puntos;
	private Date fecha;
	private boolean activo;

	public Puntos() {
	}

	public Puntos(Cliente cliente, int puntos, Date fecha, boolean activo) {
		this.cliente = cliente;
		this.puntos = puntos;
		this.fecha = fecha;
		this.activo = activo;
	}

	public Integer getIdPuntos() {
		return this.idPuntos;
	}

	public void setIdPuntos(Integer idPuntos) {
		this.idPuntos = idPuntos;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getPuntos() {
		return this.puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isActivo() {
		return this.activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
