package com.sopra.spring.ejercicioBalancer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.sopra.spring.entities.Director;
import com.sopra.spring.entities.Pelicula;

@Controller
public class Controlador {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("pelicula",new Pelicula());
		return "pelicula";
	}
	@RequestMapping("/listadoDePeliculas")
	public String listadoDePeliculas(Model model) {
		String urlAcceso="http://ejercicioREST/peliculas";
		ResponseEntity<List> listaDePeliculas = restTemplate.exchange(urlAcceso, HttpMethod.GET , null, List.class);
		List peliculas = listaDePeliculas.getBody();
		model.addAttribute("peliculas", peliculas);
		return "peliculas";
	}
	@RequestMapping("/nuevaPelicula")
	public String altaPelicula(
			@RequestParam("titulo") String titulo,
			@RequestParam("director") String director,
			@RequestParam("sinopsis") String sinopsis,
			Model model) {
		Pelicula pelicula = new Pelicula(titulo,new Director(director),sinopsis,null);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Pelicula> httpEntity = new HttpEntity<Pelicula>(pelicula,httpHeaders);
		
		String urlAcceso="http://ejercicioREST/peliculas";
		ResponseEntity<Pelicula> entity = restTemplate.exchange(urlAcceso,
				HttpMethod.POST,
				httpEntity,
				Pelicula.class);
		Pelicula peliculaAlmacenada = entity.getBody();
		model.addAttribute("pelicula",peliculaAlmacenada);
		
		return "pelicula";
	}
}
