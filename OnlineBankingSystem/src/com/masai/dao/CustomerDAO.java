package com.masai.dao;


import java.util.List;

import com.masai.dto.Customer;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomeThingWrongException;

public interface CustomerDAO{
	
	public void addCustomer(Customer customer) throws SomeThingWrongException, NoRecordFoundException;
	
	List<Customer> getCustomerList() throws SomeThingWrongException, NoRecordFoundException;
	
	public void findByEmailIdAndPassword(String emailId, String password);
	
	public List<Customer> findByEmailId(String emailId) throws SomeThingWrongException, NoRecordFoundException;

	public void updateCustomer(Customer customer) throws SomeThingWrongException;

	public void Login(String username, String password) throws SomeThingWrongException, NoRecordFoundException; 
	
	public void logout();

	public void changePassword(String oldPassword, String newPassword)throws SomeThingWrongException, NoRecordFoundException;

	public void deleteCustomer(Integer id) throws SomeThingWrongException, NoRecordFoundException;

	

	
	
	
	
	

}