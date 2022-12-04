package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Car {
    @Autowired
    private Travel travel;

    public void CarTravelling(){
        travel.Travelling();
        System.out.println("Travelling from Car...................");
    }
}
