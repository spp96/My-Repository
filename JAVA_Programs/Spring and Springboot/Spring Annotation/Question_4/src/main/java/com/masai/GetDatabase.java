package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GetDatabase {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        DatabaseDetails details = ctx.getBean("db", DatabaseDetails.class);

        details.getDBdetails();
    }

}
