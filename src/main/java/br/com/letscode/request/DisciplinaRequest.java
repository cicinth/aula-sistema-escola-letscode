package br.com.letscode.request;

import br.com.letscode.entity.Aluno;
import br.com.letscode.entity.Curso;
import br.com.letscode.entity.Disciplina;
import br.com.letscode.repository.CursoRepository;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

public class DisciplinaRequest {
    @Getter @Setter private int codigoDisciplina;
    @Getter @Setter private String nomeDisciplina;
    @Getter @Setter private int cargaPratica;
    @Getter @Setter private int cargaTeorica;

    public Disciplina convert() {
        return new Disciplina(codigoDisciplina,nomeDisciplina,cargaPratica,cargaTeorica);
    }
}
