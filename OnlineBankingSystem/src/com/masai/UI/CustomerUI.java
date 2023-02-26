package com.masai.UI;


import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.masai.dao.CustomerDAO;
import com.masai.dao.CustomerDAOImpl;
import com.masai.dto.Customer;
import com.masai.dto.CustomerImpl;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomeThingWrongException;

public class CustomerUI {
	static CustomerDAO customerDAO;
	static Scanner scanner;
	
	CustomerUI(Scanner scanner){
		customerDAO = new CustomerDAOImpl();
		this.scanner = scanner;
	}
	
	public static void addCustomer() throws NoRecordFoundException{
		System.out.print("Enter Custumer userid");
		int id = scanner.nextInt();
		
		System.out.print("Enter Custumer branch");
		int branchID = scanner.nextInt();
		
		System.out.print("Enter Custumer First Name");
		String firstName= scanner.next();
		
		System.out.print("Enter Custumer Last Name");
		String lastName = scanner.next();
		
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
		
		
		try {
			customerDAO.addCustomer(customer);
			System.out.println("Customr Added Successfully");
		} catch (SomeThingWrongException e) {
			
			System.out.println(e);
		}
		
	}
	public static void updateCustomer() {
		System.out.print("Enter customer id ");
		int id = scanner.nextInt();
		
		System.out.print("Enter customer password ");
		String password = scanner.next();
		
		System.out.print("Enter customer Branch ");
		int branchID = scanner.nextInt();
		
		System.out.print("Enter customer name ");
		String firstName = scanner.next();
		
		System.out.print("Enter customer last name ");
		String lastName = scanner.next();
		
		System.out.print("Enter customer gender ");
		String gender = scanner.next();
		
		System.out.print("Enter customer Adress ");
		String address = scanner.next();
		
		System.out.print("Enter customer Phone number ");
		String phone = scanner.next();
		
		System.out.print("Enter customer Email ");
		String email = scanner.next();
		
		System.out.print("Enter customer date ");
		String date = scanner.next();
		
		
		//create object for category with category id and name
		Customer customer = new CustomerImpl(id, branchID,password, firstName, lastName, gender, address, phone, email, date);
		
		try {
			customerDAO.updateCustomer(customer);
			System.out.println("Customer updated successfully");
		}catch(SomeThingWrongException ex) {
			System.out.println(ex);
		}
	}

	public static void getCustomerList() {
		// TODO Auto-generated method stub
		try {
			List<Customer> list = customerDAO.getCustomerList();
			list.forEach(System.out::println);
		}catch(SomeThingWrongException | NoRecordFoundException ex) {
			System.out.println(ex);
		}
		
	}

	public static void deleteCustomer() {
		// TODO Auto-generated method stub
		System.out.print("Enter customer id ");
		int Id = scanner.nextInt();
		
		try {
			customerDAO.deleteCustomer(Id);
			System.out.println("Customer deleted successfully");
		}catch(SomeThingWrongException | NoRecordFoundException ex) {
			System.out.println(ex);
		}
		
		
	}

	public void findByEmailId() {
		// TODO Auto-generated method stub
		
		
	}
	public void changePassword() {
		//code to take input new name
		System.out.print("Enter old password ");
		String oldPassword = scanner.next();
		
		System.out.print("Enter new password ");
		String newPassword = scanner.next();
		
		System.out.print("Re-type new password ");
		String newPasswordAgain = scanner.next();
		if(newPassword.equals(newPasswordAgain)) {
			try {
				customerDAO.changePassword(oldPassword, newPassword);
				System.out.println("Password updated successfully");
			}catch(SomeThingWrongException | NoRecordFoundException ex) {
				System.out.println(ex);
			}			
		}else {
			System.out.println("New password mismatched with re-typed new password");
		}
	}
	
	public boolean login() throws NoRecordFoundException {
		boolean loginSuccessful = false;
		//code to take input username and password
		System.out.print("Enter username ");
		String username = scanner.next();
		
		System.out.print("Enter password ");
		String password = scanner.next();
		
		try {
			customerDAO.Login(username, password);
		} catch (SomeThingWrongException | NoRecordFoundException e) {
			
			e.printStackTrace();
		}
		loginSuccessful = true;
		return loginSuccessful;
	}
	
	public void logout() {
		customerDAO.logout();
		
	}

	public void viewAccout() {
		// TODO Auto-generated method stub
		
	}

	public void updateNameOfUser() {
		// TODO Auto-generated method stub
		System.out.print("Enter name ");
		String name = scanner.next();
		
		try {
			customerDAO.updateNameOfUser(name);
			System.out.println("Name updated successfully");
		}catch(SomeThingWrongException ex) {
			System.out.println(ex);
		}
		
	}

	public void deleteUser() {
		// TODO Auto-generated method stub
		try {
			customerDAO.deleteUser();
			System.out.println("You are Logged out.\nDeleted your account");
		}catch(SomeThingWrongException ex) {
			System.out.println(ex);
		}
		
	}

	public void createaccout() {
		// TODO Auto-generated method stub
		System.out.print("Enter Custumer userid");
		int id = scanner.nextInt();
		
		System.out.print("Enter Custumer branch");
		int branchID = scanner.nextInt();
		
		System.out.print("Enter Custumer First Name");
		String firstName= scanner.next();
		
		System.out.print("Enter Custumer Last Name");
		String lastName = scanner.next();
		
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
		
		
		//create object for user with all details
		Customer user = new CustomerImpl();
		
		try {
			customerDAO.createaccout(user);;
			System.out.println("User registered successfully");
		}catch(SomeThingWrongException ex) {
			System.out.println(ex);
		}
		
	}

	
}