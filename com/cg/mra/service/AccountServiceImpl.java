package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;

public class AccountServiceImpl implements AccountService {
	AccountDao account= new AccountDaoImpl();
	
	public Account getAccountDetails(String mobileNo) {
		
		return account.getAccountDetails(mobileNo);
	}

	
	public int rechargeAccount(String mobileNo, int rechargeAmount) {
		
		return account.rechargeAccount(mobileNo, rechargeAmount);
	}



}

