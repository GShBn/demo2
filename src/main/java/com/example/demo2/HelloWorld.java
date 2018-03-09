package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorld {

    @GetMapping
    public String HelloWorld(){
       return "Hello World";
    }

    @GetMapping("/helloworld")
    public String HelloWorld2(){
        return "Hello World2";
    }
}
