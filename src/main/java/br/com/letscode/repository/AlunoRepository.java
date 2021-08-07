package br.com.letscode.repository;

import br.com.letscode.entity.Aluno;
import org.springframework.data.repository.CrudRepository;

public interface AlunoRepository extends CrudRepository<Aluno, Integer> {
}
