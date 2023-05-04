package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.FacultyMentor;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.model.Supervisor;
import com.klef.jfsd.springboot.model.Trainer;
import com.klef.jfsd.springboot.repository.FacultyMentorRepository;
import com.klef.jfsd.springboot.repository.StudentRepository;
import com.klef.jfsd.springboot.repository.SupervisorRepository;
import com.klef.jfsd.springboot.repository.TrainerRepository;

@Service
public class SupervisorServiceImpl implements SupervisorService
{
	
	@Autowired
	private SupervisorRepository supervisorRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private FacultyMentorRepository facultyMentorRepository;
	
	@Autowired
	private TrainerRepository trainerRepository;


	public Supervisor checkadminlogin(String uname, String password) 
	{
		Supervisor supervisor= supervisorRepository.checksupervisorlogin(uname, password);
		return supervisor;
	}


	@Override
	public Student addStudent(Student student) 
	{
		
		return studentRepository.save(student);
	}


	@Override
	public List<Student> viewAllStudents() 
	{
		List<Student> students= (List<Student>) studentRepository.findAll();
		return students;
	}


	@Override
	public Student viewstudentbyid(int id) 
	{
		Student student=studentRepository.findById(id).get();
		return student;
	}


	public FacultyMentor addFacultyMentor(FacultyMentor facultyMentor) 
	{
		
		return facultyMentorRepository.save(facultyMentor);
	}


	@Override
	public List<FacultyMentor> viewAllFacultyMentor() 
	{
		List<FacultyMentor> facultyMentors=(List<FacultyMentor>)facultyMentorRepository.findAll();
		return facultyMentors;
	}


	@Override
	public FacultyMentor viewfacultymentorbyid(int id) 
	{
		FacultyMentor facultyMentor=facultyMentorRepository.findById(id).get();
		return facultyMentor;
	}


	@Override
	public Trainer addTrainer(Trainer trainer) {
		return trainerRepository.save(trainer);
	}


	@Override
	public List<Trainer> viewAllTrainers() {
		List<Trainer> trainers=(List<Trainer>)trainerRepository.findAll();
		return trainers;
	}


	@Override
	public Trainer viewtrainerbyid(int id) 
	{
		return trainerRepository.findById(id).get();
	}
	
	
	
}
