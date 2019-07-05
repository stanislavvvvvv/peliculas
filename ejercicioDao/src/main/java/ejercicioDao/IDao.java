package ejercicioDao;

import java.util.Collection;

import ejercicio.modelo.Pelicula;

public interface IDao<Pelicula> {
	void create(Pelicula pelicula);
	Collection<Pelicula> read();
	void update(Pelicula pelicula);
	void delete(Pelicula pelicula);
	Pelicula readById(Integer id);
}
