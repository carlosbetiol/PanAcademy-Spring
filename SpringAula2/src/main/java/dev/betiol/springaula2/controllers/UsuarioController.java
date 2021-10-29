package dev.betiol.springaula2.controllers;

import dev.betiol.springaula2.model.Usuario;
import dev.betiol.springaula2.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path= "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Integer id){
        Usuario obj = this.service.findById(id);
        return ResponseEntity.ok().body(obj);
    };

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll() {
        List<Usuario> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Integer id, @RequestBody
            Usuario obj) {
        Usuario newObj = service.update(id, obj);
        return ResponseEntity.ok().body(newObj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Usuario> create(@RequestBody Usuario obj){
        Usuario newObj = service.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(newObj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

}
