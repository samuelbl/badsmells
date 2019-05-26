package com.example.badsmells.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Departamento {
	@Id
	private Integer id;
	private String nomeDep;
	private String telefone;
	@ManyToOne
	private Empresa empresa;

	public String getNomeDep() {
		return nomeDep;
	}

	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Departamento() {
		
	}

	public Departamento(Integer id, String nomeDep, String telefone, Empresa empresa) {
		super();
		this.id = id;
		this.nomeDep = nomeDep;
		this.telefone = telefone;
		this.empresa = empresa;
	}

}
