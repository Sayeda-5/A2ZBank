package com.masai.dao;


import java.util.List;

import com.masai.dto.Customer;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomeThingWrongException;
//import com.masai.dto.CustomerImpl;

public interface CustomerDAO{
	
	
	public void addCustomer(Customer customer) throws SomeThingWrongException;
	
	List<Customer> getCustomerList() throws SomeThingWrongException, NoRecordFoundException;
	
	
	
	public void deleteCustomer(Integer categoryId) throws SomeThingWrongException;
	
	public void findByEmailIdAndPassword(String emailId, String password);
	
	public void findByEmailId(String emailId);

	void updateCustomer(Customer customer) throws SomeThingWrongException;

	
	
	
	
	

}