package com.vehicle.service;

import java.util.HashMap;

import com.vehicle.beans.Customer;
import com.vehicle.beans.ValidityCheck;

public interface VehicleInsuranceRegistrationService {
boolean vehicleInsuranceRegistration(Customer customer);
HashMap<String,ValidityCheck> insuranceValidatyCheck(String vehicleNumber, String date);

}
