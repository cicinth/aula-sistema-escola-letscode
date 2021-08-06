package br.com.letscode;

import br.com.letscode.controller.ProfessorController;
import br.com.letscode.entity.*;

import java.sql.Date;

public class Main {
    public static void main(String[] args){

        Professor professor = new Professor(87845, "Joao");
        ProfessorController.cadastraProfessor(professor);

        Curso curso = new Curso(123213, "ADS", 1, 20, Modalidade.PRESENCIAL);

        Disciplina disciplina = new Disciplina( 2123,
                "banco", 10, 20);

        Aluno aluno = new Aluno(1212, "maria", "silva",
                new Date(19990405), curso);


    }
}
