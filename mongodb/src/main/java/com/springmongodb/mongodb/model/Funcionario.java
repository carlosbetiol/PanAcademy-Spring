package com.springmongodb.mongodb.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document() // registro de um colecao
public class Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String nome;
	private Double salario;

	@DBRef // referencia de collection dentro de outra
	private Funcionario gestor;

	public Funcionario() {
		super();
	}

	public Funcionario(String id, String nome, Double salario, Funcionario gestor) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.gestor = gestor;
	}
	
	public Funcionario(String id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Funcionario getGestor() {
		return gestor;
	}

	public void setGestor(Funcionario gestor) {
		this.gestor = gestor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, salario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(gestor, other.gestor) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(salario, other.salario);
	}

}
