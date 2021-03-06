package com.sopra.spring.ejemplo10restjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.spring.ejemplo10restjpa.model.AlmacenDeDirectores;
import com.sopra.spring.ejemplo10restjpa.model.AlmacenDePeliculas;
import com.sopra.spring.ejemplo10restjpa.model.entities.Pelicula;

@RestController
public class ServicioDePeliculas {
	@Autowired
	private AlmacenDePeliculas almacen;
	@Autowired
	private AlmacenDeDirectores almacen1;
	
	public AlmacenDePeliculas getAlmacen() {
		return almacen;
	}
	public void setAlmacen(AlmacenDePeliculas almacen) {
		this.almacen = almacen;
	}
	
	@GetMapping("/peliculas")
	public List<Pelicula> peliculas(){
		return almacen.findAll();
	}
	@GetMapping("/peliculas/{id}")
	public Pelicula pelicula(@PathVariable Integer id) {
		return almacen.findById(id).orElse(null);
	}
	@PostMapping("/peliculas")
	public Pelicula nuevoPeliculaEnElInventario(@RequestBody Pelicula pelicula) {
		almacen1.save(pelicula.getDirector());
		return almacen.save(pelicula);
	}
	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarPelicula(@RequestBody Pelicula pelicula,@PathVariable Integer id) {
		
		return almacen.findById(id).map(clienteEncontrado -> {
			clienteEncontrado.setTitulo(pelicula.getTitulo());;
			clienteEncontrado.setSinopsis(pelicula.getSinopsis());;
			clienteEncontrado.setDirector(pelicula.getDirector());
			clienteEncontrado.setCategorias(pelicula.getCategorias());
			return almacen.save(clienteEncontrado);
		}).orElseGet(()->{
			pelicula.setId(id);;
			return almacen.save(pelicula);
		});
	}
	@DeleteMapping("/peliculas/{id}") 
	public void venderPelicula(@PathVariable Integer id) {
		almacen.deleteById(id);
	}
}
