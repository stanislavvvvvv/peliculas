package com.sopra.java.patterns.model.business;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.sopra.java.patterns.Factory;
import com.sopra.java.patterns.model.dao.IGenericDao;
import com.sopra.java.patterns.model.dao.IMultipleDao;
import com.sopra.java.patterns.model.entities.Alumno;
import com.sopra.java.patterns.model.entities.LineaDeLog;
import com.sopra.java.patterns.model.entities.Nivel;
import com.sopra.java.patterns.model.entities.Persona;
import com.sopra.java.patterns.model.entities.Profesor;

public class GestionPersona {
	private IMultipleDao<Persona,String> miDaoDePersonas;
	private IGenericDao<LineaDeLog> miDaoDeLogs;
	
	public GestionPersona() {
		this.miDaoDePersonas = Factory.getPersonaDao();
		this.miDaoDeLogs = Factory.getDaoDeLog();
	}
	
	public void crearAlumno(String nombre, String dni) {
		Alumno alumno = new Alumno(nombre,dni);
		miDaoDePersonas.insert(alumno);
		miDaoDeLogs.insert(new LineaDeLog(new Date(),(Nivel.INFO),"Alumno Agregado",miDaoDePersonas.getClass().toString()));
	}
	
	public void crearProfesor(String nombre,String dni) {
		Profesor profesor = new Profesor(nombre,dni);
		miDaoDePersonas.insert(profesor);
		miDaoDeLogs.insert(new LineaDeLog(new Date(),(Nivel.INFO),"Profesor Agregado",miDaoDePersonas.getClass().toString()));
	}
	
	//de una lista a un set asi quita los repetidos
	public Set<Persona> listarPersonas(){
		return new HashSet<Persona>(miDaoDePersonas.list());
	}
	
	public Set<Profesor> listaProfesores(){
		Set<Profesor> profesores = new HashSet<Profesor>();
		for (Persona persona : miDaoDePersonas.list()) 
			if(persona instanceof Profesor) {
				Profesor profesor = (Profesor) persona;
				profesores.add(profesor);
			}
		
		return profesores;
	}
	
	public Set<Alumno> listaAlumnos(){
		Set<Alumno> alumnos = new HashSet<Alumno>();
		for (Persona persona : miDaoDePersonas.list()) {
			if(persona instanceof Alumno) {
				Alumno alumno = (Alumno) persona;
				alumnos.add(alumno);
			}
		}
		return alumnos;
	}
}
