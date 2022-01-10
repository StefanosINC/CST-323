package com.gcu.data;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;
@Service
public class UserDataService implements DataAccessInterface<LoginModel> {
	@SuppressWarnings("unused")
	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	
	
	public UserDataService(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		
		
	}
	@Override
	public List<LoginModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean create(LoginModel t) {
String sql = "INSERT INTO USERS(USERNAME, PASSWORD) VALUES(?,?)";
		
		try {
			int rows = jdbcTemplateObject.update(sql, t.getUsername(), t.getPassword());
			return rows == 1 ? true : false;
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updated(LoginModel t) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<OrderModel> findById(long id) {
		return null;
		// TODO Auto-generated method stub
		
	}
	@Override
	public String FindByOrderID(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
