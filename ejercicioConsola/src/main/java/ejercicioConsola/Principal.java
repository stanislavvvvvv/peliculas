package ejercicioConsola;

import java.util.Arrays;

import ejercicio.modelo.Categoria;
import ejercicio.modelo.Director;
import ejercicio.modelo.Pelicula;
import ejercicioNegocio.GestorPeliculas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestorPeliculas gestor = new GestorPeliculas();
		Pelicula p1 = new Pelicula(
				"Toy Story 4", 
				new Director("Josh Cooley "), 
				"When a new toy called \"Forky\" joins Woody and the gang, a road trip alongside old and new friends reveals how big the world can be for a toy.",
				Arrays.asList(Categoria.ANIMATION,Categoria.COMEDY,Categoria.ADVENTURE)
				);
		Pelicula p2 = new Pelicula(
				"Toy Story 4", 
				new Director("Josh Cooley "), 
				"When a new toy called \"Forky\" joins Woody and the gang, a road trip alongside old and new friends reveals how big the world can be for a toy.",
				Arrays.asList(Categoria.ANIMATION,Categoria.COMEDY,Categoria.ADVENTURE)
				);
		Pelicula p3 = new Pelicula(
				"Toy Story 4", 
				new Director("Josh Cooley "), 
				"When a new toy called \"Forky\" joins Woody and the gang, a road trip alongside old and new friends reveals how big the world can be for a toy.",
				Arrays.asList(Categoria.ANIMATION,Categoria.COMEDY,Categoria.ADVENTURE)
				);
		Pelicula p4 = new Pelicula(
				"Toy Story 4", 
				new Director("Josh Cooley "), 
				"When a new toy called \"Forky\" joins Woody and the gang, a road trip alongside old and new friends reveals how big the world can be for a toy.",
				Arrays.asList(Categoria.ANIMATION,Categoria.COMEDY,Categoria.ADVENTURE)
				);
		Pelicula p5 = new Pelicula(
				"Toy Story 4", 
				new Director("Josh Cooley "), 
				"When a new toy called \"Forky\" joins Woody and the gang, a road trip alongside old and new friends reveals how big the world can be for a toy.",
				Arrays.asList(Categoria.ANIMATION,Categoria.COMEDY,Categoria.ADVENTURE)
				);
		Pelicula p6 = new Pelicula(
				"Toy Story 4", 
				new Director("Josh Cooley "), 
				"When a new toy called \"Forky\" joins Woody and the gang, a road trip alongside old and new friends reveals how big the world can be for a toy.",
				Arrays.asList(Categoria.ANIMATION,Categoria.COMEDY,Categoria.ADVENTURE)
				);
		Pelicula p7 = new Pelicula(
				"Toy Story 4", 
				new Director("Josh Cooley "), 
				"When a new toy called \"Forky\" joins Woody and the gang, a road trip alongside old and new friends reveals how big the world can be for a toy.",
				Arrays.asList(Categoria.ANIMATION,Categoria.COMEDY,Categoria.ADVENTURE)
				);
		Pelicula p8 = new Pelicula(
				"Toy Story 4", 
				new Director("Josh Cooley "), 
				"When a new toy called \"Forky\" joins Woody and the gang, a road trip alongside old and new friends reveals how big the world can be for a toy.",
				Arrays.asList(Categoria.ANIMATION,Categoria.COMEDY,Categoria.ADVENTURE)
				);
		Pelicula p9 = new Pelicula(
				"Toy Story 4", 
				new Director("Josh Cooley "), 
				"sinopsis",
				Arrays.asList(Categoria.ANIMATION,Categoria.COMEDY,Categoria.ADVENTURE)
				);
		
		gestor.altaPelicula(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9));
		gestor.updatePelicula(Arrays.asList(p9));
//		gestor.deletePelicula(Arrays.asList(p1.hashCode()));
		System.out.println(gestor.listaPelicula());
	}

}
