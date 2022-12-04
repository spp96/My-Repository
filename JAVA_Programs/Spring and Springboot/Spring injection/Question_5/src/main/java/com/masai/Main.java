package com.masai;

import com.masai.Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        Demo demo = ctx.getBean("demo", Demo.class);
        demo.cleanUp();
        demo.showDetails();
    }
}
