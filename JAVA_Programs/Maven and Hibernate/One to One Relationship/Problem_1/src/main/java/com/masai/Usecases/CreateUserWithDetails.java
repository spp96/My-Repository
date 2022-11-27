package com.masai.Usecases;

import com.masai.EMUtil.EMUtil;
import com.masai.Entities.Email;
import com.masai.Entities.User;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.Scanner;

public class CreateUserWithDetails {

    public static void main(String[] args) {

        EntityManager em = EMUtil.provideConnection();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User ID");
        int userid= sc.nextInt();

        System.out.println("Enter User Name");
        String username= sc.next();

        System.out.println("Enter User Phone");
        String userphone= sc.next();

        System.out.println("Enter User Date of Birth");
        String userdob= sc.next();

        User user= new User();
        user.setId(userid);
        user.setName(username);
        user.setPhoneNo(userphone);
        user.setDateOfBirth(userdob);


        System.out.println("Enter Email ID");
        String emailid= sc.next();

        System.out.println("Enter Email");
        String emailad= sc.next();


        Email email= new Email();
        email.setMail_id(emailid);
        email.setEmail(emailad);
        email.setCreated_date(LocalDate.now());

        email.setUser(user);
        user.setEmail(email);

        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();

        em.close();

        System.out.println("User Created Successfully");
    }
}
