package com.klef.jfsd.springboot.service;

import java.util.List;



import com.klef.jfsd.springboot.model.FacultyMentor;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.model.Supervisor;
import com.klef.jfsd.springboot.model.Trainer;

public interface SupervisorService 
{
	public Supervisor checkadminlogin(String uname,String password);
	public Student addStudent(Student student);
	public List<Student> viewAllStudents();
	public Student viewstudentbyid(int id);
	public FacultyMentor addFacultyMentor(FacultyMentor facultyMentor);
	public List<FacultyMentor> viewAllFacultyMentor();
	public FacultyMentor viewfacultymentorbyid(int id);
	public Trainer addTrainer(Trainer trainer);
	public List<Trainer> viewAllTrainers();
	public Trainer viewtrainerbyid(int id);
}
