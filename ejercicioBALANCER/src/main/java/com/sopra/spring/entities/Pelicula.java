package com.sopra.spring.entities;

import java.util.List;

public class Pelicula {
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Integer id;
	private String titulo;
	private Director director;
	private String sinopsis;
	private List<Categoria> categorias;
	
	public Pelicula(String titulo, Director director, String sinopsis, List<Categoria> categorias) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.sinopsis = sinopsis;
		this.categorias = categorias;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	@Override
	public String toString() {
		return "Pelicula titulo=" + titulo +", " + "director= " + director + " , " + "sinopsis = " + sinopsis + ", "+ "categorias = " + categorias + ". ";
	}
	

}
