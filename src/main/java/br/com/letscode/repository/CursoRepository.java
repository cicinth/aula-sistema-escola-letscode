package br.com.letscode.repository;

import br.com.letscode.entity.Curso;
import br.com.letscode.entity.QCurso;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;


public interface CursoRepository extends
        JpaRepository<Curso, Integer>,
        QuerydslPredicateExecutor<Curso>,
        QuerydslBinderCustomizer<QCurso> {

    @Override
    default void customize(QuerydslBindings bindings, QCurso curso){
        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }
}
