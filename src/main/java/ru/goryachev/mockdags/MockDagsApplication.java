package ru.goryachev.mockdags;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ru.goryachev")
public class MockDagsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockDagsApplication.class, args);
    }

}
