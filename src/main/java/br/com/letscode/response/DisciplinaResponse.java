package br.com.letscode.response;

import br.com.letscode.entity.Aluno;
import br.com.letscode.entity.Disciplina;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

public class DisciplinaResponse {
    @Getter
    private int codigoDisciplina;
    @Getter private String nomeDisciplina;
    @Getter private int cargaPratica;
    @Getter private int cargaTeorica;

    public  DisciplinaResponse(Disciplina disciplina){
        this.codigoDisciplina = disciplina.getCodigoDisciplina();
        this.nomeDisciplina = disciplina.getNomeDisciplina();
        this.cargaPratica = disciplina.getCargaPratica();
        this.cargaTeorica = disciplina.getCargaTeorica();
    }

    public static List<DisciplinaResponse> convert(List<Disciplina> disciplinas){
        return disciplinas.stream().map(DisciplinaResponse::new).collect(Collectors.toList());
    }
}
