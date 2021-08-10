package br.com.letscode.response;

import br.com.letscode.entity.Aluno;
import br.com.letscode.entity.Professor;
import lombok.Getter;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ProfessorResponse {
    @Getter private int registro_professor;
    @Getter private String nome;

    public ProfessorResponse(Professor professor){
        this.registro_professor = professor.getRegistroProfessor();
        this.nome = professor.getNome();
    }

    public static List<ProfessorResponse> convert(List<Professor> professores){
        return professores.stream().map(ProfessorResponse::new).collect(Collectors.toList());
    }
}
