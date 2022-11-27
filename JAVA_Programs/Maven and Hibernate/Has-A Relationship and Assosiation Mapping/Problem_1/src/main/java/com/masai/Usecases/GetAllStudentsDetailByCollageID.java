package com.masai.Usecases;

import com.masai.Entities.Student;
import com.masai.Utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;

public class GetAllStudentsDetailByCollageID {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Collage ID");
        int clgid = sc.nextInt();

        EntityManager em = EMUtil.provideConnection();
        

        Query query = em.createQuery("select students from Collage where collageId=:cid");

        query.setParameter("cid",clgid);
        
        
        List<Student> studentList = query.getResultList();

        for ( Student sl: studentList) {
            System.out.println("Student Roll Number is:- " +sl.getStudentRoll());
            System.out.println("Student Name is:- " +sl.getStudentName());
            System.out.println("Student Mobile Number is:- " +sl.getMobileNumber());
            System.out.println("Student Email is:- " +sl.getEmail());
            System.out.println("Student Collage is:- " +sl.getCollage());
            System.out.println("==============================================================================");
        }
    }
}
