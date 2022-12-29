package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jamesBond = new Student(
                    "James Bond",
                    21,
                    LocalDate.of(2000, 1, 1),
                    "jbond@mail.com"
            );

            Student god = new Student(
                    "God",
                    1000,
                    LocalDate.of(1900, 1, 1),
                    "god@mail.com"
            );

            repository.saveAll(
                    List.of(jamesBond, god)
            );
        };
    }
}