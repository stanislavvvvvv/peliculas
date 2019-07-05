package com.sopra.java.patterns.model.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.sopra.java.patterns.model.entities.Persona;

public class MemoryMapPersonaDao implements IMultipleDao<Persona,String>{
	private HashMap<String, Persona> miMapa;
	
	public MemoryMapPersonaDao(HashMap<String, Persona> miMapa) {
		super();
		this.miMapa = miMapa;
	}

	@Override
	public void insert(Persona t) {
		// TODO Auto-generated method stub
		miMapa.putIfAbsent(t.getDni(), t);
	}

	@Override
	public Persona update(Persona t) {
		// TODO Auto-generated method stub
		if(miMapa.replace(t.getDni(), t)!=null)
			return t;
		return null;
	}

	@Override
	public void delete(Persona t) {
		// TODO Auto-generated method stub
		miMapa.remove(t.getDni());
	}

	@Override
	public Collection<Persona> list() {
		// TODO Auto-generated method stub
		return miMapa.values();
	}

	@Override
	public List<Persona> searchByNames(String name) {
		// TODO Auto-generated method stub
		List<Persona> lista = new ArrayList<Persona>();
		for(Persona persona:miMapa.values())
			if(persona.getNombre().equals(name))
				lista.add(persona);
		return lista;
	}

	@Override
	public Persona searchById(String id) {
		// TODO Auto-generated method stub
		return miMapa.get(id);
	}


}
