package ejercicioDao;

import java.util.Collection;

public interface IDao<T> {
	void create(T pelicula);
	Collection<T> read();
	void update(T pelicula);
	void delete(T pelicula);
	T readById(Integer id);
}
