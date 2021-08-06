package br.com.letscode.controller;

import br.com.letscode.dao.AlunoDao;
import br.com.letscode.dao.CursoDao;
import br.com.letscode.entity.Aluno;
import br.com.letscode.entity.Curso;
import br.com.letscode.util.JPAUtil;

import javax.persistence.EntityManager;

public class AlunoController {
    public static Aluno cadastraAluno(Aluno aluno){
        EntityManager entityManager = JPAUtil.getEntityManager();

        AlunoDao alunoDao = new AlunoDao(entityManager);
        entityManager.getTransaction().begin();
        alunoDao.salvar(aluno);
        entityManager.getTransaction().commit();
        entityManager.close();

        return aluno;
    }
}
