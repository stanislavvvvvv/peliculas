package com.sopra.java.patterns.model.entities;

import java.io.Serializable;

public class Alumno extends Persona implements Serializable{
	public Alumno(String nombre, String dni) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String identificador() {
		// TODO Auto-generated method stub
		return "Alumno : " + this.getDni() + " " + this.getNombre();
	}
	
}
