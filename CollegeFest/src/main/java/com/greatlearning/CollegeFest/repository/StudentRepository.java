package com.greatlearning.CollegeFest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.CollegeFest.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}