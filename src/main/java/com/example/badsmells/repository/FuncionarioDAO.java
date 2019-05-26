package com.example.badsmells.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.badsmells.model.Funcionario;

@Repository
public interface FuncionarioDAO extends CrudRepository<Funcionario, Integer>{

}
