package com.masai.Usecases;
import java.util.*;

import com.masai.AppConfig;
import com.masai.Entities.Student;
import com.masai.StudentService.StudentServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller(value = "st")
public class InsertStudents {
    @Autowired
    private StudentServiceDao saveStudent;
    public void insertStudent() {

        Scanner sc= new Scanner(System.in);

        System.out.println("=====================Enter Student Details============================");
        System.out.println("Enter Student Name ");
        String name= sc.next();
        System.out.println("Enter Student Address ");
        String add= sc.next();

        System.out.println("Enter Student Marks ");
        int marks= sc.nextInt();


        Student student = new Student();
        student.setName(name);
        student.setAddress(add);
        student.setMarks(marks);


        String result= saveStudent.saveStudents(student);

        System.out.println(result);
    }
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        InsertStudents obj= ctx.getBean("st",InsertStudents.class);

        obj.insertStudent();
    }
}
