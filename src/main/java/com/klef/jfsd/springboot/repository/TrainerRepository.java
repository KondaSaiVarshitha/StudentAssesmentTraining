package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Trainer;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Integer>
{
	@Query("select t from Trainer t where username=?1 and password=?2")
	public Trainer checktrainerlogin(String uname,String pwd);

}
