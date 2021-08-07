package br.com.letscode.controller;

import br.com.letscode.entity.Aluno;
import br.com.letscode.entity.CursoDisciplinaProfessor;
import br.com.letscode.repository.AlunoRepository;
import br.com.letscode.repository.CursoDisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoDisciplinaProfessorController {

    @Autowired
    private CursoDisciplinaRepository cursoDisciplinaRepository;

    @RequestMapping("/cursoDisciplinas")
    public Iterable<CursoDisciplinaProfessor> buscarCursoDisciplinas(){
        Iterable<CursoDisciplinaProfessor> cursoDisciplinas = cursoDisciplinaRepository.findAll();
        return cursoDisciplinas;
    }
}
