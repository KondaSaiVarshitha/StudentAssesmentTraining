package com.klef.jfsd.springboot.model;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="schedule_table")
@Entity
public class ScheduleSession 
{
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable = false,length = 100)
	private String startdate;
	@Column(nullable = false,length = 100)
	private String enddate;
	@Column(nullable = false,length = 100)
	private String modeofconduct;
	public String getModeofconduct() {
		return modeofconduct;
	}
	public void setModeofconduct(String modeofconduct) {
		this.modeofconduct = modeofconduct;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	@Column(nullable = false,length = 100)
	private String days;
	@Column(nullable = false,length = 100)
	private String name;
	@Column(nullable = false,length = 100)
	private String venue;
	@Column(nullable = false,length = 100)
	private String description;
	@Column()
	private String trainerusername;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTrainerusername() {
		return trainerusername;
	}
	public void setTrainerusername(String trainerusername) {
		this.trainerusername = trainerusername;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	
}
