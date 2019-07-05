package com.sopra.java.patterns;

import java.util.Arrays;
import java.util.List;

import com.sopra.java.patterns.model.business.GestionAulas;
import com.sopra.java.patterns.model.entities.Aula;

//acoplamiento de codigo en el main
public class Lanzador {
	//podemos pasarle como argumentos al estructura de datos que queremos que sea el DAO
	//si tengo que cambiar de estructura el codigo que te ngo que cambiar es solo en el main
	public static void main(String[] args) {
		
		GestionAulas gestionAulas = new GestionAulas();
		gestionAulas.crearAula("Kepler", true, true, 16);
		List<Aula> dameAulas = gestionAulas.dameAulas(Arrays.asList("Kepler","Galileo"));
		System.out.println(dameAulas);
	}
}
