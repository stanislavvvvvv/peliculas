package com.sopra.java.patterns.model.dao;

import java.util.Collection;
import java.util.Set;

import com.sopra.java.patterns.model.entities.Aula;

public class MemorySetDao implements IDao<Aula>{
	private Set<Aula> miSet;
	@Override
	public void insert(Aula aula) {
		// TODO Auto-generated method stub
		miSet.add(aula);
	}

	@Override
	public Aula update(Aula aula) {
		// TODO Auto-generated method stub
		if(miSet.contains(aula)) {
			miSet.remove(aula);
			//el remove busca el hash con el equals del nombre y lo elimina
			// asi añade el objeto con el mismo nombre pero campos cambiados
			miSet.add(aula);
			return aula;
		}
		return null;
	}

	@Override
	public void delete(Aula aula) {
		// TODO Auto-generated method stub
		miSet.remove(aula);
	}

	@Override
	public Collection<Aula> list() {
		// TODO Auto-generated method stub
		return miSet;
	}

	@Override
	public Aula searchByName(Aula aula) {
		// TODO Auto-generated method stub
		if(miSet.contains(aula)) {
			for(Aula aulaActual : miSet) {
				if(aulaActual.equals(aula)) {
					return aula;
				}
			}
		}
		return null;
	}

}
