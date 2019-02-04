package com.sanya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"com.sanya"})
public class CalculatorRunner  {
    public static void main(String[] args) {
        SpringApplication.run(CalculatorRunner.class, args);
    }

    }
