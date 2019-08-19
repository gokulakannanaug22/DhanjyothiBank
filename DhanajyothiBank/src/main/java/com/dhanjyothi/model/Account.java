package com.dhanjyothi.model;

import java.util.Date;

public class Account {

	private int acct_id;
	private int acct_holder_id;
	private String acct_type;
	private float int_rate;
	private double acc_balance;
	private int deposit_tenure;
	private double maturity_amt;
	private Date account_created_date;
	private Date account_updated_date;
	private String acc_status;
	
	private User user;

	public Account() {

	}

	public int getAcct_id() {
		return acct_id;
	}

	public void setAcct_id(int acct_id) {
		this.acct_id = acct_id;
	}

	public int getAcct_holder_id() {
		return acct_holder_id;
	}

	public void setAcct_holder_id(int acct_holder_id) {
		this.acct_holder_id = acct_holder_id;
	}

	public String getAcct_type() {
		return acct_type;
	}

	public void setAcct_type(String acct_type) {
		this.acct_type = acct_type;
	}

	public float getInt_rate() {
		return int_rate;
	}

	public void setInt_rate(float int_rate) {
		this.int_rate = int_rate;
	}

	

	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getDeposit_tenure() {
		return deposit_tenure;
	}

	public void setDeposit_tenure(int deposit_tenure) {
		this.deposit_tenure = deposit_tenure;
	}

	

	public double getMaturity_amt() {
		return maturity_amt;
	}

	public void setMaturity_amt(double maturity_amt) {
		this.maturity_amt = maturity_amt;
	}

	public Date getAccount_created_date() {
		return account_created_date;
	}

	public void setAccount_created_date(Date account_created_date) {
		this.account_created_date = account_created_date;
	}

	public Date getAccount_updated_date() {
		return account_updated_date;
	}

	public void setAccount_updated_date(Date account_updated_date) {
		this.account_updated_date = account_updated_date;
	}

	public String getAcc_status() {
		return acc_status;
	}

	public void setAcc_status(String acc_status) {
		this.acc_status = acc_status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Account(int acct_id, int acct_holder_id, String acct_type, float int_rate, long acc_balance,
			int deposit_tenure, long maturity_amt, Date account_created_date, Date account_updated_date,
			String acc_status, User user) {
		super();
		this.acct_id = acct_id;
		this.acct_holder_id = acct_holder_id;
		this.acct_type = acct_type;
		this.int_rate = int_rate;
		this.acc_balance = acc_balance;
		this.deposit_tenure = deposit_tenure;
		this.maturity_amt = maturity_amt;
		this.account_created_date = account_created_date;
		this.account_updated_date = account_updated_date;
		this.acc_status = acc_status;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Account [acct_id=" + acct_id + ", acct_holder_id=" + acct_holder_id + ", acct_type=" + acct_type
				+ ", int_rate=" + int_rate + ", acc_balance=" + acc_balance + ", deposit_tenure=" + deposit_tenure
				+ ", maturity_amt=" + maturity_amt + ", account_created_date=" + account_created_date
				+ ", account_updated_date=" + account_updated_date + ", acc_status=" + acc_status + ", user=" + user
				+ "]";
	}

	

}