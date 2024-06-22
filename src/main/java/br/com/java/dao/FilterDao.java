package br.com.java.dao;

import java.util.List;

import javax.persistence.EntityManager;

public class FilterDao<T> {

	public FilterDao(EntityManager em, Class<T> persistedClass) {
		// TODO Auto-generated constructor stub
	}

	public List<T> filter(Object model) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long total(Object model) {
		// TODO Auto-generated method stub
		return null;
	}

}
