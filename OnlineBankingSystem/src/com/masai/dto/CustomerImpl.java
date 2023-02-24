package com.masai.dto;

//import java.util.Objects;

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
	
	
	
	
	public CustomerImpl() {}
	
	public CustomerImpl(int id, int branchId, String password, String firstName, String lastName, String gender,
			String address, String phone, String email, String date) {
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
	public CustomerImpl(String string) {
		// TODO Auto-generated constructor stub
	}
	
	public void CustomerImpl1(int id2, int branchID2, String password2, String firstName2, String lastName2, String gender2,
			String address2, String phone2, String email2, String date2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerImpl other = (CustomerImpl) obj;
		return id==id;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", branchId=" + branchId + ", password=" + password + ", FirstName=" + FirstName
				+ ", LastName=" + LastName + ", gender=" + gender + ", Address=" + Address + ", phone=" + phone
				+ ", email=" + email + ", date=" + date + "]";
	}
	
	
	@Override
	public String getemail() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setID(int int1) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setBranchID(int int1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getBranchID() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
