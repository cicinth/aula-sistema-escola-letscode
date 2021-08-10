package br.com.letscode.repository;

import br.com.letscode.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    List<Aluno> findByNome(String nome);

    @Query("SELECT a FROM Aluno a WHERE a.codigoCurso.nomeCurso = ?1")
    List<Aluno> findByCodigoCursoNomeCurso(String nomeCurso);

    List<Aluno> findByCodigoCursoNomeCursoAndSobrenome(String nomeCurso, String sobrenome);

    List<Aluno> findByCodigoCursoDuracaoEquals(int duracaoCurso);

    @Query(value = "SELECT * FROM aluno WHERE YEAR (data_nascimento) = ?1", nativeQuery = true)
    List<Aluno> findByAnoNascimento(int ano);

}
