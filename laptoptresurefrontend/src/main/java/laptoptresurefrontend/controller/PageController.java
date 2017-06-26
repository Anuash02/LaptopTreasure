package laptoptresurefrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController 
{
	public PageController() {
		
		System.out.println("Default Page Controller Reached !! ");
	}
	/*
	@RequestMapping("/")
	public String showIndexPage()
	{
		System.out.println("Index Page Printing.....");
		return "index";
	}*/
	
	
	@RequestMapping(value = "/Aboutus")
	public String showAboutusPage()
	{
		System.out.println("About Us Printing.....");
		return "Aboutus";
	}

}
