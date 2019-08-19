package com.dhanjyothi.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.dhanjyothi.dao.RegisterDao;
import com.dhanjyothi.model.User;

@Repository
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void saveRegister(User customer) {
		if (customer.getUserName().equalsIgnoreCase("admin")) {
			customer.setUser_role("M"); // manager
			customer.setUser_status("A"); // status as active
		} else {
			customer.setUser_role("C");
			customer.setUser_status("N");
		}
		String sql = "insert into USER (USERNAME,PASSWORD,USER_ROLE,USER_STATUS,FIRST_NAME,LAST_NAME,DOB,"
				+ "ADD_LINE1,ADD_LINE2,CITY,STATE,PIN,MOBILE_NUMBER,EMAIL_ID,AADHAR_ID,PAN) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,
				new Object[] { customer.getUserName(), customer.getPassword(), customer.getUser_role(),
						customer.getUser_status(), customer.getFirst_name(), customer.getLast_name(), customer.getDob(),
						customer.getAdd_line1(), customer.getAdd_line2(), customer.getCity(), customer.getState(),
						customer.getPin(), customer.getMobile_number(), customer.getEmail_id(), customer.getAadhar_id(),
						customer.getPan() });
	}

	public List<User> getAllUsers() {
		return null;
	}
}
