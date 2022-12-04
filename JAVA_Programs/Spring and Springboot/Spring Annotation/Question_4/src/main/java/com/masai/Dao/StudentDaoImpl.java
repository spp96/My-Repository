package com.masai.Dao;

import com.masai.Entities.Student;
import com.masai.Utility.EMUtil;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

@Repository
public class StudentDaoImpl implements StudentDao{

    EntityManager em = EMUtil.provideEntityManager();
    @Override
    public String insertStudentDetails(Student student) {

        em.getTransaction().begin();

        em.persist(student);

        em.getTransaction().commit();
        em.close();
        return "Student Inserted Successfully......";
    }

    @Override
    public List<Student> getAllStudentDetails() {
//        Query q = em.createQuery("from student");
//        List<Student> students = q.getResultList();
//        em.close();
//        return students;

        List<Student> studentList = null ;

        String jpql = "from Student";

        TypedQuery<Student> q = em.createQuery(jpql , Student.class);

        studentList = q.getResultList();

        return studentList;
    }
}
