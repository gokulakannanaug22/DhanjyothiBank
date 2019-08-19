package com.dhanjyothi.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class User {

	private int user_id;
	@NotEmpty(message = "Please enter your Login ID.")
	private String userName;
	@NotEmpty(message = "Please enter your password.")
	@Size(min = 8, max = 15, message = "Your password must between 8 and 15 characters")
	private String password;
	@Size(min = 8, max = 15, message = "Your password must between 8 and 15 characters")
	@NotEmpty(message = "Please enter your confirm password.")
	private String confirmPassword;
	private String user_role;
	private String user_status;
	@NotEmpty(message = "Please enter your first name.")
	private String first_name;
	@NotEmpty(message = "Please enter your last name.")
	private String last_name;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotEmpty(message = "Please enter your DOB.")
	//@Past(message = "DOB should not be todays date OR future Date")
	private String dob;
	@NotEmpty(message = "Please enter your Address.")
	private String add_line1;
	private String add_line2;
	@NotEmpty(message = "Please enter your City.")
	private String city;
	@NotEmpty(message = "Please enter your State.")
	private String state;

	@Email(message = "Invalid Email")
	@NotEmpty(message = "Email is mandatory")
	private String email_id;

	@NotEmpty(message = "PAN should not be empty")
	//@Size(min = 10, max = 10, message = "Invalid PAN")
	private String pan;

	@NotEmpty
	@Pattern(regexp = "^[0-9]{6}", message = "only 6 digits allowed")
	private String pin;

	@NotEmpty
	@Pattern(regexp = "^[0-9]{10}", message = "only 10 digits allowed")
	private String mobile_number;

	@NotEmpty
	@Pattern(regexp = "^[0-9]{16}", message = "only 1a6 digits allowed")
	private String aadhar_id;

	public User() {

	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	public String getUser_status() {
		return user_status;
	}

	public void setUser_status(String user_status) {
		this.user_status = user_status;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAdd_line1() {
		return add_line1;
	}

	public void setAdd_line1(String add_line1) {
		this.add_line1 = add_line1;
	}

	public String getAdd_line2() {
		return add_line2;
	}

	public void setAdd_line2(String add_line2) {
		this.add_line2 = add_line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getAadhar_id() {
		return aadhar_id;
	}

	public void setAadhar_id(String aadhar_id) {
		this.aadhar_id = aadhar_id;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	
	public User(int user_id, String userName, String password, String confirmPassword, String user_role,
			String user_status, String first_name, String last_name, String dob, String add_line1, String add_line2,
			String city, String state, String email_id, String pan, String pin, String mobile_number,
			String aadhar_id) {
		super();
		this.user_id = user_id;
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.user_role = user_role;
		this.user_status = user_status;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.add_line1 = add_line1;
		this.add_line2 = add_line2;
		this.city = city;
		this.state = state;
		this.email_id = email_id;
		this.pan = pan;
		this.pin = pin;
		this.mobile_number = mobile_number;
		this.aadhar_id = aadhar_id;
	}
}
