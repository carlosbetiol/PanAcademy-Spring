package dev.betiol.springaula2.service;

import dev.betiol.springaula2.model.Usuario;
import dev.betiol.springaula2.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario findById(Integer id) {
        Optional<Usuario> obj = repository.findById(id);
        return obj.orElse(null);
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }
}
