package com.example.badsmells.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.badsmells.model.Funcionario;

@Transactional
@Repository
public class FuncionarioDAOImpl  {

	@PersistenceContext	
	private EntityManager entityManager;	

	
	
	public Iterable<Funcionario> findAll() {
		String hql = "select func FROM Funcionario func "
				+ "join fetch func.departamento dep "
				+ "join fetch dep.empresa emp";
		return (List<Funcionario>) entityManager.createQuery(hql).getResultList();
	}



	public void save(Funcionario func1) {
		entityManager.persist(func1);
	}
	
	public void update(Funcionario func1) {
		entityManager.merge(func1);
	}
	
	public void flush() {
		entityManager.flush();
	}
	
	public void close() {
		entityManager.close();
	}

	

}
