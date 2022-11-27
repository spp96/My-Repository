package com.masai.Usecases;

import com.masai.Entities.Collage;
import com.masai.Entities.Student;
import com.masai.Utility.EMUtil;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EntityManager em= EMUtil.provideConnection();

        System.out.println("Enter College  Name");
        String collagename= sc.next();

        System.out.println("Enter College Address");
        String collagetadd= sc.next();

        Collage clg_1 = new Collage();
        clg_1.setCollageName(collagename);
        clg_1.setCollageAddress(collagetadd);

        for(int i =0;i<4;i++){
            System.out.println("*****Enter Details of Students******"+ (i+1));
            System.out.println("Enter Student Name");
            String studentname= sc.next();

            System.out.println("Enter Student Mobile No.");
            String studentmno= sc.next();

            System.out.println("Enter Student Email");
            String studentmail= sc.next();
            Student studentDetails = new Student();
            studentDetails.setStudentName(studentname);
            studentDetails.setMobileNumber(studentmno);
            studentDetails.setEmail(studentmail);
            studentDetails.setCollage(clg_1);

            clg_1.getStudents().add(studentDetails);
        }

        em.getTransaction().begin();
        em.persist(clg_1);
        em.getTransaction().commit();

        em.close();

        System.out.println("Done");

    }
}
