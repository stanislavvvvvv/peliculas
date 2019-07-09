package com.sopra.web.controllers;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ejercicioModelo.Categoria;
import ejercicioModelo.Director;
import ejercicioModelo.Pelicula;
import ejercicioNegocio.GestorPeliculas;

/**
 * Servlet implementation class MiControlador
 */
@WebServlet({"/pelicula","/huevos"})
public class MiControlador extends HttpServlet {
	private ApplicationContext context;
	private GestorPeliculas gestor ;
	
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Override
	public void init() throws ServletException {
		this.context = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		this.gestor= context.getBean(GestorPeliculas.class);
	}	
	

	public MiControlador() {
		super();
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// http://localhost:8080/ejemplo05web/pelicula?titulo="Toy Story
		// 4"&director="josh Cooley"&sinopsis="sinopsis"
		Pelicula p1 = context.getBean(Pelicula.class);
		p1.setTitulo(request.getParameter("titulo"));
		p1.setDirector(new Director(request.getParameter("director")));
		p1.setSinopsis(request.getParameter("sinopsis"));
		//Categoria categoria = Categoria.valueOf(request.getParameter("categoria").split(",").toUpperCase());
		p1.setCategorias(Arrays.asList(Categoria.ANIMATION, Categoria.COMEDY, Categoria.ADVENTURE));
		gestor.altaPelicula(Arrays.asList(p1));
		request.setAttribute("pelicula", "Lista de peliculas: " + gestor.listaPelicula());
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/pelicula.jsp").forward(request, response);
	}

	

}
