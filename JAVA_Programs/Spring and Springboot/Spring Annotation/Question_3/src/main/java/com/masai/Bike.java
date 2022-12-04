package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bike {
    @Autowired
    private Travel travel;

    public void BikeTravel(){
        travel.Travelling();
        System.out.println("Travelling from Bike............");
    }
}
