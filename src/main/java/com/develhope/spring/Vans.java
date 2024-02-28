package com.develhope.spring;

public class Vans extends Vehicles {
	public Vans(Long id, String type, String brand, String model, Integer displacement, String color, String power, String transmissionType, Integer yearOfRegistration, String fuelType, double price, double discountPrice, String accessories, String condition, Status status) {
		super(id, type, brand, model, displacement, color, power, transmissionType, yearOfRegistration, fuelType, price, discountPrice, accessories, condition, status);
	}
}