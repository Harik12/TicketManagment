package com.java.mangement;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.java.mangement.entity.Student;
import com.java.mangement.service.StudentManagementService;

@SpringBootApplication
public class StudentManagementApplication  {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=	 SpringApplication.run(StudentManagementApplication.class, args);
		
		StudentManagementService manageservice=ctx.getBean("manageservice", StudentManagementService.class);
		Student student = new Student();
		student.setEmail("hari@gmail.com");
		student.setName("jaru");
		
		student.setPhone(9972);
		
		manageservice.create(student);
		
		
		 
		
	}

	
}
