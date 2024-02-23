package com.develhope.spring;

import java.util.Date;

public class Rent {
Date startRent;
Date endRent;
double dailyRent;
double totalRent;
boolean payed;
String rentedVehicle;

	public Rent(Date startRent, Date endRent, double dailyRent, double totalRent, boolean payed, String rentedVehicle) {
		this.startRent = startRent;
		this.endRent = endRent;
		this.dailyRent = dailyRent;
		this.totalRent = totalRent;
		this.payed = payed;
		this.rentedVehicle = rentedVehicle;
	}

	public Date getStartRent() {
		return startRent;
	}

	public void setStartRent(Date startRent) {
		this.startRent = startRent;
	}

	public Date getEndRent() {
		return endRent;
	}

	public void setEndRent(Date endRent) {
		this.endRent = endRent;
	}

	public double getDailyRent() {
		return dailyRent;
	}

	public void setDailyRent(double dailyRent) {
		this.dailyRent = dailyRent;
	}

	public double getTotalRent() {
		return totalRent;
	}

	public void setTotalRent(double totalRent) {
		this.totalRent = totalRent;
	}

	public boolean isPayed() {
		return payed;
	}

	public void setPayed(boolean payed) {
		this.payed = payed;
	}

	public String getRentedVehicle() {
		return rentedVehicle;
	}

	public void setRentedVehicle(String rentedVehicle) {
		this.rentedVehicle = rentedVehicle;
	}
}
