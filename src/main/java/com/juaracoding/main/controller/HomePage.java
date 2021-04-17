package com.juaracoding.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomePage {
	
	
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		

		return "login";
		
	}
	
	
	@GetMapping("/login")
	public String loginPage(Model model) {
		

		return "login";
		
	}
	
	@GetMapping("/dashboard")
	public String viewdashboard(Model model) {
		

		return "dashboard";
		
	}

}
