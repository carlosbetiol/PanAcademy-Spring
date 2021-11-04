package dev.betiol.springaula2;

import dev.betiol.springaula2.model.Produto;
import dev.betiol.springaula2.model.Usuario;
import dev.betiol.springaula2.repositories.ProdutoRepository;
import dev.betiol.springaula2.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
//public class SpringAula2Application implements CommandLineRunner {
public class SpringAula2Application {

//    @Autowired
//    UsuarioRepository usuarioRepository;
//
//    @Autowired
//    ProdutoRepository produtoRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringAula2Application.class, args);
    }

    //    @Override
//    public void run(String... args) throws Exception {
//
//        Usuario u1 = new Usuario("Maria Silva", "1234");
//        Usuario u2 = new Usuario("Joao da Silva", "1234");
//        usuarioRepository.saveAll(Arrays.asList(u1, u2));
//
//        Produto p1 = new Produto("Impressora Epson lx300");
//        Produto p2 = new Produto("Monitor Dell 2564");
//        produtoRepository.saveAll(Arrays.asList(p1, p2));
//
//    }
}
