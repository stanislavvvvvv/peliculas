package com.sopra.spring.ejemplo10restjpa.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sopra.spring.ejemplo10restjpa.model.AlmacenDeDirectores;
import com.sopra.spring.ejemplo10restjpa.model.AlmacenDePeliculas;
import com.sopra.spring.ejemplo10restjpa.model.entities.Categoria;
import com.sopra.spring.ejemplo10restjpa.model.entities.Director;
import com.sopra.spring.ejemplo10restjpa.model.entities.Pelicula;

@Configuration
public class SpringConfiguration {
	@Bean
	public CommandLineRunner iniciarBaseDeDatos(AlmacenDePeliculas almacen,AlmacenDeDirectores almacen1) {
		return args ->{
			Director director = new Director("director 1");
			Director director2 = new Director("director 3");
			Director director3 = new Director("director 4");
			almacen1.save(director);
			almacen1.save(director2);
			almacen1.save(director3);
			almacen.save(new Pelicula("Pelicula 1", director, "sinopsis 1",Arrays.asList(Categoria.ACTION,Categoria.ADVENTURE)));
			almacen.save(new Pelicula("Pelicula 2",director, "sinopsis 2",Arrays.asList(Categoria.ACTION,Categoria.ADVENTURE)));
			almacen.save(new Pelicula("Pelicula 3",director2, "sinopsis 3",Arrays.asList(Categoria.ACTION,Categoria.ADVENTURE)));
			almacen.save(new Pelicula("Pelicula 4",director3, "sinopsis 4",Arrays.asList(Categoria.ACTION,Categoria.ADVENTURE)));
		};
	}

}
