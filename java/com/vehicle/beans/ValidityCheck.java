package com.vehicle.beans;

public class ValidityCheck {
	String date;
	int daysLeft;
	
	public ValidityCheck(String date,int datesLeft) {
		this.date=date;
		this.daysLeft=daysLeft;
	}
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getDaysLeft() {
		return daysLeft;
	}

	public void setDaysLeft(int daysLeft) {
		this.daysLeft = daysLeft;
	}

}
