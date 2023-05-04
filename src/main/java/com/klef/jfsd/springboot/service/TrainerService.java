package com.klef.jfsd.springboot.service;


import java.util.List;

import com.klef.jfsd.springboot.model.ScheduleSession;
import com.klef.jfsd.springboot.model.Trainer;

public interface TrainerService 
{
	public Trainer checktrainerlogin(String uname,String pwd);
	public ScheduleSession addSchedule(ScheduleSession scheduleSession);
	public List<Trainer> viewalltrainers();
}
