package com.example.badsmells.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Fetch;

@Entity
public class Funcionario {
	@Id
	private Integer id;
	private String nome;
	private String sexo;
	private Integer idade;
	@ManyToOne(fetch=FetchType.LAZY) 
	private Departamento departamento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Funcionario() {
		
	}

	public Funcionario(Integer id, String nome, String sexo, Integer idade, Departamento departamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.departamento = departamento;
	}
}
