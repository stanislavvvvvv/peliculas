package com.sopra.java.patterns.model.entities;

import java.io.Serializable;

public class Profesor extends Persona implements Serializable{
	
	public Profesor(String nombre, String dni) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String identificador() {
		// TODO Auto-generated method stub
		return "Profesor : " + this.getNombre() + " " + this.getDni();
	}
	
}
