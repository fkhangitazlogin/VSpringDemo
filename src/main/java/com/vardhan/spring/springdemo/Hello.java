package com.vardhan.spring.springdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/greetings")
    public String greetings()
    {
        return "Greetings from Spring Boot!";
    }
}
