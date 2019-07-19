package ejercicioMVC;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ejercicioModelo.Categoria;
import ejercicioModelo.Director;
import ejercicioModelo.Pelicula;
import ejercicioNegocio.GestorPeliculas;

@Controller
@Scope("request")
public class PeliculasController {
	@Autowired
	private GestorPeliculas gestor;

	@RequestMapping("alta")
	public ModelAndView verFormulario() {
		return new ModelAndView("formularioSpringMVC");
	}

	@RequestMapping("muestramelo")
	public ModelAndView muestramelo(@RequestParam("titulo") String titulo, @RequestParam("director") String director,
			@RequestParam("sinopsis") String sinopsis, @RequestParam("categorias") String categorias) {
		Pelicula pelicula = new Pelicula();
		pelicula.setTitulo(titulo);
		pelicula.setDirector(new Director(director));
		pelicula.setSinopsis(sinopsis);
		pelicula.setCategorias(Arrays.asList(Categoria.ACTION, Categoria.ADVENTURE));
		gestor.altaPelicula(Arrays.asList(pelicula));
		ModelAndView modelAndView = new ModelAndView("listaPeliculas");
		modelAndView.addObject("lista",gestor.listaPelicula());
		return modelAndView;
	}
}
