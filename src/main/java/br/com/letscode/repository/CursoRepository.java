package br.com.letscode.repository;

import br.com.letscode.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Integer> {
}
