package com.example.badsmells.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empresa {
	@Id
	private Integer id;
	private String nome;
	private String endereco;
	private String email;
	private Integer cnpj;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getCnpj() {
		return cnpj;
	}
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Empresa() {
		
	}
	public Empresa(Integer id, String nome, String endereco, String email, Integer cnpj) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.cnpj = cnpj;
	}
}
