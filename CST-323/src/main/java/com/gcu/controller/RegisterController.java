package com.gcu.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.business.UserBusinessInterface;
import com.gcu.business.UserBusinessService;
import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	private UserBusinessInterface service;
	
	
	@GetMapping("/")
	
		public String display(Model model) {
		model.addAttribute("title", "Register Form");
		model.addAttribute("loginModel", new LoginModel());
		
		return "register";
		
		
	}
		

		@PostMapping("/doRegister")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
			
			if(bindingResult.hasErrors()) {
				model.addAttribute("title", "Register Form");
				return "register";
			}
			
			service.create(loginModel);
			System.out.println(loginModel);
			model.addAttribute("title", " Login Page ");
	
			
			return "login";

		}
}
