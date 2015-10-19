package com.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="home/")
	public String home()
	{
		System.out.println("Hello World");
		return "Home";
	}
	
	@RequestMapping(value="registerUserModelAndView/{user_one}/{user_two}")
	public ModelAndView registerUserModelAndView(@PathVariable ("user_one") String user_one, @PathVariable ("user_two") String user_two)
	{
		ModelAndView modelView = new ModelAndView("Register");
		modelView.addObject("message", "Result got using ModelAndView of springframewrk ");
		modelView.addObject("user_one", user_one);
		modelView.addObject("user_two", user_two);
		
		return modelView;
	}
	
	@RequestMapping(value="registerModelWithMap/{user_one}/{user_two}")
	public String registerUserModel(@PathVariable Map<String, String> map, Model model)
	{
		model.addAttribute("message", "Result got using Model of springframewrk with map for pathVariables");
		model.addAttribute("user_one", map.get("user_one"));
		model.addAttribute("user_two", map.get("user_two"));
		
		return "Register";
	}
	
	@RequestMapping(value="register/{user_one}/{user_two}")
	public String registerUserModelWithMap(@PathVariable ("user_one") String user_one, @PathVariable ("user_two") String user_two, Model model)
	{
		model.addAttribute("message", "Result got using Model of springframewrk model UI");
		model.addAttribute("user_one", user_one);
		model.addAttribute("user_two", user_two);
		
		return "Register";
	}
}
