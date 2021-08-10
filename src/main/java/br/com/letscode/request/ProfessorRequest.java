package br.com.letscode.request;

import br.com.letscode.entity.Aluno;
import br.com.letscode.entity.Curso;
import br.com.letscode.entity.Professor;
import br.com.letscode.repository.CursoRepository;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

public class ProfessorRequest {
    @Getter @Setter private int registro_professor;
    @Getter @Setter private String nome;

    public Professor convert() {
        return new Professor(registro_professor,nome);
    }
}
