package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Supervisor;

@Repository
public interface SupervisorRepository extends CrudRepository<Supervisor, String>
{
	@Query("select s from Supervisor s where username=?1 and password=?2")
	public Supervisor checksupervisorlogin(String uname,String pwd);
}
