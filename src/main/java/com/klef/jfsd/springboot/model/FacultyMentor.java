package com.klef.jfsd.springboot.model;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="facultymentor_table")
public class FacultyMentor 
{
	@GeneratedValue
	@Id
	private int id;
	@Column(nullable = false,length = 100)
	private String name;
	@Column(nullable = false,length = 100)
	private String gender;
	@Column(nullable = false,length = 100)
	private String department;
	@Column(nullable = false,length = 100)
	private String program;
	@Column(nullable = false,length = 100)
	private String designation;
	@Column(nullable = false,length = 100)
	private String email;
	@Column(nullable = false,unique = true,length = 100)
	private long contactno;
	@Column(nullable = false,unique = true,length = 100)
	private String username;
	@Column(nullable = false,length = 100)
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
