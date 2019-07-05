package com.sopra.java.patterns.model.entities;

public class Puesto {
	private Persona persona;
	private Boolean ordenador;
	public Puesto() {
		
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Boolean getOrdenador() {
		return ordenador;
	}
	public void setOrdenador(Boolean ordenador) {
		this.ordenador = ordenador;
	}
	
		
}
