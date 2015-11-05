package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

	@RequestMapping(value = "/")
	public String home(Model model)
	{
		return "Home";
	}
	
	@RequestMapping(value = "/register")
	public String register(Model model)
	{
		return "RegisterStudent";
	}
	
	@RequestMapping(value = "/storeStudentInfo", method = RequestMethod.POST)
	public String storeStudentInfo(@ModelAttribute ("student") Student student)
	{
		return "ShowStudentInfo";
	}
}
