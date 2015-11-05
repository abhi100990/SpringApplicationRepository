package com.examples.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.examples.models.Admin;
import com.examples.models.Student;
import com.examples.models.Teacher;

@Controller
public class RegistrationController {
	
	@RequestMapping(value="studentRegistration", method = RequestMethod.GET)
	public String studentRegistration(@ModelAttribute ("student") Student student)
	{
		System.out.println("Going to student registration form.");
		return "StudentRegistration1";
		//return "StudentRegistration";
	}
	
	@RequestMapping(value = "student_detail", method = RequestMethod.POST)
	public String studentDetails(@Valid @ModelAttribute ("student") Student student, BindingResult errors)
	{
		System.out.println("Saving student info");
		
		if(errors.hasErrors()){
			return "StudentRegistration1";
			//return "StudentRegistration";
		}
		
		return "ShowStudentInfo";
	}
	
	@RequestMapping(value="adminRegistration", method = RequestMethod.GET)
	public String adminRegistration()
	{
		System.out.println("Going to admin registration form.");
		return "AdminRegistration";
	}
	
	@RequestMapping(value = "admin_detail", method = RequestMethod.POST)
	public String adminDetails(@ModelAttribute ("admin") Admin admin)
	{
		System.out.println("Saving admin info");
		return "ShowAdminInfo";
	}
	
	@RequestMapping(value="teacherRegistration", method = RequestMethod.GET)
	public String teacherRegistration()
	{
		System.out.println("Going to teacher registration form.");
		return "TeacherRegistration";
	}
	
	@RequestMapping(value = "teacher_detail", method = RequestMethod.POST)
	public String teacherDetails(@ModelAttribute ("teacher") Teacher teacher)
	{
		System.out.println("Saving teacher info");
		return "ShowTeacherInfo";
	}
}
