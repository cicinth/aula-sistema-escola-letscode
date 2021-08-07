package br.com.letscode.controller;

import br.com.letscode.entity.Aluno;
import br.com.letscode.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @RequestMapping("/alunos")
    public Iterable<Aluno> buscarAlunos(){
        Iterable alunos = alunoRepository.findAll();
        return alunos;
    }
}
