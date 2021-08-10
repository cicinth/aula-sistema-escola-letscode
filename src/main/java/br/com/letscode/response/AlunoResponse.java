package br.com.letscode.response;

import br.com.letscode.entity.Aluno;
import br.com.letscode.entity.Curso;
import lombok.Getter;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;


public class AlunoResponse {
    @Getter private int ra;
    @Getter private String nome;
    @Getter private String sobrenome;
    @Getter private Date dataNascimento;
    @Getter private Curso codigoCurso;

    public AlunoResponse(Aluno aluno){
        this.ra = aluno.getRa();
        this.nome = aluno.getNome();
        this.sobrenome = aluno.getSobrenome();
        this.dataNascimento = aluno.getDataNascimento();
        this.codigoCurso = aluno.getCodigoCurso();
    }

    public static List<AlunoResponse> convert(List<Aluno> alunos){
        return alunos.stream().map(AlunoResponse::new).collect(Collectors.toList());
    }
}
