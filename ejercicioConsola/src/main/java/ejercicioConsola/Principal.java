package ejercicioConsola;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ejercicio.modelo.Categoria;
import ejercicio.modelo.Director;
import ejercicio.modelo.Pelicula;
import ejercicioNegocio.GestorPeliculas;

public class Principal {

	private static ApplicationContext context = new ClassPathXmlApplicationContext("main.xml");
	private static GestorPeliculas gestor = context.getBean("gestor",GestorPeliculas.class);
	
	public static void main(String[] args) {
		
		
		Pelicula p1 = context.getBean("pelicula",Pelicula.class);
		p1.setTitulo("Toy Story 4");
		p1.setDirector(new Director("Josh Cooley"));
		p1.setSinopsis("When a new toy called \\\"Forky\\\" joins Woody and the gang, a road trip alongside old and new friends reveals how big the world can be for a toy.");
		p1.setCategorias(Arrays.asList(Categoria.ANIMATION,Categoria.COMEDY,Categoria.ADVENTURE));
		
		Pelicula p2 = context.getBean("pelicula",Pelicula.class);
		p2.setTitulo("peli 2"); 
		p2.setDirector(new Director("director 2"));
		p2.setSinopsis("sinopsis 2");
		p2.setCategorias(Arrays.asList(Categoria.ANIMATION));
		
		Pelicula p3 = context.getBean("pelicula",Pelicula.class);
		p3.setTitulo("peli 3"); 
		p3.setDirector(new Director("director 3"));
		p3.setSinopsis("sinopsis 3");
		p3.setCategorias(Arrays.asList(Categoria.ANIMATION));
		
		Pelicula p4 = context.getBean("pelicula",Pelicula.class);
		p4.setTitulo("peli 4"); 
		p4.setDirector(new Director("director 4"));
		p4.setSinopsis("sinopsis 4");
		p4.setCategorias(Arrays.asList(Categoria.ANIMATION));
		
		Pelicula p5 = context.getBean("pelicula",Pelicula.class);
		p5.setTitulo("peli 5"); 
		p5.setDirector(new Director("director 5"));
		p5.setSinopsis("sinopsis 5");
		p5.setCategorias(Arrays.asList(Categoria.ANIMATION));
		
		Pelicula p6 = context.getBean("pelicula",Pelicula.class);
		p6.setTitulo("peli 6"); 
		p6.setDirector(new Director("director 6"));
		p6.setSinopsis("sinopsis 6");
		p6.setCategorias(Arrays.asList(Categoria.ANIMATION));
	
		Pelicula p7 = context.getBean("pelicula",Pelicula.class);
		p7.setTitulo("peli 7"); 
		p7.setDirector(new Director("director 7"));
		p7.setSinopsis("sinopsis 7");
		p7.setCategorias(Arrays.asList(Categoria.ANIMATION));
		
		Pelicula p8 = context.getBean("pelicula",Pelicula.class);
		p8.setTitulo("peli 8"); 
		p8.setDirector(new Director("director 8"));
		p8.setSinopsis("sinopsis 8");
		p8.setCategorias(Arrays.asList(Categoria.ANIMATION));

		Pelicula p9 = context.getBean("pelicula",Pelicula.class);
		p9.setTitulo("peli 9"); 
		p9.setDirector(new Director("director 9"));
		p9.setSinopsis("sinopsis 9");
		p9.setCategorias(Arrays.asList(Categoria.ANIMATION));
		
		Pelicula p0 = context.getBean("pelicula",Pelicula.class);
		p0.setTitulo("peli 10"); 
		p0.setDirector(new Director("director 10"));
		p0.setSinopsis("sinopsis 10");
		p0.setCategorias(Arrays.asList(Categoria.ANIMATION));
		
		gestor.altaPelicula(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p0));
		System.out.println(gestor.listaPelicula());
		
		Pelicula modificar1 = context.getBean("pelicula",Pelicula.class);
		modificar1.setTitulo("peli 9"); 
		modificar1.setDirector(new Director("director 9"));
		modificar1.setSinopsis("sinopsis 9 MODIFICADA");
		modificar1.setCategorias(Arrays.asList(Categoria.MUSIC,Categoria.FAMILY,Categoria.DOCUMENTARY));
		
		Pelicula modificar2 = context.getBean("pelicula",Pelicula.class);
		modificar2.setTitulo("peli 8"); 
		modificar2.setDirector(new Director("director 8"));
		modificar2.setSinopsis("sinopsis 8 MODIFICADA");
		modificar2.setCategorias(Arrays.asList(Categoria.MUSIC,Categoria.FAMILY,Categoria.DOCUMENTARY));
		
		gestor.updatePelicula(Arrays.asList(modificar1,modificar2));
		System.out.println(gestor.listaPelicula());
		
		gestor.deletePelicula(Arrays.asList(p1.hashCode(),p2.hashCode()));
		System.out.println(gestor.listaPelicula());
	
	}

}
