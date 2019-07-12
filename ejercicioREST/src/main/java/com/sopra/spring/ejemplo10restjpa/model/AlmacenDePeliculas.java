package com.sopra.spring.ejemplo10restjpa.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopra.spring.ejemplo10restjpa.model.entities.Pelicula;

public interface AlmacenDePeliculas extends JpaRepository<Pelicula,Integer>{

}
