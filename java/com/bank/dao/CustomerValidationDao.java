package com.bank.dao;

import com.bank.beans.CustomerDetails;

public interface CustomerValidationDao {
	CustomerDetails registration(long aadharNo1);
	 void login(String userId);

}
