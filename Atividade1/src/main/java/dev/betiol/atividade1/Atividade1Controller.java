package dev.betiol.atividade1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/atividade1")
public class Atividade1Controller {

    @GetMapping(path = "/ola")
    public Atividade1Model Ola() {
        Atividade1Model teste = new Atividade1Model();
        teste.setParticipantes("Carlos, Alano, Marcos, José Carlos, Alana");
        teste.setRecursos("Material de aula, explicacoes do Jhonatan, documentacao do sprinboot, etc");
        teste.setSkills("Adquiridos conhecimentos de como expor um endpoint retornando um objeto. Aprendido importancias de utilizar notations no java");

        return teste;
    }
}
