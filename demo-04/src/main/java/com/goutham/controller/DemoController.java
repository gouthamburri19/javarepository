package com.goutham.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api" )
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello to ALl, By Spring Boot";
    }
    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Welcome to ALl, By Spring Boot";
    }
}
