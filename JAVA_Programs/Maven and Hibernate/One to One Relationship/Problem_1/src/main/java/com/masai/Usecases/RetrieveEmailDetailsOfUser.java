package com.masai.Usecases;

import com.masai.EMUtil.EMUtil;
import com.masai.Entities.Email;
import com.masai.Entities.User;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Scanner;

public class RetrieveEmailDetailsOfUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User ID");

        int userid= sc.nextInt();
        EntityManager em = EMUtil.provideConnection();

        String jpql="select u.email from User u where u.id=:uid";

        Query query = em.createQuery(jpql);

        query.setParameter("uid",userid);

        Email email=(Email) query.getSingleResult();

        System.out.println(email);

    }
}
