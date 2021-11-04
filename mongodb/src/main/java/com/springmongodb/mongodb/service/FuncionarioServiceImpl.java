package com.springmongodb.mongodb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongodb.mongodb.model.Funcionario;
import com.springmongodb.mongodb.repository.FuncionarioRepository;


@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@Override
	public List<Funcionario> obterTodos() {
		return this.funcionarioRepository.findAll();
	}

	@Override
	public Funcionario obterPorCod(String cod) {
		return this.funcionarioRepository
				.findById(cod)
				.orElseThrow(() -> new IllegalArgumentException("Funcionário inexistente!"));
	}

	@Override
	public Funcionario criar(Funcionario funcionario) {
		
		Funcionario gestor = 
			this.funcionarioRepository
				.findById(funcionario.getGestor().getId())
				.orElseThrow(() -> new IllegalArgumentException("gestor inexistente"));
		funcionario.setGestor(gestor);
		
		return this.funcionarioRepository.save(funcionario);
	}
	
	
}
