package com.example.SpringDataJPA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(Student2Repository student2Repository){
		return args ->{
			Student2 kumud = new Student2(
					"Kumud",
					"Satav",
					"satavkumud@gmail.com",
					21
			);
			student2Repository.save(kumud);
		};
	}
}
