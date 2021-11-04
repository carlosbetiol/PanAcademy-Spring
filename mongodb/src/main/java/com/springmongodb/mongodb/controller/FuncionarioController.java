package com.springmongodb.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongodb.mongodb.model.Funcionario;
import com.springmongodb.mongodb.service.FuncionarioService;

@RestController
@RequestMapping(path = "/funcionarios")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;

	@GetMapping
	public List<Funcionario> obterTodos() {
		return this.funcionarioService.obterTodos();
}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Funcionario> obterPorCodigo(@PathVariable String id) {
		Funcionario obj = this.funcionarioService.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Funcionario criar(@RequestBody Funcionario funcionario) {
		return this.funcionarioService.criar(funcionario);
	}
	
}
