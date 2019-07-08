package ejercicioDao;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ejercicioModelo.Pelicula;

@Repository
public class MemoryDao implements IDao<Pelicula>{
	@Autowired
	@Qualifier("mapa")
	private Map<Integer,Pelicula> miMapa;
	

	public Map<Integer, Pelicula> getMiMapa() {
		return miMapa;
	}

	public void setMiMapa(Map<Integer, Pelicula> miMapa) {
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
