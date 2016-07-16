package com.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by USER on 7/13/2016.
 */
@RestController
@EnableAutoConfiguration
public class HelloControler {
    @RequestMapping("/")
    public String hello(){
        return "Hello Spring Boot Samrat!!!";
    }

    @RequestMapping("/wife")
    public String helloSreya(){
        return "Hello Spring Boot Sreya!!!";
    }
}
