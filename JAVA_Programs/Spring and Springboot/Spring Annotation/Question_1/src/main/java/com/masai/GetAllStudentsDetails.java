package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service("st")
public class GetAllStudentsDetails {
    @Autowired
    List<Student> studentList;
    @PostConstruct
    public void preCall() {
        System.out.println("inside preConstruct");

    }
    @PreDestroy
    public void preDestroy() {

        System.out.println("inside Destroy");
    }

}
