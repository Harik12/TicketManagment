package com.java.mangement.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.mangement.entity.Student;

@Repository
public interface StudentManagementDao extends  CrudRepository<Student, Integer> {
	
	

}
