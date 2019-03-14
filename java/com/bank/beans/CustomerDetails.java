package com.bank.beans;

public class CustomerDetails {
long accountNo,mobileNo,aadharNo,pancardNo;
String firstName, lastName,emailId,password,address;
float balance;
public CustomerDetails(long phoneNo,long aadhar,long pancard,String fName,String lName,String email,String password1,String address1){
    mobileNo=phoneNo;
	aadharNo=aadhar;
	pancardNo=pancard;
	firstName=fName;
	lastName=lName;
	emailId=email;
	password=password1;
	address=address1;
}
public long getAadharNo() {
	return aadharNo;
}
public void setAadharNo(long aadharNo) {
	this.aadharNo = aadharNo;
}
public long getPancardNo() {
	return pancardNo;
}
public void setPancardNo(long pancardNo) {
	this.pancardNo = pancardNo;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}

}
