package com.niit.laptoptresurefrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController 
{
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("Header");
		mv.addObject("title","home");
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	

}
