package com.springmongodb.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongodb.mongodb.model.Funcionario;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {

}
