package com.gcu.data;

import java.util.List;

import com.gcu.model.OrderModel;

public interface DataAccessInterface<T> {

	public List<T> findAll();
	public List<OrderModel> findById(long id);
	public boolean create(T t);
	public boolean updated(T t);

	
	public void delete(long id);
	public String FindByOrderID(long id);
}
