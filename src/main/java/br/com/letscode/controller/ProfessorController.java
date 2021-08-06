package br.com.letscode.controller;

import br.com.letscode.entity.Professor;
import br.com.letscode.dao.ProfessorDao;
import br.com.letscode.util.JPAUtil;

import javax.persistence.EntityManager;

public class ProfessorController {

    public static Professor cadastraProfessor(Professor professor){

        EntityManager entityManager = JPAUtil.getEntityManager();

        ProfessorDao professorDao = new ProfessorDao(entityManager);
        entityManager.getTransaction().begin();
        professorDao.salvar(professor);
        entityManager.getTransaction().commit();
        entityManager.close();

        return professor;
    }
}
