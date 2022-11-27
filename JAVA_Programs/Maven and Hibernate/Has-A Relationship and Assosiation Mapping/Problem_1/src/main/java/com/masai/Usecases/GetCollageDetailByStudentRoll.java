package com.masai.Usecases;

import com.masai.Entities.Collage;
import com.masai.Entities.Student;
import com.masai.Utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;

public class GetCollageDetailByStudentRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Roll Number");
        int studentroll = sc.nextInt();

        EntityManager em = EMUtil.provideConnection();


        Query query = em.createQuery("select collage from Student where studentRoll=:roll");

        query.setParameter("roll",studentroll);


        Collage collageDetails = (Collage) query.getSingleResult();

        System.out.println(collageDetails);
    }
}
