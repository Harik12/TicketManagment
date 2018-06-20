package com.java.people.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.java.people.entity.Person;

public interface PeopleMangementDao extends CrudRepository<Person, Integer> {

	List<Person> getByLname(String lName);
	
	List<Person> getInfoByLnameAndEmail(String lName,String email);
	
	 List<Person> getByFnameAndLname(String Fname,String Lname);
	 
	 List<Person> findByFnameEndingWith(String fName);
}
