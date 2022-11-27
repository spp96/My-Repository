package com.masai.Usecases;

import com.masai.EMUtil.EMUtil;
import com.masai.Entities.User;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class RetrieveAllUser {
    public static void main(String[] args) {

        EntityManager em = EMUtil.provideConnection();

        TypedQuery<User> userTypedQuery = em.createQuery("from User",User.class);

        List<User> userList = userTypedQuery.getResultList();

        em.close();

      userList.forEach(s-> System.out.println(s));
    }
}
