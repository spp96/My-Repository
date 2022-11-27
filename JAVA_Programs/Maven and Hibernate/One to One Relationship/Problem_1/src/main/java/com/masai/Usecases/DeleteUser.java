package com.masai.Usecases;

import com.masai.EMUtil.EMUtil;
import com.masai.Entities.User;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class DeleteUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User ID");

        int userId= sc.nextInt();
        EntityManager em = EMUtil.provideConnection();

        User user =em.find(User.class,userId);
        if(user !=null){
            em.getTransaction().begin();
            em.remove(user);
            em.getTransaction().commit();
            System.out.println("User deleted Successfully");
        } else{
            System.out.println("User not found");
        }

    }
}
