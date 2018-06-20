package com.java.mangement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.mangement.entity.Student;
import com.java.mangement.service.StudentManagementService;

@RestController
public class StudentController {
	@Autowired
	private StudentManagementService manageservice; 
	
	@RequestMapping(value="/create")
	public Student create(@RequestBody Student student) {
		
		return  manageservice.create(student);
		
		
	}
	@RequestMapping(value="/get/{id}")
	public Optional<Student> getStudent(@PathVariable("id") Integer id) {
		
		return manageservice.getStudent(id);
		
	}
	
	

}
