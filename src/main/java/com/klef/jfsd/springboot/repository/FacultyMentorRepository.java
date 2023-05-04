package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.FacultyMentor;

@Repository
public interface FacultyMentorRepository extends CrudRepository<FacultyMentor, Integer>
{
	@Query("select s from FacultyMentor s where username=?1 and password=?2")
	public FacultyMentor checkfacultylogin(String uname,String pwd);
}
