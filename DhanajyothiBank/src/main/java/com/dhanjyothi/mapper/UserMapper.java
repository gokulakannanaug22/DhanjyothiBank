package com.dhanjyothi.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.dhanjyothi.model.User;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {

	public static final String BASE_SQL = "select * from user";

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {

		int userId = rs.getInt("USER_ID");
		String userName = rs.getString("USERNAME");
		String password = rs.getString("PASSWORD");
		String confirmPassword = password;
		String user_role = rs.getString("USER_ROLE");
		String user_status = rs.getString("USER_STATUS");
		String first_name = rs.getString("FIRST_NAME");
		String last_name = rs.getString("LAST_NAME");
		String dob = rs.getString("DOB");
		String add_line1 = rs.getString("ADD_LINE1");
		String add_line2 = rs.getString("ADD_LINE2");
		String city = rs.getString("CITY");
		String state = rs.getString("STATE");
		String pin = rs.getString("PIN");
		String mobileNumber = rs.getString("MOBILE_NUMBER");
		String email = rs.getString("EMAIL_ID");
		String aadhar = rs.getString("AADHAR_ID");
		String pan = rs.getString("PAN");

		return new User(userId, userName, password, confirmPassword, user_role, user_status, first_name, last_name, dob,
				add_line1, add_line2, city, state, pin, mobileNumber, email, aadhar, pan);

	}
}