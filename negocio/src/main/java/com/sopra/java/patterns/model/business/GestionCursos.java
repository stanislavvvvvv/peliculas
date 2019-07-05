package com.sopra.java.patterns.model.business;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sopra.java.patterns.model.entities.Alumno;
import com.sopra.java.patterns.model.entities.Aula;
import com.sopra.java.patterns.model.entities.Profesor;
import com.sopra.java.patterns.model.entities.Puesto;

public class GestionCursos {
	private GestionAulas gestorDeAulas;
	private GestionLogs gestorDeLogs;
	private GestionPersona gestorDePersonas;

	public GestionCursos() {
		gestorDeAulas = new GestionAulas();
		gestorDeLogs = new GestionLogs();
		gestorDePersonas = new GestionPersona();
	}

	public void crearCurso(String nombre, Boolean proyector, Boolean pizarra, Map<String, String> alumnos,
			String nombreProfesor, String dniProfesor) throws Exception {

		gestorDeAulas.crearAula(nombre, proyector, pizarra, alumnos.size());
		gestorDePersonas.crearProfesor(nombreProfesor, dniProfesor);
		// acumulas metodos para implementar despues por si no sabes ahora con el TODO
		// dentro
		// para poder continuar

		Collection<Alumno> alumnosGuardados = almacenarAlumnosDesdeElGestorDeAlumnos(alumnos);
		List<Aula> dameAulas = gestorDeAulas.dameAulas(Arrays.asList(nombre));

		if (dameAulas.size() == 1) {
			Aula aula = dameAulas.get(0);
			Iterator<Alumno> recorreAlumnos = alumnosGuardados.iterator();
			Iterator<Puesto> recorrePuestos = aula.getAlumnos().iterator();
			while (recorreAlumnos.hasNext() && recorrePuestos.hasNext())
				recorrePuestos.next().setPersona(recorreAlumnos.next());
			Set<Profesor> listaProfesores = gestorDePersonas.listaProfesores();
			Profesor profesorBusqueda = new Profesor(null, dniProfesor);
			for (Profesor profesor : listaProfesores)
				if (profesor.equals(profesorBusqueda))
					aula.getProfesor().setPersona(profesor);

		} else {
			throw new Exception("No existe el aula");
		}

	}

	private Collection<Alumno> almacenarAlumnosDesdeElGestorDeAlumnos(Map<String, String> alumnos) {
		Set<String> keySet = alumnos.keySet();
		for (String dni : keySet)
			gestorDePersonas.crearAlumno(alumnos.get(dni), dni);

		Collection<Alumno> misAlumnos = new HashSet<Alumno>();
		Set<Alumno> listaAlumnos = gestorDePersonas.listaAlumnos();
		for (Alumno alumno : listaAlumnos)
			if (alumnos.containsKey(alumno.getDni()))
				misAlumnos.add(alumno);

		return misAlumnos;
	}

}
