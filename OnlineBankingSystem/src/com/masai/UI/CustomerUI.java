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
	
	public static void addCustomer(){
		System.out.print("Enter Custumer id");
		int id = scanner.nextInt();
		
		System.out.print("Enter Custumer branch");
		int branchID = scanner.nextInt();
		
		System.out.print("Enter Custumer First Name");
		String firstName= scanner.next();
		
		System.out.print("Enter Custumer Last Name");
		String lastName = new String();
		
		System.out.print("Enter Custumer Gender");
		String gender= scanner.next();
		
		System.out.print("Enter Custumer Address");
		String address= scanner.next();
		
		System.out.print("Enter Custumer phone");
		String phone = scanner.next();
		
		System.out.print("Enter Custumer email");
		String email= scanner.next();
		
		System.out.print("Enter Custumer date");
		String date= scanner.next();
		
		
		Customer customer = new CustomerImpl();
		
		System.out.print("Enter customer name ");
		try {
			customerDAO.addCustomer(customer);
			System.out.println("Customr Added Successfully");
		} catch (SomeThingWrongException e) {
			
			System.out.println(e);
		}
		
	}
	public static void updateCustomer() {
		System.out.println("ILY");
	}

	public static void getCustomerList() {
		// TODO Auto-generated method stub
		System.out.print("Enter Custumer id");
		
	}
}