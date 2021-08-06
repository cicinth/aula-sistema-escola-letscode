package br.com.letscode.dao;

import br.com.letscode.entity.Aluno;
import br.com.letscode.entity.Curso;
import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;

@AllArgsConstructor
public class AlunoDao {
    private EntityManager entityManager;

    public void salvar(Aluno aluno){
        this.entityManager.persist(aluno);
    }
}
