package com.masai;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope("prototype")
public class Travel {
    public void Travelling(){
        System.out.println("Travelling...........");
    }

    @PostConstruct
    public void PostConstruct(){
        System.out.println("PostConstruct is Started............");
    }

    @PreDestroy
    public void PreDestroy(){
        System.out.println("PreDestroy is started...............");
    }
}
