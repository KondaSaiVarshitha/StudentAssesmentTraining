package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.ScheduleSession;
import com.klef.jfsd.springboot.model.Trainer;
import com.klef.jfsd.springboot.repository.ScheduleSessionRepository;
import com.klef.jfsd.springboot.repository.TrainerRepository;

@Service
public class TrainerServiceImpl implements TrainerService
{

	@Autowired
	private TrainerRepository trainerRepository;
	
	@Autowired
	private ScheduleSessionRepository scheduleSessionRepository;
	@Override
	public Trainer checktrainerlogin(String uname, String pwd) {
		Trainer trainer=trainerRepository.checktrainerlogin(uname, pwd);
		return trainer;
	}
	@Override
	public ScheduleSession addSchedule(ScheduleSession scheduleSession) {
		return scheduleSessionRepository.save(scheduleSession);
		
	}
	@Override
	public List<Trainer> viewalltrainers() {
		// TODO Auto-generated method stub
		return (List<Trainer>)trainerRepository.findAll();
	}
	
}
