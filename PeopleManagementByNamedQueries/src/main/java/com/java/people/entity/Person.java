package com.java.people.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="person")
@NamedQueries(value= {
		@NamedQuery(name ="Person.getByLname", query = "select p from Person p where p.lname=?1"),
		@NamedQuery(name ="Person.getByFnameAndLname", query = "select p from Person p where p.fname=?1 AND lname=?2"),
		@NamedQuery(name ="Person.getInfoByLnameAndEmail", query = "select p from Person p where p.lname=?1 AND email=?2")})


public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name="fname",length=60)
	private String fname;
	private String lname;
	@Column(name="email",unique=true)
	private String email;
	private String addess;
	private Date date;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person( String fname, String lname, String email, String addess, Date date) {
		super();
	
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.addess = addess;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddess() {
		return addess;
	}
	public void setAddess(String addess) {
		this.addess = addess;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", addess=" + addess
				+ ", date=" + date + "]";
	}	
	

}
