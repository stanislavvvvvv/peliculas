package com.sopra.java.patterns.model.dao;


import java.util.Collection;
import java.util.List;

import com.sopra.java.patterns.model.entities.Aula;

public class MemoryListAulaDao implements IDao<Aula>{
//	private Map<String,Aula> miListaDeAulas;
	private List<Aula> miListaDeAulas;
	@Override
	public void insert(Aula aula) {
		//TODO Validar si existe el aula
		if (!miListaDeAulas.contains(aula)) {
			miListaDeAulas.add(aula);
		}
	}

	@Override
	public Aula update(Aula aula) {
		// TODO Auto-generated method stub
		//Con las colecciones no tienes informacion y no puedes hacer get ya que no sabes si es una lista o un set
		//asi que sacas el iterator
		if(miListaDeAulas.contains(aula)) {
			miListaDeAulas.remove(aula);
			//el remove busca el hash con el equals del nombre y lo elimina
			// asi añade el objeto con el mismo nombre pero campos cambiados
			miListaDeAulas.add(aula);
			return aula;
		}
		return null;
	}

	@Override
	public void delete(Aula aula) {
		// TODO Auto-generated method stub
		miListaDeAulas.remove(aula);
	}

	@Override
	public Collection<Aula> list() {
		// TODO Auto-generated method stub
		return miListaDeAulas;
	}

	@Override
	public Aula searchByName(Aula aula) {
		// TODO Auto-generated method stub
		if( miListaDeAulas.contains(aula)) {
			int indexOf = miListaDeAulas.indexOf(aula);
			Aula aulaEncontrada = miListaDeAulas.get(indexOf);
			return aulaEncontrada;
		}
		return null;
	}

		
}
