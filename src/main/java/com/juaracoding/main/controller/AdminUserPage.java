package com.juaracoding.main.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.juaracoding.main.entity.AdminUser;
import com.juaracoding.main.services.ModelAdminUser;

@Controller
public class AdminUserPage {

	@Autowired
	ModelAdminUser modelAdminUser;
	
	@GetMapping("/adminuser/view")
	public String viewAdminUser(Model model) {
		
		model.addAttribute("listAdminUser",modelAdminUser.getAllAdminUser());
		
		
		return "view_adminuser";
	}
	
	@GetMapping("/adminuser/add")
	public String viewAddAdminUser(Model model) {
		
		// buat penampung data adminUser di halaman htmlnya
		model.addAttribute("adminUser",new AdminUser());
		
		return "add_adminuser";
	}
	
	@PostMapping("/adminuser/view")
	public String addAdminUser(@Valid AdminUser adminUser,BindingResult result, Model model) {
		
		if (result.hasErrors()) {
		    return"add_adminuser";
		  }
		// buat penampung data adminUser di halaman htmlnya
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String plainPassword = adminUser.getPassword();
		String encodedPassword = passwordEncoder.encode(plainPassword);
		adminUser.setPassword(encodedPassword);		
		
		this.modelAdminUser.addAdminUser(adminUser);
		model.addAttribute("listAdminUser",modelAdminUser.getAllAdminUser());
		
		
		return "redirect:/login";
	}
	
	@GetMapping("/adminuser/update/{id}")
	public String viewUpdateAdminUser(@PathVariable String id, Model model) {
		
		AdminUser adminUser = modelAdminUser.getAdminUserById(id);
		// buat penampung data adminUser di halaman htmlnya
		model.addAttribute("adminUser",adminUser);
		
		return "add_adminuser";
	}
	
	@GetMapping("/adminuser/delete/{id}")
	public String deleteAdminUser(@PathVariable String id, Model model) {
		
		this.modelAdminUser.deleteAdminUser(id);
		model.addAttribute("listAdminUser",modelAdminUser.getAllAdminUser());
		
		
		return "redirect:/adminuser/view";
	}

}
