package br.com.letscode.controller;

import br.com.letscode.dao.CursoDao;
import br.com.letscode.dao.DisciplinaDao;
import br.com.letscode.entity.Curso;
import br.com.letscode.entity.Disciplina;
import br.com.letscode.util.JPAUtil;

import javax.persistence.EntityManager;

public class DisciplinaController {
    public static Disciplina cadastraDisciplina(Disciplina disciplina){
        EntityManager entityManager = JPAUtil.getEntityManager();

        DisciplinaDao disciplinaDao = new DisciplinaDao(entityManager);
        entityManager.getTransaction().begin();
        disciplinaDao.salvar(disciplina);
        entityManager.getTransaction().commit();
        entityManager.close();

        return disciplina;
    }
}
