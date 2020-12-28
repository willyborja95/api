package com.will.api.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class MyController {

    @GetMapping("/hola")
    public String hola(){
        return "Hola";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/bye")
    public String bye(){
        return "Bye";
    }

}
