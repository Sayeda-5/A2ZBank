package com.masai.dao;


import com.masai.dto.Customer;
import com.masai.dto.CustomerImpl;

public interface CustomerDAO{
	
	public void findByEmailIdAndPassword(String emailId, String password);
	public void findByEmailId(String emailId);
	public void addCustomer(CustomerImpl customer);
	public void addCustomer(Customer customer);

}