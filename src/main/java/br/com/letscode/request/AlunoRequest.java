package br.com.letscode.request;

import br.com.letscode.entity.Aluno;
import br.com.letscode.entity.Curso;
import br.com.letscode.repository.CursoRepository;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.Optional;

public class AlunoRequest {
    @Getter @Setter private int ra;
    @Getter @Setter private String nome;
    @Getter @Setter private String sobrenome;
    @Getter @Setter private Date dataNascimento;
    @Getter @Setter private int codigoCurso;

    public Aluno convert(CursoRepository cursoRepository) {
        Optional<Curso> cursoOptional = cursoRepository.findById(codigoCurso);
        Curso curso = cursoOptional.get();
        return new Aluno(ra,nome,sobrenome,dataNascimento,curso);
    }
}
