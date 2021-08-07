package br.com.letscode.repository;

import br.com.letscode.entity.CursoDisciplinaProfessor;
import org.springframework.data.repository.CrudRepository;

public interface CursoDisciplinaRepository extends CrudRepository<CursoDisciplinaProfessor, Integer> {
}
