package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("city")
public class GetAllCitiesName {

    @Autowired
    List<String> getCity;


}
