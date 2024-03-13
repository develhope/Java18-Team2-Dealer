package com.develhope.spring.Vehicles.EntityofVehicles;


public class Car extends Vehicles {
	public Car(Long id, String brand, String model, Integer displacement, String color, String power, String transmissionType, Integer yearOfRegistration, String fuelType, double price, double discountPrice, String accessories, String condition, Status status) {
		super(id, brand, model, displacement, color, power, transmissionType, yearOfRegistration, fuelType, price, discountPrice, accessories, condition, status);
	}
}
