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
				new Director("Josh Cooley"), 
				"When a new toy called \"Forky\" joins Woody and the gang, a road trip alongside old and new friends reveals how big the world can be for a toy.",
				Arrays.asList(Categoria.ANIMATION,Categoria.COMEDY,Categoria.ADVENTURE)
				);
		Pelicula p2 = new Pelicula(
				"peli 2", 
				new Director("director 2"), 
				"sinopsis 2",
				Arrays.asList(Categoria.ANIMATION)
				);
		Pelicula p3 = new Pelicula(
				"peli 3", 
				new Director("director 3"), 
				"director 3",
				Arrays.asList(Categoria.COMEDY,Categoria.ADVENTURE)
				);
		Pelicula p4 = new Pelicula(
				"peli 4", 
				new Director("dirctor 4"), 
				"sinopsis 4",
				Arrays.asList(Categoria.ADVENTURE)
				);
		Pelicula p5 = new Pelicula(
				"peli 5", 
				new Director("dircetor 5"), 
				"sinopss 5",
				Arrays.asList(Categoria.CRIME,Categoria.DOCUMENTARY)
				);
		Pelicula p6 = new Pelicula(
				"peli 6", 
				new Director("director 6"), 
				"sinopsis 6",
				Arrays.asList(Categoria.FAMILY,Categoria.DRAMA)
				);
		Pelicula p7 = new Pelicula(
				"peli 7", 
				new Director("director 7"), 
				"sinopsis 7",
				Arrays.asList(Categoria.SUPERHERO,Categoria.SCIFI)
				);
		Pelicula p8 = new Pelicula(
				"Toy Story 3", 
				new Director("Josh Cooley "), 
				"algo",
				Arrays.asList(Categoria.ANIMATION)
				);
		Pelicula p9 = new Pelicula(
				"peli 9", 
				new Director("director 9"), 
				"sinopsis 9 ",
				Arrays.asList(Categoria.FANTASY,Categoria.WAR)
				);
		Pelicula p0 = new Pelicula(
				"peli 10", 
				new Director("director 10"), 
				"sinopsis 10",
				Arrays.asList(Categoria.MUSIC,Categoria.FAMILY)
				);
		
		gestor.altaPelicula(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p0));
		System.out.println(gestor.listaPelicula());
		
		Pelicula modificar1 = new Pelicula(
				"peli 9", 
				new Director("director 9"), 
				"sinopsis 9 MODIFICADA",
				Arrays.asList(Categoria.MUSIC,Categoria.FAMILY,Categoria.DOCUMENTARY)
				);
		Pelicula modificar2 = new Pelicula(
				"peli 10", 
				new Director("director 10"), 
				"sinopsis 10 MODIFICADA",
				Arrays.asList(Categoria.MUSIC,Categoria.FAMILY,Categoria.FANTASY)
				);
		gestor.updatePelicula(Arrays.asList(modificar1,modificar2));
		System.out.println(gestor.listaPelicula());
		
		gestor.deletePelicula(Arrays.asList(p1.hashCode(),p2.hashCode()));
		System.out.println(gestor.listaPelicula());
	
	}

}
