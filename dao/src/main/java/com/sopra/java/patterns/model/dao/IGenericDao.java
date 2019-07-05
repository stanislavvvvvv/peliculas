package com.sopra.java.patterns.model.dao;

import java.util.Collection;

public interface IGenericDao<T> {

	void insert(T t);

	T update(T t);

	void delete(T t);

	Collection<T> list();

}