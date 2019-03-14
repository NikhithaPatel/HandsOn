package com.bank.service;

import java.sql.SQLException;

import com.bank.beans.CustomerDetails;
import com.bank.dao.CustomerValidationDaoImpl;

public class CustomerValidationImpl implements  CustomerValidation {

	CustomerValidation dao=new CustomerValidationDaoImpl();
	@Override
	public CustomerDetails registration() throws SQLException {
	
		return dao.registration();
	}

	@Override
	public void login(String userId) {
		
		
	}

}
