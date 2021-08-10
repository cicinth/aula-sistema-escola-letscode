package br.com.letscode.response;

import br.com.letscode.entity.Aluno;
import br.com.letscode.entity.Curso;
import br.com.letscode.entity.Modalidade;
import lombok.Getter;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CursoResponse {
    @Getter private int codigoCurso;
    @Getter private String nomeCurso;
    @Getter private int duracao;
    @Getter private int numeroAlunos;
    @Getter private Modalidade modalidade;

    public CursoResponse(Curso curso){
        this.codigoCurso = curso.getCodigoCurso();
        this.nomeCurso = curso.getNomeCurso();
        this.duracao = curso.getDuracao();
        this.numeroAlunos = curso.getNumeroAlunos();
        this.modalidade = curso.getModalidade();
    }

    public static List<CursoResponse> convert(List<Curso> cursos){
        return cursos.stream().map(CursoResponse::new).collect(Collectors.toList());
    }

}
