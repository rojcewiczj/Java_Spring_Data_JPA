package com.example.Spring_Data_JPA.repositories;

import com.example.Spring_Data_JPA.models.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{

    
}
