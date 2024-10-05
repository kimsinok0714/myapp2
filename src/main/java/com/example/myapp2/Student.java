package com.example.myapp2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Student {
    private String name;
    @Autowired
    private Address address;

   
}
