package com.vehicle.dao;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;

import com.vehicle.beans.Customer;
import com.vehicle.beans.ValidityCheck;

public class VehicleInsuranceRegistrationDaoImpl implements VehicleInsuranceRegistrationDao {
	HashMap<String,Customer>map;
	public boolean vehicleInsuranceRegistration(Customer customer) {
		String vehicleNo=customer.getVehicleNo();
	    map=new HashMap<String,Customer>();
	    map.put(vehicleNo,new Customer(customer.getVehicleType(),customer.getAadharNumber(),customer.getMobileNumber(),customer.getInsurancePeriod()));
		return true;
	}

	public HashMap<String,ValidityCheck> insuranceValidityCheck(String vehicleNo,String date) {
		
	    String vehicleNo1=vehicleNo;
	    Customer validity=map.get(vehicleNo1);
	    String registerDate=date;
	   
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        String date1=formatter.format(registerDate);  
        
	    int insurancePeriod=validity.getInsurancePeriod();
	    int daysLeft=insurancePeriod * 365;
	    
	    
	    HashMap<String,ValidityCheck>map=new HashMap<String,ValidityCheck>();
	    map.put(vehicleNo1,new ValidityCheck(date1, daysLeft));
		return map;
	    
		
	}
	

}
