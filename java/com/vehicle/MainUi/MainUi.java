package com.vehicle.MainUi;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.vehicle.beans.Customer;
import com.vehicle.service.VehicleInsuranceRegistrationService;
import com.vehicle.service.VehicleInsuranceRegistrationServiceImpl;

public class MainUi {
	VehicleInsuranceRegistrationService service=new VehicleInsuranceRegistrationServiceImpl();
	Customer customer=new Customer( null, 0, 0, 0);
	public void display() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\nMenu");
		System.out.println("\n1.Vehicle Insurance Registration \n2.Insurance Validity Check");
		int choice=sc.nextInt();
		
		switch(choice){
		case 1:
				System.out.println("Enter vehicle number:");
				customer.setVehicleNo(sc.next());
				System.out.println("Enter vehicle type:");
				customer.setVehicleType(sc.next());
				System.out.println("Enter aadharcard number:");
				customer.setAadharNumber(sc.nextLong());
				System.out.println("Enter mobile number:");
				customer.setMobileNumber(sc.nextLong());
				System.out.println("Enter insurance period");
				customer.setInsurancePeriod(sc.nextInt());
				if(service.vehicleInsuranceRegistration(customer))
					System.out.println("Registered successfully");
				
				break;
		case 2: System.out.println("Enter vehicle number");
		        String vehicleNumber=sc.next();
		        System.out.println("Enter date of registration:");
		        String date=sc.next();
		        service.insuranceValidatyCheck(vehicleNumber,date);
				break;
		}
	}

	public static void main(String[] args) {
		MainUi ui=new MainUi();
		ui.display();
	}

	
}
