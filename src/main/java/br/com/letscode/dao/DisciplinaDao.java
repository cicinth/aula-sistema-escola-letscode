package br.com.letscode.dao;

import br.com.letscode.entity.Disciplina;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;

@AllArgsConstructor
public class DisciplinaDao {
    private EntityManager entityManager;

    public void salvar(Disciplina disciplina){
        this.entityManager.persist(disciplina);
    }
}
