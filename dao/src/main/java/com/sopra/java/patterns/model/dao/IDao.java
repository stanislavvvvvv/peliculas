package com.sopra.java.patterns.model.dao;

//Tipo T tipo generico
public interface IDao<T> extends IGenericDao<T> {
	T searchByName(T t);
}
