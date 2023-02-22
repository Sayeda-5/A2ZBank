package com.masai.dto;

public class AccountTransaction {
	
    private int id;
	private int accountId;
	private int toAccId;
	private double amount;
	private String date;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getToAccountId() {
		return toAccId;
	}
	public void setToAccountId(int toAccountId) {
		this.toAccId = toAccountId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public AccountTransaction(int id, int accountId, int toAccountId, double amount, String date, String type) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.toAccId = toAccountId;
		this.amount = amount;
		this.date = date;
		this.type = type;
	}
	public AccountTransaction() {
		super();
	}
	@Override
	public String toString() {
		return "AccountTransaction [id=" + id + ", accountId=" + accountId + ", toAccountId=" + toAccId
				+ ", amount=" + amount + ", date=" + date + ", type=" + type + "]";
	}
	
	
	
	
	
}
