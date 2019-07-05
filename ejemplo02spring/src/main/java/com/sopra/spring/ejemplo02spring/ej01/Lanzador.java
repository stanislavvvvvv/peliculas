package com.sopra.spring.ejemplo02spring.ej01;

public class Lanzador {
	private static BarDeCopas miBarDeCopasFavorito;
	
	public static void main(String[] args) {

		BarDeCopas elBuzon = new BarDeCopas();
		elBuzon.setNombre("El Buzon de mierda");
		elBuzon.setCalidadDeLaBebida("xxxx");
		
		Lanzador.miBarDeCopasFavorito = elBuzon;
		System.out.println(elBuzon);
		cambiamosDeCalidad();
		System.out.println(elBuzon);
	}
	public static void cambiamosDeCalidad() {
		miBarDeCopasFavorito.setCalidadDeLaBebida("xxx");
	}
}
