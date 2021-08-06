package br.com.letscode.util;

import lombok.AllArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@AllArgsConstructor
public class JPAUtil {
    private static final EntityManagerFactory FACTORY = Persistence
            .createEntityManagerFactory("letscode");

    public static EntityManager getEntityManager(){
        return FACTORY.createEntityManager();
    }
}
