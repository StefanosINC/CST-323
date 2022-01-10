package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

public class UserBusinessService implements UserBusinessInterface{

	@Autowired
	private DataAccessInterface<LoginModel> service;
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(LoginModel t) {
		// TODO Auto-generated method stub
	
		service.create(t);
	}


}
