package com.java.mangement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.mangement.Dao.StudentManagementDao;
import com.java.mangement.entity.Student;

@Service
public class StudentManagementService {
	@Autowired
	private StudentManagementDao managementDao;

	public Student create(Student student) {
		
		return managementDao.save(student);
	}

	public Optional<Student> getStudent(Integer id) {
		// TODO Auto-generated method stub
		return managementDao.findById(id);
	}

	
}
