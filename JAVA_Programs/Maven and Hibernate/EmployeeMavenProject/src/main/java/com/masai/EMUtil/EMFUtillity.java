package com.masai.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtillity {
    private static EntityManagerFactory emf;

    static {
        emf= Persistence.createEntityManagerFactory("employeeUnit");
    }
    public static EntityManager provideConnection() {
        return emf.createEntityManager();
    }
}
