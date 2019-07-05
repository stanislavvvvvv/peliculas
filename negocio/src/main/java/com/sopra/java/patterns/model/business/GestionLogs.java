package com.sopra.java.patterns.model.business;

import java.util.ArrayList;
import java.util.List;

import com.sopra.java.patterns.Factory;
import com.sopra.java.patterns.model.dao.IGenericDao;
import com.sopra.java.patterns.model.entities.LineaDeLog;

public class GestionLogs {
	private IGenericDao<LineaDeLog> miDaoDeLogs;
	
	public GestionLogs() {
		super();
		miDaoDeLogs = Factory.getDaoDeLog();
		// TODO Auto-generated constructor stub
	}

	public List<LineaDeLog> getLogs() {
		return new ArrayList<LineaDeLog>(miDaoDeLogs.list());
	}
}
