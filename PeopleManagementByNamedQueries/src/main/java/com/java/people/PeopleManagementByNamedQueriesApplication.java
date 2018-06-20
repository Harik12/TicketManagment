package com.java.people;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.people.entity.Person;
import com.java.people.service.PeopleMangementService;

@SpringBootApplication
public class PeopleManagementByNamedQueriesApplication implements CommandLineRunner {
	@Autowired
	private PeopleMangementService peopleMangementService;

	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementByNamedQueriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		getByLastName();
		getInfoByLnameAndEmail();
		getByFNameAndLname();
		findByFNameEndingWith();
		
		
	}
	private void getInfoByLnameAndEmail() {
			List<Person> list = peopleMangementService.getInfoByLnameAndEmail("krishna","hari@gmail.com");
			list.forEach(System.out::println);
			
			
		}
	private void getByFNameAndLname() {
		List<Person> list =peopleMangementService.getByFNameAndLname("ram","krishna");
		list.forEach(System.out::println);
		
	}

	
	private void getByLastName() {
	List<Person> list= peopleMangementService.getByLName("krishna");
	list.forEach(System.out::println);
		
	}
	private void findByFNameEndingWith() {
		List<Person> list=	peopleMangementService.findByFNameEndingWith("i");
			
		list.forEach(System.out::println);
		}

}
