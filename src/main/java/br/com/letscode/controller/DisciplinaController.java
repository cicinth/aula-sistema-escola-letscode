package br.com.letscode.controller;

import br.com.letscode.entity.Disciplina;
import br.com.letscode.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisciplinaController {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @RequestMapping("/disciplinas")
    public Iterable<Disciplina> buscarDisciplinas(){
        Iterable<Disciplina> disciplinas = disciplinaRepository.findAll();
        return disciplinas;
    }
}
