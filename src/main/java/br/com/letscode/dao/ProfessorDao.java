package br.com.letscode.dao;

import br.com.letscode.entity.Professor;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;

@AllArgsConstructor
public class ProfessorDao {
    private EntityManager entityManager;

    public void salvar(Professor professor){
        this.entityManager.persist(professor);
    }
}
