package com.sopra.java.patterns.model.business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import com.sopra.java.patterns.Factory;
import com.sopra.java.patterns.model.dao.IDao;
import com.sopra.java.patterns.model.dao.IGenericDao;
import com.sopra.java.patterns.model.entities.Aula;
import com.sopra.java.patterns.model.entities.LineaDeLog;
import com.sopra.java.patterns.model.entities.Nivel;
import com.sopra.java.patterns.model.entities.Puesto;

public class GestionAulas {
	private IDao<Aula> miDaoDeAulas;
	private IGenericDao<LineaDeLog> miDaoDeLogs;
	
	
	public GestionAulas() {
		this.miDaoDeAulas = Factory.getDaoDeAula();
		this.miDaoDeLogs = Factory.getDaoDeLog();
		}

	public Aula crearAula(String nombre,Boolean proyector,Boolean pizarra, Integer alumnos) {
		Aula aula = new Aula();
		aula.setNombre(nombre);
		aula.setPizarra(pizarra);
		aula.setProyector(proyector);
		Collection<Puesto> puestosAlumnos = new HashSet<>();
		for (int i = 0; i < alumnos; i++) {
			puestosAlumnos.add(new Puesto());
		}
		aula.setProfesor(new Puesto());
		aula.setAlumnos(puestosAlumnos);
		miDaoDeAulas.insert(aula);
		miDaoDeLogs.insert(new LineaDeLog(new Date(),(Nivel.INFO),"Aula Agregada",miDaoDeAulas.getClass().toString()));
		return aula;
	}
	
	public List<Aula> dameAulas(List<String> nombresDeAulas){
		List<Aula> listaDeAulas = new ArrayList<Aula>();
		for (int i = 0; i < nombresDeAulas.size(); i++) {
			Aula aulaABuscar = new Aula();
			aulaABuscar.setNombre(nombresDeAulas.get(i));
			Aula aula = miDaoDeAulas.searchByName(aulaABuscar);
			if(aula!=null)
				listaDeAulas.add(aula);
		}
		return listaDeAulas;
	}
	
}
