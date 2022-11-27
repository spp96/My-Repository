package com.masai.Usecases;

import com.masai.EMUtil.EMUtil;
import com.masai.Entities.User;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Scanner;

public class RetrieveOneUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User ID");

        int userId= sc.nextInt();
        EntityManager em = EMUtil.provideConnection();

        User user=em.find(User.class, userId);
        em.close();
        System.out.println(user);
    }
}
