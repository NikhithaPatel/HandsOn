package com.cg.mra.ui;
import com.cg.mra.service.*;
import java.util.Scanner;
import com.cg.mra.dao.*;
public class MainUi {


public static 	void display() {
	    AccountService service=new AccountServiceImpl();
		MainUi ui=new MainUi();
		System.out.println("Menu");
		System.out.println("1.Account Balance Enquiry \n 2.Recharge Account \n 3.Exit");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch (ch) {
		case 1:System.out.println("enter the mobile number");
		       String mobileNo = sc.next();
	           service.getAccountDetails( mobileNo);
			break;
			
		case 2:
			   System.out.println("enter the mobile number");
		       String mobileNo1 = sc.next();
		       System.out.println("enter recharge amount");
		       int rechargeAmount=sc.nextInt();
	           service.rechargeAccount( mobileNo1,rechargeAmount);
			break;
		case 3:System.exit(0);
			break;
		default:System.out.println("enter correct choice");
			break;			
		}
		
	}

	public static void main(String[] args) {
	
	display();

	}

}

