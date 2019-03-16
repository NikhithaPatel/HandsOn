package com.vehicle.service;

import java.util.HashMap;

import com.vehicle.beans.Customer;
import com.vehicle.beans.ValidityCheck;
import com.vehicle.dao.VehicleInsuranceRegistrationDao;
import com.vehicle.dao.VehicleInsuranceRegistrationDaoImpl;

public class VehicleInsuranceRegistrationServiceImpl implements  VehicleInsuranceRegistrationService {
	VehicleInsuranceRegistrationDao dao=new VehicleInsuranceRegistrationDaoImpl();
	public boolean vehicleInsuranceRegistration(Customer customer) {
		
		return dao.vehicleInsuranceRegistration(customer);
	}
	public HashMap<String, ValidityCheck> insuranceValidatyCheck(String vehicleNumber,String date) {
		
		return dao.insuranceValidityCheck(vehicleNumber, date);
	}
	
}
