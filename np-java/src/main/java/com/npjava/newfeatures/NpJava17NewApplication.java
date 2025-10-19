package com.npjava.newfeatures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = "com.npjava")
@EnableCaching
public class NpJava17NewApplication {
    public static void main(String[] args) {
        SpringApplication.run(NpJava17NewApplication.class, args);
        System.out.println(" Spring Boot Application Started Successfully!");
    }
}

