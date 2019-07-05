package com.sopra.java.patterns.model.dao;

import java.util.Collection;
import java.util.Map;

import com.sopra.java.patterns.model.entities.Aula;

public class MemoryMapDao implements IDao<Aula>{
	
	private Map<String,Aula> miMapa;
	
	
	public MemoryMapDao(Map<String, Aula> miMapa) {
		super();
		this.miMapa = miMapa;
	}

	@Override
	public void insert(Aula aula) {
		// TODO Auto-generated method stub
		miMapa.putIfAbsent(aula.getNombre(), aula);
	}

	@Override
	public Aula update(Aula aula) {
		// TODO Auto-generated method stub
		miMapa.replace(aula.getNombre(), aula);
		return aula;
	}

	@Override
	public void delete(Aula aula) {
		// TODO Auto-generated method stub
		miMapa.remove(aula.getNombre());
	}

	@Override
	public Collection<Aula> list() {
		// TODO Auto-generated method stub
		return miMapa.values();
	}

	@Override
	public Aula searchByName(Aula aula) {
		// TODO Auto-generated method stub
		if(miMapa.containsKey(aula.getNombre())) {
			return aula;
		}
		return null;
	}

}
