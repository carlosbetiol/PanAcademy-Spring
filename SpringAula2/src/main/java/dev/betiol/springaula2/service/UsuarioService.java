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

    public Usuario update(Integer id, Usuario obj) {
        Usuario newObj = findById(id);
        newObj.setNome(obj.getNome());
        newObj.setSenha(obj.getSenha());
        return repository.save(newObj);
    }

    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }

    public Usuario create(Usuario obj) {
        obj.setId(null);
        return repository.save(obj);
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }
}
