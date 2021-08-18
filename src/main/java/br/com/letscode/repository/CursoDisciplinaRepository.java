package br.com.letscode.repository;

import br.com.letscode.entity.CursoDisciplinaProfessor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface CursoDisciplinaRepository extends
        JpaRepository<CursoDisciplinaProfessor, Integer>,
        QuerydslPredicateExecutor {
}
