package com.masai.Usecases;

import com.masai.AppConfig;
import com.masai.Entities.Student;
import com.masai.StudentService.StudentServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller(value = "stdnt")
public class GetAllStudents {
    @Autowired
    private StudentServiceDao saveStudent;
    public void getstudents(){
        List<Student> list = saveStudent.getdetails();
        list.forEach(s->{
            System.out.println("Enter Student Roll Number is :"+s.getRoll());
            System.out.println("Enter Student Name is :"+s.getName());
            System.out.println("Enter Student Address is :"+s.getAddress());
            System.out.println("Enter Student Marks is :"+s.getMarks());
            System.out.println("===================================================");
        });

    }
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        GetAllStudents obj= ctx.getBean("stdnt",GetAllStudents.class);

        obj.getstudents();
    }
}
