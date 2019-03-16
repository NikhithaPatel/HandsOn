package com.vehicle.dao;

import java.util.HashMap;

import com.vehicle.beans.Customer;
import com.vehicle.beans.ValidityCheck;

public interface VehicleInsuranceRegistrationDao {
	boolean vehicleInsuranceRegistration(Customer customer);
    HashMap<String, ValidityCheck> insuranceValidityCheck(String vehicleNo, String date);
}
