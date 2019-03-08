package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;
import com.cg.mra.service.*;
import com.cg.mra.ui.MainUi;
import com.cg.mra.beans.Account;

public class AccountDaoImpl implements AccountDao {
	MainUi ui=new MainUi();
	Map<String,Account>accountEntry;
public AccountDaoImpl() {
	accountEntry=new HashMap<>();
	accountEntry.put("9010210131",new Account("prepaid","Vaishali",200));
	accountEntry.put("9823920123",new Account("prepaid","Megha",453));
	accountEntry.put("9932012345",new Account("prepaid","Vikas",631));
	accountEntry.put("9010210131",new Account("prepaid","Anju",521));
	accountEntry.put("9010210131",new Account("prepaid","Tushar",632));
}

public Account getAccountDetails(String mobileNo) {
	Account a=null;
	if(mobileNo.length()==10) {
		if(accountEntry.containsKey(mobileNo)) 
		 a= accountEntry.get(mobileNo);
		 System.out.println(a.getAccountBalance()); 
		}
		else {
			System.out.println("Error:Given Account Id Does Not Exists");
			
		}
	ui.display();
	return a;
	
	 }

public int rechargeAccount(String mobileNo, int rechargeAmount) {
	Account a=null;

	if(accountEntry.containsKey(mobileNo)) {
		 a=accountEntry.get(mobileNo);
		 int b= (a.getAccountBalance()+rechargeAmount);
	     a.setAccountBalance(b);
	     System.out.println("Your Account Recharged Successfully");
	     System.out.println("Hello"+" "+a.getCustomerName()+", Available Balance is "+a.getAccountBalance());
	}
	else 
		System.out.println("Error: Cannot Recharge Account As Given Mobile No Does Not Exists");
	ui.display();
	    return 0;
}
		
	

}

