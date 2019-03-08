package com.cg.mra.dao;
import com.cg.mra.service.*;
import com.cg.mra.beans.Account;

public interface AccountDao {
Account getAccountDetails(String mobileNo);
int rechargeAccount(String mobileNo,int rechargeAmount);
}

