package com.example.greetingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingAppApplication {

    public static void main(String[] args) {
        System.out.println("Hello Greeting App");
        SpringApplication.run(GreetingAppApplication.class, args);
    }

}
