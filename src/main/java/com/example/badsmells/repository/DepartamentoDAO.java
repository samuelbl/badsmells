package com.example.badsmells.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.badsmells.model.Departamento;

@Repository
public interface DepartamentoDAO extends CrudRepository<Departamento, Integer>{

}
