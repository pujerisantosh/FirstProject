package com.example.firstproject_spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstProject {

    @RequestMapping("/hello")
        public String sayHello(){

        return "hello";
        }
    }


