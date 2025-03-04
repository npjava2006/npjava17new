package com.npjava.newfeatures.controller;


import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/npjava17new/api")
public class InitialController {

    @PostConstruct
    public void init() {
        System.out.println("InitialController Loaded!");
    }
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}