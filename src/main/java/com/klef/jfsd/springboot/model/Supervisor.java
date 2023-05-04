package com.klef.jfsd.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "supervisor_table")
@Getter @Setter
public class Supervisor 
{
	@Id
	@Column(length = 100)
	private String username;
	
	@Column(length = 100)
	private String password;
	
}
