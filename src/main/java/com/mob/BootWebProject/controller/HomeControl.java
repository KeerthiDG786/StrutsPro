package com.mob.BootWebProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeControl {
	
	@RequestMapping("home")
	public String home()
	{
		return "home.jsp";
	}

}
