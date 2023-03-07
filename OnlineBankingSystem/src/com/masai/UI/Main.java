package com.masai.UI;

import java.util.Scanner;

import com.masai.dao.CustomerDAOImpl;
import com.masai.dto.Customer;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomeThingWrongException;

public class Main {
	
	public static final String BACKGROUND= "\u001B[47m";
	private static CustomerUI customerUI;
	
	public static void main(String[] args) throws Exception {
		String banner ="oooooooooo.        .o.       ooooo      ooo oooo    oooo ooooo ooooo      ooo   .oooooo.    \n"
			+ "`888'   `Y8b      .888.      `888b.     `8' `888   .8P'  `888' `888b.     `8'  d8P'  `Y8b   \n"
			+ " 888     888     .8\"888.      8 `88b.    8   888  d8'     888   8 `88b.    8  888           \n"
			+ " 888oooo888'    .8' `888.     8   `88b.  8   88888[       888   8   `88b.  8  888           \n"
			+ " 888    `88b   .88ooo8888.    8     `88b.8   888`88b.     888   8     `88b.8  888     ooooo \n"
			+ " 888    .88P  .8'     `888.   8       `888   888  `88b.   888   8       `888  `88.    .88'  \n"
			+ "o888bood8P'  o88o     o8888o o8o        `8  o888o  o888o o888o o8o        `8   `Y8bood8P'   \n"
			+ "                                                                                            \n"
			+ "                                                                                            \n"
			+ "                                                                                            \n";
	
		Scanner sc = new Scanner(System.in);
		customerUI = new CustomerUI(sc);
		int choice = 0;
		
		do {
			System.out.println(BACKGROUND
                    + "\n                            DEVELOPED BY SIDRA SYED\n"
                    
                    
                    + BACKGROUND);
			System.out.println("\033[1;95m" +banner+ BACKGROUND);
			System.out.println("1. Admin Login\n2. Customer Login\n0. Exit");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					adminLogin(sc);
					break;
				case 2:
					customerLogin(sc);
					break;
				case 0:
					System.out.println("Thank you visit again");
				default:
					System.out.println("Invalid Selection, try again");
			}
		}
		while(choice != 0);
		sc.close();
	}


	static void adminLogin(Scanner sc) throws SomeThingWrongException, NoRecordFoundException {
		System.out.print("Enter username ");
		String username = sc.next();
		System.out.print("Enter password ");
		String password = sc.next();
		
		if(username.equalsIgnoreCase("Sidra") && password.equalsIgnoreCase("Sidra123")) {
			adminMenu(sc);
		}else {
			System.out.println("Invalid Username and Password");
		}
	}

	
	
	static void adminMenu(Scanner sc) throws NoRecordFoundException {
		int choice = 0;
		do {
			printAdminMenu();
			System.out.print("Enter selection ");
			choice = sc.nextInt();
			switch(choice) {
			    case 0:
			    	System.out.println("Bye");
				case 1:
					customerUI.addCustomer();
					break;
				case 2:
					customerUI.getCustomerList();
					break;
				case 3:
					customerUI.updateCustomer();
					break;
				case 4:
					customerUI.deleteCustomer();
					break;
				case 5:
					System.out.println("Invalid");
				case 6:
					customerUI.findByEmailId();
					break;
                default:
                	System.out.println("Invalid");
				
			}
		}
		while(choice != 0);
	}

	

	private static void printAdminMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. Add new Customer");
		System.out.println("2. View All Customer");
		System.out.println("3. Update a Customer");
		System.out.println("4. Delete a Customer");
		System.out.println("5. Search Customer by Account Number");
		System.out.println("6. Search Customer by Id");
		System.out.println("0. for Exit");
		
		
	}

	static void customerLogin(Scanner sc) throws NoRecordFoundException {
		if(!customerUI.login())
		return;
	int choice = 0;
	do {
		displayCustomerMenu();
		System.out.print("Enter selection ");
		choice = sc.nextInt();
		switch(choice) {
			case 1:
				customerUI.viewAccout();
				break;
			case 2:
				customerUI.updateNameOfUser();
				break;
			case 3:
				customerUI.changePassword();
				break;
			case 5:
				customerUI.createaccout();
			case 4:
				customerUI.deleteUser();
				try{
					Thread.sleep(2000);
				}catch(InterruptedException ex) {
					
				}
				case 0:
				customerUI.logout();
				break;
			default:
				System.out.println("Invalid Selection, try again");
		}
	}
	while(LoggedINUser.loggedInUserId != 0);
}

	private static void displayCustomerMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. View Accout");
		System.out.println("2. Update My Name");
		System.out.println("3. Update My Password");
		System.out.println("4. Delete My Account");
		System.out.println("0. Logout");
		
	}

}
