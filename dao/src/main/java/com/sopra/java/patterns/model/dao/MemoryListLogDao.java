package com.sopra.java.patterns.model.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.sopra.java.patterns.model.entities.LineaDeLog;

public class MemoryListLogDao implements IMultipleDao<LineaDeLog,Integer>{
	private List<LineaDeLog> almacenDeLogs;
	
	public MemoryListLogDao(List<LineaDeLog> almacenDeLogs) {
		super();
		this.almacenDeLogs = almacenDeLogs;
	}

	@Override
	public void insert(LineaDeLog log) {
		// TODO Auto-generated method stub
		if(!almacenDeLogs.contains(log)) {
			almacenDeLogs.add(log);
		}
	}

	@Override
	public LineaDeLog update(LineaDeLog log) {
		// TODO Auto-generated method stub
		if(almacenDeLogs.contains(log)) {
			int indexOf = almacenDeLogs.indexOf(log);
			//el remove busca el hash con el equals del nombre y lo elimina
			// asi añade el objeto con el mismo nombre pero campos cambiados
			almacenDeLogs.add(indexOf,log);
			return log;
		}
		return null;
	}

	@Override
	public void delete(LineaDeLog log) {
		// TODO Auto-generated method stub
		almacenDeLogs.remove(log);
		
	}

	@Override
	public Collection<LineaDeLog> list() {
		// TODO Auto-generated method stub
		return almacenDeLogs;
	}

	@Override
	public List<LineaDeLog> searchByNames(String name) {
		// TODO Auto-generated method stub
		List<LineaDeLog> listaDeLogs = new ArrayList<LineaDeLog>();
		for(LineaDeLog linea:almacenDeLogs) {
			if(linea.getNombre().equals(name))
				listaDeLogs.add(linea);
		}
		return listaDeLogs;
	}

	@Override
	//127 integers iguales asi que a partir de 128 el == dos valores iguals devolver false
	public LineaDeLog searchById(Integer id) {
		// TODO Auto-generated method stub
		for (int i = 0; i < almacenDeLogs.size(); i++) {
			if(almacenDeLogs.get(i).getId().equals(id))
				return almacenDeLogs.get(i);
		}
		return null;
	}


}
