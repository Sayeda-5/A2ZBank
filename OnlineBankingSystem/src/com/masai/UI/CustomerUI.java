package com.masai.UI;

import java.util.Scanner;

import com.masai.dao.CustomerDAO;
import com.masai.dao.CustomerDAOImpl;
import com.masai.dto.Customer;
import com.masai.dto.CustomerImpl;
import com.masai.exception.SomeThingWrongException;

public class CustomerUI {
	static CustomerDAO customerDAO;
	static Scanner scanner;
	
	CustomerUI(Scanner scanner){
		customerDAO = new CustomerDAOImpl();
		this.scanner = scanner;
	}
	
	public static void addCustomer() throws SomeThingWrongException {
		System.out.print("Enter Custumer id");
		int id = scanner.nextInt();
		System.out.print("Enter Custumer branch");
		int branchID = scanner.nextInt();
		System.out.print("Enter Custumer First Name");
		String firstName= scanner.next();
		System.out.print("Enter Custumer Last Name");
		String lastName= scanner.next();
		System.out.print("Enter Custumer Gender");
		String gender= scanner.next();
		System.out.print("Enter Custumer Address");
		String address= scanner.next();
		System.out.print("Enter Custumer email");
		String email= scanner.next();
		System.out.print("Enter Custumer date");
		String date= scanner.next();
		System.out.print("Enter Custumer phone");
		String phone = scanner.next();
		
		Customer customer = new CustomerImpl(id, branchID, firstName, lastName, gender , address, email, date, phone);
		
		System.out.print("Enter customer name ");
		customerDAO.addCustomer(customer);
		System.out.println("Category added successfully");
		
	}
}