package ejercicioNegocio;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejercicioDao.IDao;
import ejercicioModelo.Pelicula;

@Service
public class GestorPeliculas {
	@Autowired
	private IDao<Pelicula> daoPeliculas;
	
	
	public IDao<Pelicula> getDaoPeliculas() {
		return daoPeliculas;
	}
	public void setDaoPeliculas(IDao<Pelicula> daoPeliculas) {
		this.daoPeliculas = daoPeliculas;
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
