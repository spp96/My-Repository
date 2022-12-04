package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = ctx.getBean("car",Car.class);
        car.CarTravelling();

        Bike bike = ctx.getBean("bike",Bike.class);
        bike.BikeTravel();
        ((AnnotationConfigApplicationContext)ctx).close();
    }
}
