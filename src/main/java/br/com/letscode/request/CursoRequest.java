package br.com.letscode.request;

import br.com.letscode.entity.Aluno;
import br.com.letscode.entity.Curso;
import br.com.letscode.entity.Modalidade;
import br.com.letscode.repository.CursoRepository;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

public class CursoRequest {
    @Getter @Setter private int codigoCurso;
    @Getter @Setter private String nomeCurso;
    @Getter @Setter private int duracao;
    @Getter @Setter private int numeroAlunos;

    public Curso convert() {
        return new Curso(codigoCurso,nomeCurso,duracao,numeroAlunos, Modalidade.PRESENCIAL);
    }
}
