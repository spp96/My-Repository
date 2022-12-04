package com.masai.Dao;

import com.masai.Entities.Student;

import java.util.List;

public interface StudentDao {
    public String insertStudentDetails(Student student);
    public List<Student> getAllStudentDetails();
}
