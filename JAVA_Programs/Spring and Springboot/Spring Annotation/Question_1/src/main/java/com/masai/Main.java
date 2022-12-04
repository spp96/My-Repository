package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        GetAllCitiesName list = ctx.getBean("city",GetAllCitiesName.class);

        List<String> city = list.getCity;
        System.out.println("List of Cities is :"+city);
        System.out.println("======================xx=========================");
        System.out.println("======================xx=========================");



        GetAllStudentsDetails list1 = ctx.getBean("st",GetAllStudentsDetails.class);

        List<Student> students = list1.studentList;

        students.forEach(s->{
            System.out.println("Student Roll Number is :"+s.getRoll());
            System.out.println("Student Name is :"+s.getName());
            System.out.println("Student Address is :"+s.getAddress());
            System.out.println("Student Marks is :"+s.getMarks());
            System.out.println("=================================================");
        });

        ((AnnotationConfigApplicationContext)ctx).close();

    }
}
