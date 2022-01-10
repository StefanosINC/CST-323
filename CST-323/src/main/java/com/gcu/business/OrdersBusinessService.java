package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessServiceInterface {

	@Autowired
	private DataAccessInterface<OrderModel> service;
	@Override
	public void test() {

		System.out.println("hello from orderbusinessService");
		
				}
	@Override
	public List<OrderModel> getOrders(){
		
		
	List<OrderModel> orders = new ArrayList<OrderModel>();
//	orders.add(new OrderModel(0L, "0000000001", "Product 1", 1.00f, 1));
//	orders.add(new OrderModel(1L, "0000000002", "Product 2", 2.00f, 2));
//	orders.add(new OrderModel(2L, "0000000003", "Product 3", 3.00f, 3));
//	orders.add(new OrderModel(3L, "0000000004", "Product 4", 4.00f, 4));
//	orders.add(new OrderModel(0L, "0000000005", "Product 5", 5.00f, 5));
	return orders;
}
	@Override
	public void init() {
		System.out.println("In the OrdersBusinessService.init()");
		
	}
	@Override
	public void destroy() {
		System.out.println("In th erodersbusiness service.destroy()");
		
	}
	@Override
	public List<OrderModel> findAll() {
		// TODO Auto-generated method stub
		return service.findAll();
	}
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		service.delete(id);
	}

	@Override
	public List<OrderModel> findbyId(long id) {
		// TODO Auto-generated method stub
		return service.findById(id);
	
	}
}