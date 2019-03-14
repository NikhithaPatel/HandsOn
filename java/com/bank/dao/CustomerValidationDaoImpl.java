package com.bank.dao;
import com.bank.beans.CustomerDetails;
import com.bank.service.CustomerValidation;
import com.bank.utility.*;
import java.sql.*;
import java.util.Scanner;


public class CustomerValidationDaoImpl implements  CustomerValidation {
	OracleConnection connect=new OracleConnection();
	Connection connect1=connect.dataConnection();
    Scanner sc= new Scanner(System.in);
	CustomerDetails customer=new CustomerDetails(0, 0, 0, null, null, null, null, null);
	public CustomerDetails registration() throws SQLException {
	long aadhar=customer.getAadharNo();
	PreparedStatement ps=connect1.prepareStatement("select aadhar_no from customerdetails");
	ResultSet rs=ps.executeQuery();	
	while(rs.next()) {
		long aadharNos=rs.getLong("aadhar_no");
		if(Long.compare(aadhar, aadharNos)==0) {
			//("Customer Already Exits ");
		}else {
			PreparedStatement ps1=connect1.prepareStatement("insert into customerdetails (first_name,last_name,"
					+ "email_id,password,pancard_no,aadhar_no,address,mobile_no,balance) values(?,?,?,?,?,?,?,?,?)");
			ps1.setString(1,customer.getFirstName());
			ps1.setString(2,customer.getLastName());
			ps1.setString(3,customer.getEmailId());
			ps1.setString(4,customer.getPassword());
			ps1.setLong(5,customer.getPancardNo());
			ps1.setLong(6,customer.getAadharNo());
			ps1.setString(7,customer.getAddress());
			ps1.setLong(8,customer.getMobileNo());
			ps1.setFloat(9,customer.getBalance());
		}
	
			
	}
	return customer;
	
	}

	@Override
	public void login(String userId) {
		
		
	}

}
