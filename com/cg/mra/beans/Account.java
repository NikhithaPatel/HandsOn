package com.cg.mra.beans;

public class Account {
private	String accountType;
private	String customerName;
private int AccountBalance;
public Account(String string,String string1,int i) {
	accountType=string;
    customerName=string1;
	AccountBalance=i;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getAccountBalance() {
	return AccountBalance;
}
public void setAccountBalance(int accountBalance) {
	AccountBalance = accountBalance;
}

}

