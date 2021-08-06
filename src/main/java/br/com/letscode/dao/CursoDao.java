package br.com.letscode.dao;

import br.com.letscode.entity.Curso;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;

@AllArgsConstructor
public class CursoDao {
    private EntityManager entityManager;

    public void salvar(Curso curso){
        this.entityManager.persist(curso);
    }
}
