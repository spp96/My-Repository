package com.masai;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("Cities.properties")
public class AppConfig {

    @Autowired
    private Environment env;

    @Bean
    public List<String> listCities(){
        List<String> cities = new ArrayList<>();
        cities.add(env.getProperty("city_1"));
        cities.add(env.getProperty("city_2"));
        cities.add(env.getProperty("city_3"));
        cities.add(env.getProperty("city_4"));
        cities.add(env.getProperty("city_5"));
        return cities;
    }

    @Bean
    public List<Student> students(){
        List<Student> st = new ArrayList<>();
        st.add(new Student(1,"Ramesh","Maharashtra",400));
        st.add(new Student(2,"Suresh","TamilNadu",480));
        st.add(new Student(3,"Ronny","Karnataka",540));
        st.add(new Student(4,"Rajesh","Hyderabad",490));
        st.add(new Student(5,"Gautam","Kolkata",580));
        return st;
    }
}
