package br.com.letscode.controller;

import br.com.letscode.entity.Professor;
import br.com.letscode.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @RequestMapping("/professores")
    public Iterable<Professor> buscarProfessores(){
        Iterable<Professor> professores = professorRepository.findAll();
        return professores;
    }
}
