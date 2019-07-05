package com.sopra.java.patterns.model.entities;

import java.util.Collection;

public class Aula {
	//no usar primitivos.
	private String nombre;
	private Boolean proyector;
	private Boolean pizarra;
	private Collection<Puesto> alumnos;
	private Puesto profesor;
	
	public Aula () {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getProyector() {
		return proyector;
	}
	public void setProyector(Boolean proyector) {
		this.proyector = proyector;
	}   
	public Boolean getPizarra() {
		return pizarra;
	}
	public void setPizarra(Boolean pizarra) {
		this.pizarra = pizarra;
	}
	public Collection<Puesto> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(Collection<Puesto> alumnos) {
		this.alumnos = alumnos;
	}
	public Puesto getProfesor() {
		return profesor;
	}
	public void setProfesor(Puesto profesor) {
		this.profesor = profesor;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Aula other = (Aula) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
	
	
}
