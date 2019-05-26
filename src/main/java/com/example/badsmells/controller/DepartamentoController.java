package com.example.badsmells.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.badsmells.model.Departamento;
import com.example.badsmells.repository.DepartamentoDAO;

@Controller
public class DepartamentoController {
	
	@Autowired
	private DepartamentoDAO departamentoDao;
	
	public void save(Departamento departamento) {
		departamentoDao.save(departamento);
	}
}
