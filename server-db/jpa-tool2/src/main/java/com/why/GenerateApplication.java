package com.why;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GenerateApplication {
    public static void main(String[] args) {
        SpringApplication.run(GenerateApplication.class,args);
    }
}
