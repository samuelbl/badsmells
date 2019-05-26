package com.example.badsmells.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.badsmells.model.Empresa;

@Repository
public interface EmpresaDAO extends CrudRepository<Empresa, Integer>{

}
