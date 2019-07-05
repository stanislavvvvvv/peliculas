package com.sopra.java.patterns.model.entities;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class LineaDeLog {
	//muy costoso, se suele dejar para base de datos.
	private static AtomicInteger secuencia;
	private Integer id;
	private Date fecha;
	private Nivel nivel;
	private String mensaje;
	//nombre del modulo 
	private String nombre;
	
	static {
		secuencia = new AtomicInteger();
	}
	
	public LineaDeLog() {
		// TODO Auto-generated constructor stub
	}
	public LineaDeLog(Date fecha, Nivel nivel, String mensaje, String nombre) {
		super();
		this.id = secuencia.incrementAndGet();
		this.fecha = fecha;
		this.nivel = nivel;
		this.mensaje = mensaje;
		this.nombre = nombre;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaDeLog other = (LineaDeLog) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
