package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.FacultyMentor;
import com.klef.jfsd.springboot.repository.FacultyMentorRepository;

@Service
public class FacultyMentorServiceImpl implements FacultyMentorService
{
	@Autowired
	private FacultyMentorRepository facultyMentorRepository;
	@Override
	public FacultyMentor checkfacultylogin(String uname, String pwd) {
		
		FacultyMentor facultyMentor=facultyMentorRepository.checkfacultylogin(uname, pwd);
		return facultyMentor;
	}

}
