package com.example.projectYT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello world";
    }

    @GetMapping(value = {"/test", "/test1"})
    public String test() {
        return "Testing";
    }
}
