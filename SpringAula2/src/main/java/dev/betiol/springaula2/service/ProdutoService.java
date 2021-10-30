package dev.betiol.springaula2.service;

import dev.betiol.springaula2.model.Produto;
import dev.betiol.springaula2.model.Usuario;
import dev.betiol.springaula2.repositories.ProdutoRepository;
import dev.betiol.springaula2.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto findById(Integer id) {
        Optional<Produto> obj = repository.findById(id);
        return obj.orElse(null);
    }

    public Produto update(Integer id, Produto obj) {
        Produto newObj = findById(id);
        newObj.setNome(obj.getNome());
        return repository.save(newObj);
    }

    public void delete(Integer id) {
        findById(id);
        repository.deleteById(id);
    }

    public Produto create(Produto obj) {
        obj.setId(null);
        return repository.save(obj);
    }

    public List<Produto> findAll() {
        return repository.findAll();
    }
}
