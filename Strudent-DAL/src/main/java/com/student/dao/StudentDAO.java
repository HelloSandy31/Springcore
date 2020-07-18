package com.student.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.Model.Student;
import com.student.repos.StudentRepository;

@Repository
public class StudentDAO {

	
	@Autowired
	StudentRepository studeRepo;
	

	public void createStudent() {

		Student s= new Student();
		s.setId(1);
		s.setName("Avinash");
		s.setCourse("Java");
		s.setFees(100000);
		 studeRepo.save(s);
		 System.out.println(s);
	}
	
}
