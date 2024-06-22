package br.com.java.dao;




import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Order;

import br.com.projeto.model.Model;

public  class Dao<T extends Model>{
	
	@Inject
	 EntityManager em;
	private Class<T> persistedClass;
	 public Dao(Class<T> persistedClass) {
	        this.persistedClass = persistedClass;
	    }

	
	public Dao(Object object, Object object2) {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Persiste um Objeto passado como parâmetro no banco de dados
	 * @param object
	 */
	public T insert(T model) {
		em.persist(model);
		return model;
	}
	public T selectPorId(T model) throws IdInvalidoException {
		int id = model.getId();
		return buscaPorId(id);
	}
	
	public T selectPorId(int id) throws IdInvalidoException {
		return buscaPorId(id);
	}

	private T buscaPorId(int id) throws IdInvalidoException {
		T model;
		model = em.find(this.persistedClass, id);
		
		//Verifica se o Registro esta inativo no banco de dados caso inativo estoura uma exception
		if(model == null) {
			
			throw new IdInvalidoException(
					"O Registro que tentou buscar, não existe no Banco de Dados! classe do registro:" + persistedClass.getSimpleName() + 
					" id do registro: "+id);

}
		return model;}
	public T selectPorId1(T model) throws IdInvalidoException {
		int id = model.getId();
		return buscaPorId(id);
	}
	
	public T selectPorId1(int id) throws IdInvalidoException {
		return buscaPorId(id);
	}
	private T buscaPorId1(int id) throws Throwable {
		T model;
		model = em.find(this.persistedClass, id);
		
		//Verifica se o Registro esta inativo no banco de dados caso inativo estoura uma exception
		if(model == null) {
			
			throw new IdInvalidoException(
					"O Registro que tentou buscar, não existe no Banco de Dados! classe do registro:" + persistedClass.getSimpleName() + 
					" id do registro: "+id);
		}	return model;}
	protected Order cbOrder(EOrdening ordening,Expression<?> x) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		if(ordening == EOrdening.ASC) {
			return cb.asc(x);
		}else if(ordening == EOrdening.DESC) {
			return cb.desc(x);
		}
		return null;
}
	
}
	
	
	
	
	
	