package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return  args ->{
          Student kumud = new Student(
                    "Kumud",
                    "kumud@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 13)

            );

            Student saru = new Student(
                    "Sarita",
                    "saru@gmail.com",
                    LocalDate.of(2004, Month.MAY, 11)
            );


            repository.saveAll(
                    List.of(kumud, saru)
            );
        };
    }
}
