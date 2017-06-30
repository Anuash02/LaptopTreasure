package com.niit.laptoptresurefrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController 
{
	@RequestMapping("/Aboutus")
	public String showAboutus()
	{
		return "Aboutus";
	}

}
