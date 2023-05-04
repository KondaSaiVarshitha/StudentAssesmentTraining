package com.klef.jfsd.springboot.controller;

import java.net.http.HttpRequest;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.FacultyMentor;
import com.klef.jfsd.springboot.model.ScheduleSession;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.model.Supervisor;
import com.klef.jfsd.springboot.model.Trainer;
import com.klef.jfsd.springboot.service.FacultyMentorService;
import com.klef.jfsd.springboot.service.StudentService;
import com.klef.jfsd.springboot.service.SupervisorService;
import com.klef.jfsd.springboot.service.TrainerService;

@Controller
public class ClientController 
{
	@Autowired
	private SupervisorService supervisorService;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private FacultyMentorService facultyMentorService;
	
	@Autowired
	private TrainerService trainerService;
	
//	@GetMapping(path="/supervisorlogin")
//	public ModelAndView supervisorlogin()
//	{
//		ModelAndView mv=new ModelAndView("supervisorlogin");
//		return mv;
//	}
	
	@PostMapping(path="/checksupervisorlogin")
	public ModelAndView checksupervisorlogin(HttpServletRequest request)
	{
		String uname=request.getParameter("auname");
		String pwd=request.getParameter("apwd");
		Supervisor supervisor=supervisorService.checkadminlogin(uname, pwd);
		HttpSession session=request.getSession(false);
		ModelAndView mv=new ModelAndView();
		if(supervisor!=null)
		{
			session.setAttribute("uname", uname);
			mv.setViewName("supervisorhome");
			mv.addObject("auname",uname);
		}
		else
		{
			mv.setViewName("supervisorlogin");
			mv.addObject("msg", "Ohh You Were Wrong");
		}
		return mv;
	}
	@GetMapping("/supervisorhome")
	public ModelAndView supervisorhome(HttpServletRequest request)
	{
		HttpSession session=request.getSession(false);
		ModelAndView mv=new ModelAndView("supervisorhome");
		mv.addObject("auname",session.getAttribute("uname"));
		return mv;
		
	}
	@GetMapping("/studentreg")
	public ModelAndView studentregistration()
	{
		ModelAndView mv=new ModelAndView("studentregistration","student",new Student());
		return mv;
	}
	@PostMapping("/addstudent")
	public String addstudent(@ModelAttribute("student")Student student)
	{
		supervisorService.addStudent(student);
		return "redirect:supervisorhome";
	}
	@GetMapping("/studentlist")
	public ModelAndView viewallstudents(HttpServletRequest request)
	{
		List<Student> students=supervisorService.viewAllStudents();
		HttpSession session=request.getSession(false);
		ModelAndView mv=new ModelAndView("viewallstudents");
		mv.addObject("auname",session.getAttribute("uname"));
		mv.addObject("students", students);
		return mv;
	}
	@GetMapping("/viewstudentprofile")
	public ModelAndView viewstudentprofile(HttpServletRequest request,@RequestParam("id")int sid)
	{
		Student student=supervisorService.viewstudentbyid(sid);
		HttpSession session=request.getSession(false);
		ModelAndView mv=new ModelAndView("viewstudentprofile");
		mv.addObject("auname",session.getAttribute("uname"));
		mv.addObject("s", student);
		return mv;
	}
	@GetMapping("/mentorreg")
	public ModelAndView mentorregistration()
	{
		ModelAndView mv=new ModelAndView("facultymentorregistration","mentor",new FacultyMentor());
		return mv;
	}
	@PostMapping("/addmentor")
	public String mentorreg(@ModelAttribute("mentor")FacultyMentor facultyMentor)
	{
		supervisorService.addFacultyMentor(facultyMentor);
		return "redirect:supervisorhome";
	}
	@GetMapping("/mentorlist")
	public ModelAndView viewallmentors(HttpServletRequest request)
	{
		List<FacultyMentor> mentors=supervisorService.viewAllFacultyMentor();
		HttpSession session=request.getSession(false);
		ModelAndView mv=new ModelAndView("viewallfacultymentors");
		mv.addObject("auname",session.getAttribute("uname"));
		mv.addObject("mentors", mentors);
		return mv;
	}
	@GetMapping("/viewmentorprofile")
	public ModelAndView viewmentorprofile(HttpServletRequest request,@RequestParam("id")int mid)
	{
		FacultyMentor mentor=supervisorService.viewfacultymentorbyid(mid);
		HttpSession session=request.getSession(false);
		ModelAndView mv=new ModelAndView("viewmentorprofile");
		mv.addObject("auname",session.getAttribute("uname"));
		mv.addObject("m", mentor);
		return mv;
	}
	@GetMapping("/trainerreg")
	public ModelAndView trainerregistration()
	{
		ModelAndView mv=new ModelAndView("trainerregistration","trainer",new Trainer());
		return mv;
	}
	@PostMapping("/addtrainer")
	public String trainerreg(@ModelAttribute("trainer")Trainer trainer)
	{
		supervisorService.addTrainer(trainer);
		
		return "redirect:supervisorhome";
	}
	@GetMapping("/trainerlist")
	public ModelAndView viewalltrainers(HttpServletRequest request)
	{
		List<Trainer> trainers=supervisorService.viewAllTrainers();
		HttpSession session=request.getSession(false);
		ModelAndView mv=new ModelAndView("viewalltrainers");
		mv.addObject("auname",session.getAttribute("uname"));
		mv.addObject("trainers", trainers);
		return mv;
	}
	@GetMapping("/viewtrainerprofile")
	public ModelAndView viewtrainerprofile(HttpServletRequest request,@RequestParam("id")int tid)
	{
		Trainer trainer=supervisorService.viewtrainerbyid(tid);
		HttpSession session=request.getSession(false);
		ModelAndView mv=new ModelAndView("viewtrainerprofile");
		mv.addObject("auname",session.getAttribute("uname"));
		mv.addObject("t", trainer);
		return mv;
	}
	
	@GetMapping("/")
	public ModelAndView homepage()
	{
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	@GetMapping("/studentlogin")
	public ModelAndView studentlogin()
	{
		ModelAndView mv= new ModelAndView("studentlogin");
		return mv;
	}
	@PostMapping("/checkstudentlogin")
	public ModelAndView checkstudentlogin(HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView();
		String status=request.getParameter("status");
		String uname=request.getParameter("suname");
		String pwd=request.getParameter("spwd");
		HttpSession session=request.getSession(false);
		System.out.println(status);
		if(status.equals("student"))
		{
			System.out.println("hello");
			Student student=studentService.checkstudentlogin(uname, pwd);
			if(student!=null)
			{
				
				mv.setViewName("home");
				session.setAttribute("suname", uname);
			}
			else
			{
				mv.setViewName("studentlogin");
				mv.addObject("msg", "Ohh You Were Wrong");
			}
			return mv;	
		}
		else if(status.equals("faculty"))
		{
			FacultyMentor facultyMentor=facultyMentorService.checkfacultylogin(uname, pwd);
			if(facultyMentor!=null)
			{
				mv.setViewName("facultyhome");
				session.setAttribute("funame", uname);
			}
			else
			{
				mv.setViewName("studentlogin");
				mv.addObject("msg", "Ohh You Were Wrong");
				
			}
			return mv;
		}
		else if(status.equals("trainer"))
		{
			Trainer trainer=trainerService.checktrainerlogin(uname, pwd);
			if(trainer!=null)
			{
				mv.setViewName("trainerhome");
				session.setAttribute("tuname", uname);
			}
			else
			{
				mv.setViewName("studentlogin");
				mv.addObject("msg", "Ohh You Were Wrong");
				
			}
			return mv;
		}
		else if(status.equals("supervisor"))
		{
			Supervisor supervisor=supervisorService.checkadminlogin(uname, pwd);
			if(supervisor!=null)
			{
				session.setAttribute("uname", uname);
				mv.setViewName("supervisorhome");
				mv.addObject("auname",uname);
			}
			else
			{
				mv.setViewName("supervisorlogin");
				mv.addObject("msg", "Ohh You Were Wrong");
			}
			return mv;
		}
		else
		{
			mv.setViewName("studentlogin");
			return mv;
		}
		
	}
	@GetMapping("/logout")
	public String logout()
	{
		return "redirect:";
	}
	@GetMapping("/trainerhome")
	public ModelAndView trainerhome()
	{
		ModelAndView mv=new ModelAndView("trainerhome");
		return mv;
	}
	@GetMapping("/facultyhome")
	public ModelAndView facultyhome()
	{
		ModelAndView mv=new ModelAndView("facultyhome");
		return mv;
	}
	@GetMapping("/studenthome")
	public ModelAndView studenthome()
	{
		ModelAndView mv=new ModelAndView("home");
		return mv;
	}
	@GetMapping("/setSchedule")
	public ModelAndView setSchedule(HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView("addschedule","sch",new ScheduleSession());
		
		return mv;
	}
	@PostMapping("/addSchedule")
	public String addSchedule(@ModelAttribute("sch")ScheduleSession session,HttpServletRequest request)
	{
		HttpSession session1=request.getSession(false);
		String uname=(String) session1.getAttribute("tuname");
		System.out.println(uname);
		session.setTrainerusername(uname);
		trainerService.addSchedule(session);
		return "redirect:setSchedule";
	}
	@GetMapping("/trainerlogout")
	public ModelAndView trainerlogout()
	{
		ModelAndView mv =new ModelAndView("index");
		return mv;
	}
	@GetMapping("/facultylogout")
	public ModelAndView facultylogout()
	{
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}
	@GetMapping("/studentlogout")
	public ModelAndView studentlogout()
	{
		ModelAndView mv=new ModelAndView("index");
		return  mv;
	}
	@GetMapping("/viewcourses")
	public ModelAndView viewcourse()
	{
		ModelAndView mv=new ModelAndView("viewcourses");
		
		return mv;
	}
}
