package br.com.letscode.controller;

import br.com.letscode.dao.CursoDao;
import br.com.letscode.dao.ProfessorDao;
import br.com.letscode.entity.Curso;
import br.com.letscode.util.JPAUtil;

import javax.persistence.EntityManager;

public class CursoController {
    public static Curso cadastraCurso(Curso curso){
        EntityManager entityManager = JPAUtil.getEntityManager();

        CursoDao cursoDao = new CursoDao(entityManager);
        entityManager.getTransaction().begin();
        cursoDao.salvar(curso);
        entityManager.getTransaction().commit();
        entityManager.close();

        return curso;
    }
}
