package com.example.badsmells.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.badsmells.model.Departamento;

@Repository
public class DepartamentoDAOimpl {

	@Autowired
	EntityManager em;
	
	public List<Departamento> buscaDepartamentosPorNome(String nome){
		return null;
	}
	
}
