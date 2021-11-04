package com.springmongodb.mongodb.service;

import java.util.List;

import com.springmongodb.mongodb.model.Funcionario;

public interface FuncionarioService {
	
	public List<Funcionario> obterTodos();
	
	public Funcionario obterPorCod(String cod);
	
	public Funcionario criar(Funcionario medico);
}
