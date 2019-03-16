package com.vehicle.beans;

public class Customer {
String vehicleNo,vehicleType;
long aadharNumber,mobileNumber;
int insurancePeriod;

public Customer(String vehicleType,long aadharNumber,long mobilreNumber,int insurancePeriod){
	
	this.vehicleType=vehicleType;
	this.aadharNumber=aadharNumber;
	this.mobileNumber=mobileNumber;
	this.insurancePeriod=insurancePeriod;
}
public String getVehicleNo() {
	return vehicleNo;
}
public void setVehicleNo(String vehicleNo) {
	this.vehicleNo = vehicleNo;
}
public String getVehicleType() {
	return vehicleType;
}
public void setVehicleType(String vehicleType) {
	this.vehicleType = vehicleType;
}
public long getAadharNumber() {
	return aadharNumber;
}
public void setAadharNumber(long aadharNumber) {
	this.aadharNumber = aadharNumber;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public int getInsurancePeriod() {
	return insurancePeriod;
}
public void setInsurancePeriod(int insurancePeriod) {
	this.insurancePeriod = insurancePeriod;
}

}
