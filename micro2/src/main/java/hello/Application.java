package com.poc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.SpringApplication.run;

@ComponentScan("com.poc")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        run(Application.class, args);
    }
}
