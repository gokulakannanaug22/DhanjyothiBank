package com.dhanjyothi.dao.impl;

import org.springframework.stereotype.Repository;
import com.dhanjyothi.dao.LoginDao;
import com.dhanjyothi.mapper.UserMapper;
import com.dhanjyothi.model.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int validateUser(User user) {		
		String query = "Select * from user where username ='"+ user.getUserName() + "' and password ='" + user.getPassword() +"'";
		List<User> users = jdbcTemplate.query(query, new UserMapper());
		if(users.size() == 1) {
			return 1;
		}
		else {
			return 0;
		}
	}
}