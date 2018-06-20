package com.java.people.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.people.Dao.PeopleMangementDao;
import com.java.people.entity.Person;

@Service
public class PeopleMangementService {

	@Autowired
	private PeopleMangementDao peopleMangementDao;

	public List<Person> getByLName(String lName) {
		
		return peopleMangementDao.getByLname(lName);
	}

	public List<Person> getInfoByLnameAndEmail(String lName, String email) {
		// TODO Auto-generated method stub
		return peopleMangementDao.getInfoByLnameAndEmail(lName, email);
	}

	public List<Person> getByFNameAndLname(String Fname, String Lname) {
		
		return peopleMangementDao.getByFnameAndLname(Fname, Lname);
	}

	public List<Person> findByFNameEndingWith(String fName) {
		// TODO Auto-generated method stub
		return peopleMangementDao.findByFnameEndingWith(fName);
	}

	
	
	

}
