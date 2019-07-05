package ejercicioDao;


import java.util.HashMap;
import ejercicio.modelo.Pelicula;

public class Factory {
	private static IDao<Pelicula> daoPelicula;

	public static IDao<Pelicula> getDaoPeliculas(){
		if(daoPelicula == null) {
			daoPelicula = new MemoryDao(new HashMap<Integer, Pelicula>());
		}
		return daoPelicula;
	}
}
