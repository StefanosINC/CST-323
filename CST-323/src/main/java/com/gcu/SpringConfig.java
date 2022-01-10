package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;


import com.gcu.business.OrdersBusinessService;
import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.business.UserBusinessInterface;
import com.gcu.business.UserBusinessService;

@Configuration
public class SpringConfig {

	
	
	//@RequestScope
	
	//@SessionScope
	
	@Bean(name="ordersBusinessService", initMethod="init", destroyMethod="destroy")
	@SessionScope
	public OrdersBusinessServiceInterface getOrdersBusiness() {
		return new OrdersBusinessService();
	}

	
	@Bean(name="UserBusinessService", initMethod="init", destroyMethod="destroy")
	@SessionScope
	public UserBusinessInterface getUserBusinessServices() {
		return new UserBusinessService();
			
		
		
	// Scope will renitialize 
	// request every time a request is made create an instance of this object and use it.
	// @scope allows you to have custom scopes. 
		
	// Session Scope: Bean definition to an http session. 
    // Request Scope: once the request starts the bean calls init. When the Rqquest finishes it destroys the bean.
		
	}
}
