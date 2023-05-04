package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	
	@Autowired
	private StudentRepository studentRepository;

	public Student checkstudentlogin(String uname, String pwd) 
	{
		Student student=studentRepository.checkstudentlogin(uname, pwd);
		return student;
	}
	
}
