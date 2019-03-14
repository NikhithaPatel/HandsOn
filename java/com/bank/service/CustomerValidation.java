package com.bank.service;

import java.sql.SQLException;

import com.bank.beans.CustomerDetails;

public interface CustomerValidation {
 CustomerDetails registration() throws SQLException;
 void login(String userId);
}
