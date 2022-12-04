package com.masai.StudentService;

import com.masai.Entities.Student;

import java.util.List;

public interface StudentServiceDao {
    public String saveStudents(Student student);
    public List<Student> getdetails();
}
