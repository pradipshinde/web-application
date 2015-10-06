package com.pradip.myapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for index/home , about and  contact pages 
 * 
 * @author Pradip
 *
 */
@Controller
public class HomeController {
	
	@RequestMapping(value={"/index","/"})
	public String indexPage()
	{
		return "index";
	}
	
	@RequestMapping(value="/about")
	public String aboutPage()
	{
		return "about";
	}
	
	@RequestMapping(value={"/contact"})
	public String contactPage()
	{
		return "contact";
	}
	
	

}
