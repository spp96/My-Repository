package com.masai.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
    private static EntityManagerFactory emf;

    static {
        emf= Persistence.createEntityManagerFactory("customerUnit");
    }
    public static EntityManager provideConnection() {
        return emf.createEntityManager();
    }
}
