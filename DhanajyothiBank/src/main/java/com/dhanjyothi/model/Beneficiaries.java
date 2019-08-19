package com.dhanjyothi.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Beneficiaries {
	
	private int benId;
	private int ownerID;
	private String benType;
	@NotEmpty(message = "Please enter Beneficiary Nick Name.")
	private String benNickName;
	@NotEmpty(message = "Please enter Beneficiary Name.")
	private String benName;
	@NotEmpty(message = "Please enter Beneficiary Account Number.")
	//@Size(min = 1, max = 12, message = "Account no should not exceed 12 digit")
	private String benAccNumber;
	private String benBank;
	private String benBankIfsc;
	public int getBenId() {
		return benId;
	}
	public void setBenId(int benId) {
		this.benId = benId;
	}
	public int getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}
	public String getBenType() {
		return benType;
	}
	public void setBenType(String benType) {
		this.benType = benType;
	}
	public String getBenNickName() {
		return benNickName;
	}
	public void setBenNickName(String benNickName) {
		this.benNickName = benNickName;
	}
	public String getBenName() {
		return benName;
	}
	public void setBenName(String benName) {
		this.benName = benName;
	}
	
	public String getBenAccNumber() {
		return benAccNumber;
	}
	public void setBenAccNumber(String benAccNumber) {
		this.benAccNumber = benAccNumber;
	}
	public String getBenBank() {
		return benBank;
	}
	public void setBenBank(String benBank) {
		this.benBank = benBank;
	}
	public String getBenBankIfsc() {
		return benBankIfsc;
	}
	public void setBenBankIfsc(String benBankIfsc) {
		this.benBankIfsc = benBankIfsc;
	}
	
	
	
	public Beneficiaries() {
		
	}
	@Override
	public String toString() {
		return "Beneficiaries [benId=" + benId + ", ownerID=" + ownerID + ", benType=" + benType + ", benNickName="
				+ benNickName + ", benName=" + benName + ", benAccNumber=" + benAccNumber + ", benBank=" + benBank
				+ ", benBankIfsc=" + benBankIfsc + "]";
	}
	public Beneficiaries(int benId, int ownerID, String benType, String benNickName, String benName,
			String benAccNumber, String benBank, String benBankIfsc) {
		super();
		this.benId = benId;
		this.ownerID = ownerID;
		this.benType = benType;
		this.benNickName = benNickName;
		this.benName = benName;
		this.benAccNumber = benAccNumber;
		this.benBank = benBank;
		this.benBankIfsc = benBankIfsc;
	}
	
	
}
