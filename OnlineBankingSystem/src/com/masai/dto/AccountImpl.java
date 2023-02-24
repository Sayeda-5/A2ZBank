package com.masai.dto;

public class AccountImpl {
    private int id;
	private int custId;
	private String date;
	private double balance;
	private int pin;
	private String cardNo;
	private String type;
	private String status;
	
	public AccountImpl() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return custId;
	}

	public void setCustId(int customerId) {
		this.custId = customerId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", customerId=" + custId + ", date=" + date + ", balance=" + balance + ", pin="
				+ pin + ", cardNo=" + cardNo + ", type=" + type + ", status=" + status + "]";
	}
	
	
	
	
	
	
	
	
}
