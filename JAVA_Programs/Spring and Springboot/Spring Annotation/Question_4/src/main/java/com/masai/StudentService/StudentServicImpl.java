package com.masai.StudentService;

import com.masai.Dao.StudentDao;
import com.masai.Entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServicImpl implements StudentServiceDao{

    @Autowired
    private StudentDao studentDao;
    @Override
    public String saveStudents(Student student) {
        return studentDao.insertStudentDetails(student);
    }

    @Override
    public List<Student> getdetails() {
        return studentDao.getAllStudentDetails();
    }

}
