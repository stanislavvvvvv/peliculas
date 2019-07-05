package ejercicioDao;

import java.util.Collection;
import java.util.Map;

import ejercicio.modelo.Pelicula;

public class MemoryDao implements IDao<Pelicula>{
	private Map<Integer,Pelicula> miMapa;
	

	public MemoryDao(Map<Integer, Pelicula> miMapa) {
		super();
		this.miMapa = miMapa;
	}

	public void create(Pelicula pelicula) {
		miMapa.putIfAbsent(pelicula.hashCode(), pelicula);
	}

	public Collection<Pelicula> read() {
		return miMapa.values();
	}

	public void update(Pelicula pelicula) {
		miMapa.replace(pelicula.hashCode(), pelicula);
	}

	public void delete(Pelicula pelicula) {
		miMapa.remove(pelicula.hashCode());
	}

	public Pelicula readById(Integer id) {
		return miMapa.get(id);
	}

}
