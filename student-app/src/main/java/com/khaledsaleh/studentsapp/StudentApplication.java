package com.khaledsaleh.studentsapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentService service){
		return args -> {
			for (int i = 0; i < 100; i++){
				service.save(
						Student.builder()
								.firstName("Khaled " + i)
								.lastName("Saleh " + i)
								.age(i)
								.build()
				).subscribe();
			}
		};
	}
}
