package com.example.badsmells;

import java.lang.reflect.GenericDeclaration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;

import com.example.badsmells.controller.DepartamentoController;
import com.example.badsmells.controller.EmpresaController;
import com.example.badsmells.model.Departamento;
import com.example.badsmells.model.Empresa;
import com.example.badsmells.model.Funcionario;
import com.example.badsmells.repository.FuncionarioDAO;

@SpringBootApplication
@ComponentScan
public class BadsmellsApplication {
	
	
	@Autowired
	static FuncionarioDAO funcionarioDao;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(BadsmellsApplication.class, args);
		
		Empresa empresa1 = new Empresa(1,"IFSC","rua xxx",null,012345);
		Empresa empresa2 = new Empresa(2,"UFSC","rua xxx",null,987456);
		Departamento depto1 = new Departamento(1,"DTIC","4879875465",empresa1);
		Departamento depto2 = new Departamento(2,"DGP","4879875465",empresa1);
		Funcionario func1 = new Funcionario(1, "samuel", "M", 32, depto1);
		
		EmpresaController empresaController = context.getBean(EmpresaController.class);
		empresaController.save(empresa1);
		System.out.println("Salvou empresa 1");

		empresaController.save(empresa2);
		System.out.println("Salvou empresa 2");
		
		DepartamentoController departamentoController = context.getBean(DepartamentoController.class);
		departamentoController.save(depto1);
		
		System.out.println("Salvou departamento 1");
		
		departamentoController.save(depto2);
		System.out.println("Salvou departamento 2");

		funcionarioDao = context.getBean(FuncionarioDAO.class);
		
		funcionarioDao.save(func1);
		System.out.println("Salvou funcionario 1");

		System.out.println("------------------------------------");
		System.out.println("Agora irá fazer a consulta no funcionário");
		
		Iterable<Funcionario> funcionarios = funcionarioDao.findAll();
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.getNome());
			funcionario.getDepartamento();
			System.out.println(funcionario.getDepartamento());
		}
		
	}
	

}
