package com.example.Spring_Data_JPA;

import com.example.Spring_Data_JPA.models.Student;
import com.example.Spring_Data_JPA.repositories.StudentRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
    
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args ->{
		   Student maria = new Student("Maria", "Jones", "MariaJones@gmail.com", 28);
           studentRepository.save(maria);
		};
	}

}
