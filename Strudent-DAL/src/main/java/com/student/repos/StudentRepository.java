package com.student.repos;

import org.springframework.data.repository.CrudRepository;

import com.student.Model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}