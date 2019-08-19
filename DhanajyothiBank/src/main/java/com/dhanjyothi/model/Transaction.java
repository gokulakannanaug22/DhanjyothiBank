package com.dhanjyothi.model;

import java.util.Date;

public class Transaction {

	private int tran_id;
	private int debit_acct;
	private int credit_acct;
	private String trn_desc;
	private double trn_amt;
	private Date trn_dt_time;
	
	public Transaction() {
		
	}
	
	
	public int getTran_id() {
		return tran_id;
	}
	public void setTran_id(int tran_id) {
		this.tran_id = tran_id;
	}
	public int getDebit_acct() {
		return debit_acct;
	}
	public void setDebit_acct(int debit_acct) {
		this.debit_acct = debit_acct;
	}
	public int getCredit_acct() {
		return credit_acct;
	}
	public void setCredit_acct(int credit_acct) {
		this.credit_acct = credit_acct;
	}
	public String getTrn_desc() {
		return trn_desc;
	}
	public void setTrn_desc(String trn_desc) {
		this.trn_desc = trn_desc;
	}
	public double getTrn_amt() {
		return trn_amt;
	}
	public void setTrn_amt(double trn_amt) {
		this.trn_amt = trn_amt;
	}
	public Date getTrn_dt_time() {
		return trn_dt_time;
	}
	public void setTrn_dt_time(Date trn_dt_time) {
		this.trn_dt_time = trn_dt_time;
	}
	
	@Override
	public String toString() {
		return "Transaction [tran_id=" + tran_id + ", debit_acct=" + debit_acct + ", credit_acct=" + credit_acct
				+ ", trn_desc=" + trn_desc + ", trn_amt=" + trn_amt + ", trn_dt_time=" + trn_dt_time + "]";
	}
	public Transaction(int tran_id, int debit_acct, int credit_acct, String trn_desc, double trn_amt,
			Date trn_dt_time) {
		super();
		this.tran_id = tran_id;
		this.debit_acct = debit_acct;
		this.credit_acct = credit_acct;
		this.trn_desc = trn_desc;
		this.trn_amt = trn_amt;
		this.trn_dt_time = trn_dt_time;
	}  
	
}
