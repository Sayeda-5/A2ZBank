package com.masai.dto;

public class CustomerImpl implements Customer  { 
	
	private int id;
	private int branchId; 
	private String password;
    private String FirstName;
	private String LastName;
	private String gender;
	private String Address;
	private String phone;
	private String email;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public CustomerImpl(int id, int branchId, String password, String firstName, String lastName, String gender,
			String address, String phone, String email) {
		super();
		this.id = id;
		this.branchId = branchId;
		this.password = password;
		FirstName = firstName;
		LastName = lastName;
		this.gender = gender;
		Address = address;
		this.phone = phone;
		this.email = email;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", branchId=" + branchId + ", password=" + password + ", FirstName=" + FirstName
				+ ", LastName=" + LastName + ", gender=" + gender + ", Address=" + Address + ", phone=" + phone
				+ ", email=" + email + ", date=" + date + "]";
	}
	
	
}
