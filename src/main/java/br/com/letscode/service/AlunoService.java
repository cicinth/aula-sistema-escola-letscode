package br.com.letscode.service;

import br.com.letscode.repository.AlunoRepository;
import br.com.letscode.response.AlunoResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public List<AlunoResponse> buscarAlunosPorTipo
            (String nome, String nomeCurso, String sobrenome, Integer duracao, Integer ano) {
        if (nome != null) {
            List alunos = alunoRepository.findByNome(nome);
            return AlunoResponse.convert(alunos);
        } else if (nomeCurso != null && sobrenome != null) {
            List alunos = alunoRepository.findByCodigoCursoNomeCursoAndSobrenome(nomeCurso, sobrenome);
            return AlunoResponse.convert(alunos);
        } else if (nomeCurso != null) {
            List alunos = alunoRepository.findByCodigoCursoNomeCurso(nomeCurso);
            return AlunoResponse.convert(alunos);
        } else if (duracao != null) {
            List alunos = alunoRepository.findByCodigoCursoDuracaoEquals(duracao);
            return AlunoResponse.convert(alunos);
        } else if (ano != null) {
            List alunos = alunoRepository.findByAnoNascimento(ano);
            return AlunoResponse.convert(alunos);
        } else {
            List alunos = alunoRepository.findAll();
            return AlunoResponse.convert(alunos);
        }
    }

}
