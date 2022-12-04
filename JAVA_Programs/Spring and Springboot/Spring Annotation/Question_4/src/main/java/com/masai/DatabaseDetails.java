package com.masai;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("db")
public class DatabaseDetails {
    @Value("${db.driverName}")
    private String dbname ;

    @Value("${db.url}")
    private String url ;
    @Value("${db.username}")
    private String uname ;

    @Value("${db.password}")
    private String pass ;
    public void getDBdetails() {
        System.out.println("xxxxxxxxxxxxx--Following are DB details--xxxxxxxxxxxxxxx");
        System.out.println("Driver name is :"+dbname);
        System.out.println("Connection URL is :"+url);
        System.out.println("Username is :"+uname);
        System.out.println("Password is :"+pass);
    }
}
