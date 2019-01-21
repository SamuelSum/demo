package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


 /* @RequestMapping(value = "/sayHello", +method = RequestMethod.GET)
    public String sayHello() {

        return "Hello Spring Boot";
    }*/