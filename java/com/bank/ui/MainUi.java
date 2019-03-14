package com.bank.ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.bank.beans.CustomerDetails;
import com.bank.service.*;

public class MainUi {
	
	void display() throws SQLException {
		CustomerValidation service1=new CustomerValidationImpl();
		CustomerDetails customer=new CustomerDetails(0, 0, 0, null, null, null, null, null);
		Scanner sc=new Scanner(System.in);
		System.out.println("\nMenu");
		System.out.println("\n1.Customer Validation \n2.Transaction");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			   System.out.println("\n1.Registration \n2.Login");
		       int option=sc.nextInt();
		       switch (option) {
		       case 1: System.out.println("Enter first name");
		               customer.setFirstName(sc.next());
		               System.out.println("Enter last name");
		               customer.setLastName(sc.next());
		               System.out.println("Enter email id");
		               customer.setEmailId(sc.next());
		               System.out.println("Enter password");
		               customer.setPassword(sc.next());
		               System.out.println("Enter pancard number");
		               customer.setPancardNo(sc.nextLong());
		    	   	   System.out.println("Enter aadhar number");
		    	   	   customer.setAadharNo(sc.nextLong());
		    	   	   System.out.println("Enter address");
		    	   	   customer.setAddress(sc.next());
		    	   	   System.out.println("Enter mobile number");
		    	   	   customer.setMobileNo(sc.nextLong());
		    	   	   customer=service1.registration();
		    	   	   System.out.println(customer.getEmailId());
		    	   	   System.out.println(customer.getPassword());
		       		   break;
		       case 2: 
		    	   	   System.out.println("Enter email id");
		    	   	   String userId=sc.next();
		    	       service1.login(userId);
		       		   break;
		       }
			   break;
		case 2:
			   break;
		case 3:
			System.exit(0);
		case 4:
			System.out.println("Invalid choice");
		}
	}

	public static void main(String[] args) throws SQLException {
	MainUi ui=new MainUi();
	ui.display();

	}

}
