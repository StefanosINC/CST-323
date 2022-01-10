package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gcu.business.OrdersBusinessServiceInterface;


import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private OrdersBusinessServiceInterface service;
	
	
	
	@GetMapping("/")
	
	public String display(Model model) {
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		
		return "login";
		
		
	}
	
	
//	
	@PostMapping("/doLogin")
public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("title", "Login Form");
			return "login";
		}
		

		
		List<OrderModel> orders = service.findAll();
		System.out.println(service.findbyId(4));
		System.out.println(String.format("username %s and %s Password", loginModel.getUsername(), loginModel.getPassword()));
	
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", orders);
		
	
		return "orders";
		
	}

	@GetMapping("/delete")
	public String deleteAlbum(OrderModel order, Model model)
	{	
		List<OrderModel> orders = service.findAll();
		service.delete(8);
		
		
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", orders);
		
		return "login";
}
	
	
}
