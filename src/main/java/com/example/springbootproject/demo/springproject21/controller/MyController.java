package com.example.springbootproject.demo.springproject21.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/HelloWorld")
    public String word(){
        return "Hellooooo!";

    }


}
