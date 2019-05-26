package com.example.badsmells.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.badsmells.model.Empresa;
import com.example.badsmells.repository.EmpresaDAO;


@Controller
public class EmpresaController {
	
	@Autowired
	private EmpresaDAO empresaDao;

	public void save(Empresa empresa) {
		empresaDao.save(empresa);
	}

}
