package ejercicioNegocio;

import java.util.Collection;
import java.util.List;
import ejercicio.modelo.Pelicula;
import ejercicioDao.Factory;
import ejercicioDao.IDao;

public class GestorPeliculas {
	private IDao<Pelicula> daoPeliculas;
	
	public GestorPeliculas() {
		super();
		this.daoPeliculas = Factory.getDaoPeliculas();
	}
	
	public void altaPelicula(List<Pelicula> peliculas) {
		for (Pelicula pelicula : peliculas)
			daoPeliculas.create(pelicula);
	}
	public Collection<Pelicula> listaPelicula() {
		return daoPeliculas.read();
	}
	public void updatePelicula(List<Pelicula> peliculas) {
		for (Pelicula pelicula : peliculas)
			daoPeliculas.update(pelicula);
	}
	public void deletePelicula(List<Integer> ids) {
		for (Integer id : ids)
			daoPeliculas.delete(daoPeliculas.readById(id));
	}
}
