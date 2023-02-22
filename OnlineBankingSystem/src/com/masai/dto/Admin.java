package com.masai.dto;

public class Admin {

	private int id;
	private String userId;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin(int id, String userId, String password) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", userId=" + userId + ", password=" + password + "]";
	}
	
}
